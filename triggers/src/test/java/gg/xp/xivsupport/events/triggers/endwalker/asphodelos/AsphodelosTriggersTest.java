package gg.xp.xivsupport.events.triggers.endwalker.asphodelos;

import gg.xp.xivsupport.events.triggers.util.CalloutInitialValues;
import gg.xp.xivsupport.events.triggers.util.CalloutVerificationTest;

import java.util.List;

public class AsphodelosTriggersTest extends CalloutVerificationTest {

	@Override
	protected String getFileName() {
		return "/asphodelos1.log";
	}

	@Override
	protected final List<CalloutInitialValues> getExpectedCalls() {
		return List.of(
				// P1S
				callAppend(8_957, "Tankbuster", "(4.7)"),
				callAppend(19_925, "Shackles", "(2.7)"),
				callAppend(23_750, "Out", "(13.0)"),
				callAppend(27_050, "Raidwide", "(4.7)"),
				callAppend(46_354, "Out then In", "(11.2)"),
				callAppend(67_166, "Buster, Knockback, Flare", "(4.7)"),
				callAppend(79_684, "Left to Right", "(11.2)"),
				callAppend(100_453, "Raidwide", "(4.7)"),
				callAppend(124_569, "Bottom First", "(9.7)"),
				callAppend(136_742, "Raidwide", "(4.7)"),
				callAppend(146_901, "Raidwide", "(4.7)"),
				callAppend(163_110, "Buster, Knockback, Stack", "(4.7)"),
				callAppend(181_833, "Raidwide", "(6.7)"),
				call(197_697, "Fire Safe"),
				callAppend(219_584, "Buster, Knockback, Stack", "(4.7)"),
				call(232_993, "Light Safe"),
				callAppend(256_561, "Stack with Party", "(14.0)"),
				callAppend(260_880, "Tankbuster", "(4.7)"),
				callAppend(272_092, "Raidwide", "(6.7)"),
				callAppend(295_753, "Out 4", "(18.0)"),
				callAppend(324_083, "Raidwide", "(4.7)"),
				callAppend(348_047, "Top First", "(9.7)"),
				callAppend(362_214, "Out then In", "(11.2)"),
				callAppend(384_988, "Raidwide", "(4.7)"),
				callAppend(401_211, "Raidwide", "(6.7)"),
				callAppend(419_259, "Stack with Party", "(14.0)"),
				callAppend(420_595, "Buster, Knockback, Flare", "(4.7)"),


				// P2S
				callAppend(10_867, "Raidwide", "(4.7)"),
				callAppend(33_592, "Raidwide", "(4.7)"),
				callAppend(53_558, "Go Behind Head", "(7.7)"),
				callAppend(92_988, "Raidwide", "(4.7)"),
				callAppend(134_744, "Stack on YOU", "(23.0)"),
				callAppend(143_256, "Go In Front of Head", "(7.7)"),
				callAppend(171_953, "Short East Push", "(13.0)"),
				callAppend(206_354, "Raidwide", "(4.7)"),
				callAppend(223_170, "Raidwide", "(4.7)"),
				call(250_120, "Blue 3"),
				callAppend(285_314, "Raidwide", "(4.7)"),
				callAppend(304_875, "Short West Push", "(13.0)"),
				callAppend(328_532, "Spread", "(4.7)"),
				callAppend(336_682, "Go Behind Head", "(7.7)"),
				callAppend(364_855, "Stack on WTM Main", "(23.0)"),
				callAppend(380_279, "Go In Front of Head", "(7.7)"),
				call(380_503, "West Safe"),
				call(411_164, "East Safe"),
				callAppend(422_667, "Spread", "(4.7)"),
				callAppend(455_986, "Raidwide", "(4.7)"),
				callAppend(473_811, "Raidwide", "(4.7)"),
				callAppend(496_445, "Short South Push", "(13.0)"),

				// P3S
				callAppend(8_948, "Raidwide", "(4.7)"),
				call(17_102, "Tank Tethers", "Tank Tethers (5.7)"),
				call(29_262, "Middle then Out", "Middle then Out"),
				call(39_903, "Go Right", "Go Right (4.7)"),
				call(53_092, "Partners", "Partners (5.7)"),
				call(64_155, "2", "2"),
				call(90_697, "Tank Tethers", "Tank Tethers (5.7)"),
				call(99_838, "Raidwide", "Raidwide (4.7)"),
				call(117_178, "Middle then Out", "Middle then Out"),
				call(135_474, "Go Left", "Go Left (4.7)"),
				call(143_624, "Tank Tethers", "Tank Tethers (5.7)"),
				call(152_752, "Middle then Out", "Middle then Out"),
				call(166_122, "Sides and Spread", "Sides and Spread"),
				call(216_018, "Tethered to North bird and RDM Main", "Tethered to North bird and RDM Main"),
				call(277_361, "Big Raidwide", "Big Raidwide (9.7)"),
				call(296_571, "Tank Tethers", "Tank Tethers (5.7)"),
				call(315_788, "Go West", "Go West"),
				call(336_026, "Shiva Circles", "Shiva Circles"),
				call(343_650, "Light Parties", "Light Parties"),
				call(398_585, "Raidwide", "Raidwide (4.7)"),
				call(405_713, "Raidwide", "Raidwide (4.7)"),
				call(415_865, "Tank Tethers", "Tank Tethers (5.7)"),
				call(431_496, "Big Raidwide", "Big Raidwide (4.7)"),
				call(444_783, "Light Parties", "Light Parties"),
				call(496_415, "Light Parties", "Light Parties"),
				call(510_581, "Raidwide", "Raidwide (4.7)"),
				call(529_699, "2 Stacks (Intercard)", "2 Stacks (Intercard)"),

				// P4S1
				call(10_060, "Raidwide", "Raidwide (4.7)"),
				call(19_235, "Half Raidwide", "Half Raidwide (3.7)"),
				call(34_507, "Half Raidwide", "Half Raidwide (3.7)"),
				call(38_465, "Tethers", "Tethers"),
				call(68_003, "Raidwide", "Raidwide (4.7)"),
				call(77_180, "Tankbuster on GUB Main", "Tankbuster on GUB Main (4.7)"),
				call(117_826, "Away into Spread, South safe", "Away into Spread, South safe"),
				call(130_483, "South Knockback", "South Knockback (7.7)"),
				call(138_818, "Knockback into Light Parties, North safe", "Knockback into Light Parties, North safe"),
				call(151_650, "Tankbuster on PAL Main", "Tankbuster on PAL Main (4.7)"),
				// Wipe
				call(10_068, "Raidwide", "Raidwide (4.7)"),
				call(19_254, "Half Raidwide", "Half Raidwide (3.7)"),
				call(34_542, "Half Raidwide", "Half Raidwide (3.7)"),
				call(38_507, "Both", "Both"),
				call(68_008, "Raidwide", "Raidwide (4.7)"),
				call(77_182, "Tankbuster on GUB Main", "Tankbuster on GUB Main (4.7)"),
				call(117_876, "Away into Light Parties, South safe", "Away into Light Parties, South safe"),
				call(131_018, "South Knockback", "South Knockback (7.7)"),
				call(138_900, "Knockback into Spread, North safe", "Knockback into Spread, North safe"),
				call(152_184, "Tankbuster on PAL Main", "Tankbuster on PAL Main (4.7)"),
				call(164_486, "Half Raidwide", "Half Raidwide (3.7)"),
				call(193_133, "Acting DPS", "Acting DPS"),
				call(204_178, "Half Raidwide", "Half Raidwide (3.7)"),
				call(212_325, "Orb Positions", "Orb Positions"),
				call(226_483, "Lightning safe (Southwest)", "Lightning safe (Southwest)"),
				call(239_712, "Half Raidwide", "Half Raidwide (3.7)"),
				call(251_606, "Towers", "Towers"),
				call(272_272, "Half Raidwide", "Half Raidwide (3.7)"),
				call(318_906, "Raidwide", "Raidwide (4.7)"),
				call(328_088, "Tankbuster on GUB Main", "Tankbuster on GUB Main (4.7)"),
				call(368_768, "Knockback into Light Parties, North safe", "Knockback into Light Parties, North safe"),
				call(381_589, "North Cleave", "North Cleave (7.7)"),
				call(389_780, "Away into Spread, South safe", "Away into Spread, South safe"),
				call(446_237, "Raidwide", "Raidwide (4.7)"),
				// Wipe
				call(10_874, "Raidwide", "Raidwide (4.7)"),
				call(35_281, "Raidwide", "Raidwide (4.7)"),
				call(64_635, "Party Out", "Party Out (4.7)"),
				call(87_065, "Shared buster on GUB Main", "Shared buster on GUB Main (4.7)"),
				call(102_980, "Purple", "Purple"),
				call(122_549, "Big Raidwide", "Big Raidwide (6.7)"),
				// Wipe
				call(11_005, "Raidwide", "Raidwide (4.7)"),
				call(35_429, "Raidwide", "Raidwide (4.7)"),
				call(64_794, "Party Out", "Party Out (4.7)"),
				call(87_222, "Shared buster on GUB Main", "Shared buster on GUB Main (4.7)"),
				call(103_125, "Red", "Red"),
				call(122_687, "Big Raidwide", "Big Raidwide (6.7)"),
				// P4S2
				call(10_782, "Raidwide", "Raidwide (4.7)"),
				call(35_183, "Raidwide", "Raidwide (4.7)"),
				call(64_543, "Party In", "Party In (4.7)"),
				call(86_955, "Shared buster on GUB Main", "Shared buster on GUB Main (4.7)"),
				call(102_865, "Purple", "Purple"),
				call(122_462, "Big Raidwide", "Big Raidwide (6.7)"),
				call(181_372, "Party Out", "Party Out (4.7)"),
				call(196_606, "Bleed buster on GUB Main", "Bleed buster on GUB Main (4.7)"),
				call(218_085, "Raidwide", "Raidwide (4.7)"),
				call(233_015, "Purple", "Purple"),
				call(235_423, "Raidwide", "Raidwide (4.7)"),
				call(268_577, "Big Raidwide", "Big Raidwide (6.7)"),
				call(284_845, "Raidwide", "Raidwide (4.7)"),
				call(308_951, "Teal", "Teal"),
				call(326_419, "Soak tower 8", "Soak tower 8"),
				call(333_541, "Soak West tower", "Soak West tower"),
				call(347_263, "Party In", "Party In (4.7)"),
//			call(-1, "Raidwide", "Raidwide (4.7)"),
				// Wipe
				call(10_876, "Raidwide", "Raidwide (4.7)"),
				call(35_292, "Raidwide", "Raidwide (4.7)"),
				call(64_619, "Party Out", "Party Out (4.7)"),
				call(87_035, "Shared buster on GUB Main", "Shared buster on GUB Main (4.7)"),
				call(102_940, "Purple", "Purple"),
				call(122_514, "Big Raidwide", "Big Raidwide (6.7)"),
				call(181_436, "Party Out", "Party Out (4.7)"),
				call(196_688, "Bleed buster on PAL Main", "Bleed buster on PAL Main (4.7)"),
				call(218_145, "Raidwide", "Raidwide (4.7)"),
				call(233_090, "Blue", "Blue"),
				call(235_499, "Raidwide", "Raidwide (4.7)"),
				// Wipe
				call(10_963, "Raidwide", "Raidwide (4.7)"),
				call(35_395, "Raidwide", "Raidwide (4.7)"),
				call(64_749, "Party Out", "Party Out (4.7)"),
				call(87_175, "Shared buster on GUB Main", "Shared buster on GUB Main (4.7)"),
				call(103_082, "Red", "Red"),
				call(122_687, "Big Raidwide", "Big Raidwide (6.7)"),
				call(181_633, "Party Out", "Party Out (4.7)"),
				call(196_877, "Bleed buster on PAL Main", "Bleed buster on PAL Main (4.7)"),
				call(218_346, "Raidwide", "Raidwide (4.7)"),
				call(233_282, "Blue", "Blue"),
				call(235_691, "Raidwide", "Raidwide (4.7)"),
				// Wipe
				call(10_870, "Raidwide", "Raidwide (4.7)"),
				call(35_294, "Raidwide", "Raidwide (4.7)"),
				call(64_658, "Party In", "Party In (4.7)"),
				call(87_065, "Shared buster on GUB Main", "Shared buster on GUB Main (4.7)"),
				call(102_966, "Purple", "Purple"),
				call(122_533, "Big Raidwide", "Big Raidwide (6.7)"),
				call(181_522, "Party Out", "Party Out (4.7)"),
				call(196_769, "Bleed buster on PAL Main", "Bleed buster on PAL Main (4.7)"),
				call(218_237, "Raidwide", "Raidwide (4.7)"),
				call(233_175, "Blue", "Blue"),
				call(235_582, "Raidwide", "Raidwide (4.7)"),
				call(268_777, "Big Raidwide", "Big Raidwide (6.7)"),
				call(285_086, "Raidwide", "Raidwide (4.7)"),
				call(309_180, "Teal", "Teal"),
				call(322_500, "Soak tower 5", "Soak tower 5"),
				call(332_306, "Soak Southwest tower", "Soak Southwest tower"),
				call(347_549, "Party In", "Party In (4.7)"),
				call(360_782, "Raidwide", "Raidwide (4.7)"),
				call(369_956, "Shared buster on GUB Main", "Shared buster on GUB Main (4.7)"),
				call(388_939, "Purple", "Purple"),
				call(393_927, "Second set", "Second set (22.0)"),
				call(398_382, "Protean, dodge in", "Protean, dodge in (2.1)"),
				call(418_611, "Protean, dodge in", "Protean, dodge in (2.1)")

		);
	}
}
