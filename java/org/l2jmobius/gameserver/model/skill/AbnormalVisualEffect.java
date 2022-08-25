/*
 * This file is part of the L2J Mobius project.
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.l2jmobius.gameserver.model.skill;

/**
 * Abnormal Visual Effect enumerated.
 * @author NosBit
 */
public enum AbnormalVisualEffect
{
	DOT_BLEEDING(1),
	DOT_POISON(2),
	DOT_FIRE(3),
	DOT_WATER(4),
	DOT_WIND(5),
	DOT_SOIL(6),
	STUN(7),
	SLEEP(8),
	SILENCE(9),
	ROOT(10),
	PARALYZE(11),
	FLESH_STONE(12),
	DOT_MP(13),
	BIG_HEAD(14),
	DOT_FIRE_AREA(15),
	CHANGE_TEXTURE(16),
	BIG_BODY(17),
	FLOATING_ROOT(18),
	DANCE_ROOT(19),
	GHOST_STUN(20),
	STEALTH(21),
	SEIZURE1(22),
	SEIZURE2(23),
	MAGIC_SQUARE(24),
	FREEZING(25),
	SHAKE(26),
	ULTIMATE_DEFENCE(28),
	VP_UP(29),
	VP_KEEP(29), // TODO: Unknown ClientID
	REAL_TARGET(30),
	DEATH_MARK(31),
	TURN_FLEE(32),
	INVINCIBILITY(33),
	AIR_BATTLE_SLOW(34),
	AIR_BATTLE_ROOT(35),
	CHANGE_WP(36),
	CHANGE_HAIR_G(37), // Gold Afro
	CHANGE_HAIR_P(38), // Pink Afro
	CHANGE_HAIR_B(39), // Black Afro
	UNKNOWN_40(40),
	STIGMA_OF_SILEN(41),
	SPEED_DOWN(42),
	FROZEN_PILLAR(43),
	CHANGE_VES_S(44),
	CHANGE_VES_C(45),
	CHANGE_VES_D(46),
	TIME_BOMB(47),
	MP_SHIELD(48),
	AIRBIND(49),
	CHANGEBODY(50),
	KNOCKDOWN(51),
	NAVIT_ADVENT(52),
	KNOCKBACK(53),
	CHANGE_7ANNIVERSARY(54),
	ON_SPOT_MOVEMENT(55),
	DEPORT(56),
	AURA_BUFF(57),
	AURA_BUFF_SELF(58),
	AURA_DEBUFF(59),
	AURA_DEBUFF_SELF(60),
	HURRICANE(61),
	HURRICANE_SELF(62),
	BLACK_MARK(63),
	BR_SOUL_AVATAR(64),
	CHANGE_GRADE_B(65),
	BR_BEAM_SWORD_ONEHAND(66),
	BR_BEAM_SWORD_DUAL(67),
	NO_CHAT(68),
	HERB_PA_UP(69),
	HERB_MA_UP(70),
	SEED_TALISMAN1(71),
	SEED_TALISMAN2(72),
	SEED_TALISMAN3(73),
	SEED_TALISMAN4(74),
	SEED_TALISMAN5(75),
	SEED_TALISMAN6(76),
	CURIOUS_HOUSE(77),
	NGRADE_CHANGE(78),
	DGRADE_CHANGE(79),
	CGRADE_CHANGE(80),
	BGRADE_CHANGE(81),
	AGRADE_CHANGE(82),
	SWEET_ICE_FLAKES(83),
	FANTASY_ICE_FLAKES(84),
	CHANGE_XMAS(85),
	CARD_PC_DECO(86),
	CHANGE_DINOS(87),
	CHANGE_VALENTINE(88),
	CHOCOLATE(89),
	CANDY(90),
	COOKIE(91),
	STARS_0(92),
	STARS_1(93),
	STARS_2(94),
	STARS_3(95),
	STARS_4(96),
	STARS_5(97),
	DUELING(98),
	FREEZING2(99),
	CHANGE_YOGI(100),
	YOGI(101),
	MUSICAL_NOTE_YELLOW(102),
	MUSICAL_NOTE_BLUE(103),
	MUSICAL_NOTE_GREEN(104),
	TENTH_ANNIVERSARY(105),
	XMAS_SOCKS(106),
	XMAS_TREE(107),
	XMAS_SNOWMAN(108),
	OTHELL_ROGUE_BLUFF(109),
	HE_PROTECT(110),
	SU_SUMCROSS(111),
	WIND_STUN(112),
	STORM_SIGN2(113),
	STORM_SIGN1(114),
	WIND_BLEND(115),
	DECEPTIVE_BLINK(116),
	WIND_HIDE(117),
	PSY_POWER(118),
	SQUALL(119),
	WIND_ILLUSION(120),
	SAYHA_FURY(121),
	HIDE4(123),
	PMENTAL_TRAIL(124),
	HOLD_LIGHTING(125),
	GRAVITY_SPACE_3(126),
	SPACEREF(127),
	HE_ASPECT(128),
	RUNWAY_ARMOR1(129),
	RUNWAY_ARMOR2(130),
	RUNWAY_ARMOR3(131),
	RUNWAY_ARMOR4(132),
	RUNWAY_ARMOR5(133),
	RUNWAY_ARMOR6(134),
	RUNWAY_WEAPON1(135),
	RUNWAY_WEAPON2(136),
	PALADIN_PROTECTION(141),
	SENTINEL_PROTECTION(142),
	REAL_TARGET_2(143),
	DIVINITY(144),
	SHILLIEN_PROTECTION(145),
	EVENT_STARS_0(146),
	EVENT_STARS_1(147),
	EVENT_STARS_2(148),
	EVENT_STARS_3(149),
	EVENT_STARS_4(150),
	EVENT_STARS_5(151),
	ABSORB_SHIELD(152),
	PHOENIX_AURA(153),
	REVENGE_AURA(154),
	EVAS_AURA(155),
	TEMPLAR_AURA(156),
	LONG_BLOW(157),
	WIDE_SWORD(158),
	BIG_FIST(159),
	SHADOW_STEP(160),
	TORNADO(161),
	SNOW_SLOW(162),
	SNOW_HOLD(163),
	UNK_164(164),
	TORNADO_SLOW(165),
	ASTATINE_WATER(166),
	BIG_BODY_COMBINATION_CAT_NPC(167),
	BIG_BODY_COMBINATION_UNICORN_NPC(168),
	BIG_BODY_COMBINATION_DEMON_NPC(169),
	BIG_BODY_COMBINATION_CAT_PC(170),
	BIG_BODY_COMBINATION_UNICORN_PC(171),
	BIG_BODY_COMBINATION_DEMON_PC(172),
	BIG_BODY_2(173),
	BIG_BODY_3(174),
	PIRATE_SUIT(175),
	DARK_ASSASSIN_SUIT(176),
	WHITE_ASSASSIN_SUIT(177),
	UNK_178(178),
	UNK_179(179),
	UNK_180(180),
	AVE_DRAGON_ULTIMATE(181),
	HALLOWEEN_SUIT(182),
	INFINITE_SHIELD1_AVE(183),
	INFINITE_SHIELD2_AVE(184),
	INFINITE_SHIELD3_AVE(185),
	INFINITE_SHIELD4_AVE(186),
	AVE_ABSORB2_SHIELD(187),
	UNK_188(188),
	UNK_189(189),
	TALISMAN_BAIUM(190),
	BLUE_DYNASTY(191),
	RED_ZUBEI(192),
	CHANGESHAPE_TRANSFORM(193),
	ANGRY_GOLEM_AVE(194),
	WA_UNBREAKABLE_SONIC_AVE(195),
	HEROIC_HOLY_AVE(196),
	HEROIC_SILENCE_AVE(197),
	HEROIC_FEAR_AVE_1(198),
	HEROIC_FEAR_AVE_2(199),
	AVE_BROOCH(200),
	AVE_BROOCH_B(201),
	INFINITE_SHIELD4_AVE_2(206),
	CHANGESHAPE_TRANSFORM_1(207),
	CHANGESHAPE_TRANSFORM_2(208),
	CHANGESHAPE_TRANSFORM_3(209),
	CHANGESHAPE_TRANSFORM_4(210),
	RO_COUNTER_TRASPIE(215),
	RO_GHOST_REFLECT(217),
	CHANGESHAPE_TRANSFORM_5(218),
	ICE_ELEMENTALDESTROY(219),
	DORMANT_USER(220),
	NUWBIE_USER(221),
	THIRTEENTH_BUFF(222),
	ARENA_UNSEAL_A(224),
	ARENA_UNSEAL_B(225),
	ARENA_UNSEAL_C(226),
	ARENA_UNSEAL_D(227),
	ARENA_UNSEAL_E(228),
	IN_BATTLE_RHAPSODY(229),
	IN_A_DECAL(230),
	IN_B_DECAL(231),
	CHANGESHAPE_TRANSFORM_6(232),
	CHANGESHAPE_TRANSFORM_7(234),
	SPIRIT_KING_WIND_AVE_B(235),
	EARTH_KING_BARRIER1_AVE(236),
	EARTH_KING_BARRIER2_AVE(237),
	FOCUS_SHIELD(247),
	RAISE_SHIELD(248),
	TRUE_VANGUARD(249),
	SHIELD_WALL(250),
	FOOT_TRAIL(251),
	LEGEND_DECO_HERO(252),
	CHANGESHAPE_TRANSFORM_8(253),
	SPIRIT_KING_WIND_AVE(254),
	U098_BUFF_TA_DECO(255),
	U098_RIGHT_DECO(255),
	U098_LEFT_DECO(255),
	ORFEN_ENERGY1_AVE(256),
	ORFEN_ENERGY2_AVE(257),
	ORFEN_ENERGY3_AVE(258),
	ORFEN_ENERGY4_AVE(259),
	ORFEN_ENERGY5_AVE(260),
	UNHOLY_BARRIER_AVE(263),
	RUDOLF_A_AVE(266),
	RUDOLF_B_AVE(267),
	RUDOLF_C_AVE(268),
	OLYMPIAD_MEDAL_AVE(269),
	OLYMPIAD_SPORT_A_AVE(270),
	OLYMPIAD_SPORT_B_AVE(271),
	OLYMPIAD_SPORT_C_AVE(272),
	D_CHAOS_MATCH_DECO_SMALL(273),
	TRANS_DECO_R(274),
	TRANS_DECO_B(275),
	TRANS_DECO_Y(276),
	TRANS_DECO_G(277),
	TRANS_DECO_P(278),
	TRANS_DECO_P2(279),
	TRANS_DECO_W(280),
	TRANS_DECO_R2(281),
	TRANS_DECO_W2(282),
	HDDOWN_AVE(283),
	HDMDOWN_AVE(284),
	KISSNHEART_AVE(286),
	EARTH_BARRIER_AVE(287),
	LILITH_DARK_BARRIER_AVE(288),
	EARTH_BARRIER2_AVE(289),
	CROFFIN_QUEEN_INVINCIBILITY_AVE(290),
	MPDOWN_AVE(291),
	WORLDCUP_RED_AVE(292),
	WORLDCUP_BLUE_AVE(293),
	SURGEWAVE_AVE(296),
	BLESS_AVE(297),
	ANTHARAS_RAGE_AVE(298),
	G_BARRIER_AVE(302),
	FIREWORKS_001T(304),
	FIREWORKS_002T(305),
	FIREWORKS_003T(306),
	FIREWORKS_004T(307),
	FIREWORKS_005T(308),
	FIREWORKS_006T(309),
	FIREWORKS_007T(310),
	FIREWORKS_008T(311),
	FIREWORKS_009T(312),
	FIREWORKS_010T(313),
	FIREWORKS_011T(314),
	FIREWORKS_012T(315),
	FIREWORKS_013T(316),
	FIREWORKS_014T(317),
	FIREWORKS_015T(318),
	P_CAKE_AVE(319),
	ZARICHE_PRISION_AVE(323),
	XMAS_HEART_AVE(325),
	XMAS_HAND_AVE(326),
	LUCKYBAG_AVE(327),
	HEROIC_MIRACLE_AVE(328),
	POCKETPIG_AVE(329),
	BLACK_STANCE_AVE(330),
	BLACK_TRANS_DECO_AVE(330),
	KAMAEL_BLACK_TRANSFORM(331),
	WHITE_STANCE_AVE(332),
	HEAL_DECO_AVE(332),
	KAMAEL_WHITE_TRANSFORM(333),
	LONG_RAPIER_WHITE_AVE(334),
	LONG_RAPIER_BLACK_AVE(335),
	ZARICHE_PRISION2_AVE(336),
	BLUEHEART_AVE(337),
	ATTACK_BUFF_AVE(338),
	SHIELD_BUFF_AVE(339),
	BERSERKER_BUFF_AVE(340),
	DRAGON_ULTIMATE(700),
	CHANGE_HALLOWEEN(1000),
	BR_Y_1_ACCESSORY_R_RING(10001),
	BR_Y_1_ACCESSORY_EARRING(10002),
	BR_Y_1_ACCESSORY_NECKRACE(10003),
	BR_Y_2_ACCESSORY_R_RING(10004),
	BR_Y_2_ACCESSORY_EARRING(10005),
	BR_Y_2_ACCESSORY_NECKRACE(10006),
	BR_Y_3_ACCESSORY_R_RING(10007),
	BR_Y_3_ACCESSORY_EARRING(10008),
	BR_Y_3_ACCESSORY_NECKRACE(10009),
	BR_Y_3_TALI_DECO_WING(10019);
	
	private final int _clientId;
	
	AbnormalVisualEffect(int clientId)
	{
		_clientId = clientId;
	}
	
	/**
	 * Gets the client id.
	 * @return the client id
	 */
	public int getClientId()
	{
		return _clientId;
	}
	
	/**
	 * Finds abnormal visual effect by name.
	 * @param name the name
	 * @return The abnormal visual effect if its found, {@code null} otherwise
	 */
	public static AbnormalVisualEffect findByName(String name)
	{
		for (AbnormalVisualEffect abnormalVisualEffect : values())
		{
			if (abnormalVisualEffect.name().equalsIgnoreCase(name))
			{
				return abnormalVisualEffect;
			}
		}
		return null;
	}
}