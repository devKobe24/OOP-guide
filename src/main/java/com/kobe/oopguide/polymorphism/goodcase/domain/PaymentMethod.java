package com.kobe.oopguide.polymorphism.goodcase.domain;

/**
 * packageName    : com.kobe.oopguide.polymorphism.goodcase.domain
 * fileName       : PaymentMethod
 * author         : kobe
 * date           : 2025. 8. 27.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025. 8. 27.        kobe       최초 생성
 */
// 1. '결제'라는 추상적인 역할 정의
public interface PaymentMethod {
	void pay(int amount);
}
