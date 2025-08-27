package com.kobe.oopguide.abstraction.goodcase.domain;

/**
 * packageName    : com.kobe.oopguide.abstraction.goodcase.domain
 * fileName       : Notifier
 * author         : kobe
 * date           : 2025. 8. 26.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025. 8. 26.        kobe       최초 생성
 */
// 1. "알림을 보낸다"는 핵심 기능(역할)을 추상화한 인터페이스 정의
public interface Notifier {
	void send(String message);
}
