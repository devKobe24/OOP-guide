package com.kobe.oopguide.encapsulation.goodcase.domain;

/**
 * packageName    : com.kobe.oopguide.encapsulation.goodcase.domain
 * fileName       : Member
 * author         : kobe
 * date           : 2025. 8. 25.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025. 8. 25.        kobe       최초 생성
 */
public class Member {
	private int level; // 외부에서 접근 차단

	public Member() {
		this.level = 1; // 상태는 생성 시 스스로 초기화
	}

	// 객체가 스스로 레벨업을 책임짐
	public void levelUp() {
		if (this.level >= 99) {
			System.out.println("최대 레벨에 도달했습니다.");
			return;
		}
		this.level++;
	}

	public int getLevel() {
		return this.level; // 외부에는 읽기만 허용
	}
}
