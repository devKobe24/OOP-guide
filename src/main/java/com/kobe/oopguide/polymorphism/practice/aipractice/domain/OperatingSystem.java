package com.kobe.oopguide.polymorphism.practice.aipractice.domain;

/**
 * packageName    : com.kobe.oopguide.polymorphism.practice.aipractice.domain
 * fileName       : OperatingSystem
 * author         : kobe
 * date           : 2025. 8. 27.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025. 8. 27.        kobe       최초 생성
 */
// 'Method'라는 접미사보다 역할 자체를 이름으로 사용하는 것이 더 좋습니다.
public interface OperatingSystem {
	// 모든 OS는 부팅하여 자신의 정보를 설명하는 단일 책임을 갖도록 합니다.
	void bootAndDescribe();
}
