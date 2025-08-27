package com.kobe.oopguide.encapsulation.practice.mypractice.service;

import com.kobe.oopguide.encapsulation.practice.mypractice.domain.Champion;

/**
 * packageName    : com.kobe.oopguide.encapsulation.practice.service
 * fileName       : SummonerSkillService
 * author         : kobe
 * date           : 2025. 8. 25.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025. 8. 25.        kobe       최초 생성
 */
public class SummonerService {
	public void selectChampionSkillOverLevelSix(String selectSkill, Champion champion) {
		// 서비스는 챔피언에게 스킬 선택하라는 메시지만 전달
		champion.selectSkillOverLevelSix(selectSkill);
	}

	public void selectChampionSkillUnderLevelSix(String selectSkill, Champion champion) {
		// 서비스는 챔피언에게 스킬 선택하라는 메시지만 전달
		champion.selectSkillUnderLevelSix(selectSkill);
	}

	public void levelUp(Champion champion) {
		// 서비스는 챔피언에게 레벨업 하라는 메시지만 전달
		champion.championLevelUp();
	}

}
