package gg.xp.xivsupport.gui.tabs;

import gg.xp.xivsupport.gui.extra.TabDef;
import gg.xp.xivsupport.gui.util.GuiUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class SmartTabbedPane extends JTabbedPane implements TabAware {

	private static final Logger log = LoggerFactory.getLogger(SmartTabbedPane.class);
	private static final Color warningTabColor = new Color(62, 27, 27);

	public SmartTabbedPane() {
	}

	public SmartTabbedPane(int tabPlacement) {
		super(tabPlacement);
	}

	public SmartTabbedPane(int tabPlacement, int tabLayoutPolicy) {
		super(tabPlacement, tabLayoutPolicy);
	}

	public List<Component> getTabs() {
		int count = getTabCount();
		List<Component> out = new ArrayList<>(count);
		for (int i = 0; i < count; i++) {
			out.add(getComponent(i));
		}
		return out;
	}

	private static final class DummyMarkerComponent extends Component {

		private final Supplier<Component> actualComponentFunction;

		private DummyMarkerComponent(Supplier<Component> actualComponentFunction) {
			this.actualComponentFunction = actualComponentFunction;
		}

		private Component getActualComponent() {
			return actualComponentFunction.get();
		}
	}

//	@Override
//	public Component getComponent(int n) {
//		Component component = super.getComponent(n);
////		if (component instanceof DummyMarkerComponent dmc) {
////			Component realComponent = dmc.getActualComponent();
////			setComponentAt(n, realComponent);
////			return realComponent;
////		}
//		return component;
//	}

	@Override
	public void setSelectedIndex(int index) {
		super.setSelectedIndex(index);
		Component tabAt = getComponentAt(index);
		if (tabAt instanceof DummyMarkerComponent dmc) {
			log.info("Replacing tab at index {}", index);
			SwingUtilities.invokeLater(() -> {
				GuiUtil.displayWaitCursorWhile(this, () -> {
					setComponentAt(index, dmc.getActualComponent());
				});
			});
		}
	}

	private final Map<Object, Integer> registeredKeys = new HashMap<>();

	// TODO: doesn't work if tabs are removed or rearranged after the fact
	public void addTab(TabDef def) {
		addTab(def.getTabName(), def.getTabContents());
		int i = getTabCount() - 1;
		def.keys().forEach(k -> {
			registeredKeys.put(k, i);
		});
	}

	public void addTabLazy(TabDef def) {
		int i = addTabLazy(def.getTabName(), def::getTabContents);
		def.keys().forEach(k -> {
			registeredKeys.put(k, i);
		});
	}

	public void selectTabByKey(Object key) {
		Integer index = registeredKeys.get(key);
		if (index != null) {
			setSelectedIndex(index);
		}
		else {
			log.warn("No mapping for key: ({})", key);
		}
	}

	public int addTabLazy(String title, Supplier<Component> componentFunc) {
		addTab(title, new DummyMarkerComponent(componentFunc));
		int index = getTabCount() - 1;
		registeredKeys.put(title, index);
		return index;
	}

	@Override
	public void addTab(String title, Component component) {
		super.addTab(title, component);
		int index = getTabCount() - 1;
		registeredKeys.put(title, index);
	}

	@Override
	public boolean hasWarning() {
		return Arrays.stream(getComponents()).anyMatch(tab -> (tab instanceof TabAware aware && aware.hasWarning()));
	}

	public void recheckTabs() {
		SwingUtilities.invokeLater(this::repaint);
		notifyParents();
	}

	@Override
	public Color getBackgroundAt(int index) {
		Component comp = getComponentAt(index);
		if (comp instanceof TabAware tabAware && tabAware.hasWarning()) {
			return warningTabColor;
		}
		return super.getBackgroundAt(index);
	}
}
