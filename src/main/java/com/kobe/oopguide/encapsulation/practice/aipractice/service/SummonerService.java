package com.kobe.oopguide.encapsulation.practice.aipractice.service;

import com.kobe.oopguide.encapsulation.practice.aipractice.common.Skill;
import com.kobe.oopguide.encapsulation.practice.aipractice.domain.Champion;

/**
 * packageName    : com.kobe.oopguide.encapsulation.practice.aipractice.service
 * fileName       : SummonerService
 * author         : kobe
 * date           : 2025. 8. 25.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025. 8. 25.        kobe       최초 생성
 */
public class SummonerService {

	// 서비스는 챔피언에게 메시지만 전달할 뿐,
	// 어떻게 레벨업하고 스킬을 배우는지는 전혀 알지 못합니다.
	public void levelUp(Champion champion) {
		try {
			champion.levelUp();
			System.out.println("레벨업! 현재 레벨: " + champion.getLevel());
		} catch (IllegalArgumentException e) {
			System.err.println("레벨업 실패: " + e.getMessage());
		}
	}

	public void learnSkill(Champion champion, String skillName) {
		try {
			Skill skill = Skill.fromString(skillName); // 입력값 검증 및 변환.
			champion.selectSkill(skill);
		} catch (IllegalArgumentException e) {
			System.out.println("스킬 배우기 실패: " + e.getMessage());
		}
	}
}
