package com.kobe.oopguide.encapsulation.goodcase.service;

import com.kobe.oopguide.encapsulation.goodcase.domain.Member;

/**
 * packageName    : com.kobe.oopguide.encapsulation.goodcase.service
 * fileName       : LevelService
 * author         : kobe
 * date           : 2025. 8. 25.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025. 8. 25.        kobe       최초 생성
 */
public class LevelService {
	public void levelUp(Member member) {
		// 서비스는 멤버에게 레벨업 하라는 메시지만 전달
		member.levelUp();
	}
}
