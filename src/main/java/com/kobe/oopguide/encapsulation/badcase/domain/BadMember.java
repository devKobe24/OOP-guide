package com.kobe.oopguide.encapsulation.badcase.domain;

/**
 * packageName    : com.kobe.oopguide.encapsulation.badcase.domain
 * fileName       : BadMemeber
 * author         : kobe
 * date           : 2025. 8. 25.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025. 8. 25.        kobe       최초 생성
 */

// Member 객체가 데이터만 가진 수동적인 존재
public class BadMember {
	public int level; // 외부에서 레벨에 직접 접근 가능
}
