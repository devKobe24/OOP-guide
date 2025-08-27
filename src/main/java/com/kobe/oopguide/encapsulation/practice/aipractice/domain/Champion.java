package com.kobe.oopguide.encapsulation.practice.aipractice.domain;

import com.kobe.oopguide.encapsulation.practice.aipractice.common.Skill;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName    : com.kobe.oopguide.encapsulation.practice.aipractice.domain
 * fileName       : Champion
 * author         : kobe
 * date           : 2025. 8. 25.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025. 8. 25.        kobe       최초 생성
 */
public class Champion {

	private int level;
	private final List<Skill> learnedSkills = new ArrayList<>(); // 챔피언이 배운 스킬 목록

	public Champion() {
		this.level = 1;
	}

	// '레벨업'이라는 행위와 그 규칙을 스스로 책임집니다.
	public void levelUp() {
		if (this.level >= 18) {
			throw new IllegalStateException("최대 레벨(18)에 도달했습니다.");
		}
		this.level++;
	}

	// '스킬 선택'이라는 행위와 모든 규칙(레벨 제한 등)을 이 메서드 하나가 책임집니다.
	public void selectSkill(Skill skill) {
		if (skill == Skill.R && this.level < 6) {
			throw new IllegalArgumentException("6레벨 미만은 R 스킬을 배울 수 없습니다.");
		}
		// 여기에 각 스킬 레벨에 따른 포인트 분배 등 더 복잡한 규칙이 추가될 수 있습니다.
		this.learnedSkills.add(skill);
		System.out.println(this.level + "레벨에 " + skill + " 스킬을 배웠습니다.");
	}

	// 외부에는 필요한 정보만 '읽기 전용'으로 노출합니다.
	public int getLevel() {
		return level;
	}

	public List<Skill> getLearnedSkills() {
		// 방어적 복사(Defensive Copy)를 통해 외부에서 리스트를 수정하는 것을 방지합니다.
		return new ArrayList<>(learnedSkills);
	}
}
