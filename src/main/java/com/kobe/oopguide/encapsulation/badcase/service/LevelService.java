package com.kobe.oopguide.encapsulation.badcase.service;

import com.kobe.oopguide.encapsulation.badcase.domain.BadMember;

/**
 * packageName    : com.kobe.oopguide.encapsulation.badcase.service
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
	// 레벨업 로직이 외부에 존재
	public void levelUp(BadMember member) {
		// 요구사항: 레벨은 최대 99까지만 올릴 수 있다.
		if (member.level < 99) {
			member.level++; // 외부에서 멤버의 상태를 직접 변경
		}
	}
}
