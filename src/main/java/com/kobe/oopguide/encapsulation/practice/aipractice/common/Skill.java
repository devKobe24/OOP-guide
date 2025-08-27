package com.kobe.oopguide.encapsulation.practice.aipractice.common;

/**
 * packageName    : com.kobe.oopguide.encapsulation.practice.aipractice.common
 * fileName       : Skill
 * author         : kobe
 * date           : 2025. 8. 25.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025. 8. 25.        kobe       최초 생성
 */
public enum Skill {
	Q, W, E, R;

	public static Skill fromString(String skillString) {
		try {
			return Skill.valueOf(skillString.toUpperCase());
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException("유효하지 않은 스킬입니다: " + skillString);
		}
	}
}
