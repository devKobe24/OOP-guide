package com.kobe.oopguide.polymorphism.goodcase.infrastructure;

import com.kobe.oopguide.polymorphism.goodcase.domain.PaymentMethod;
import org.springframework.stereotype.Component;

/**
 * packageName    : com.kobe.oopguide.polymorphism.goodcase.infrastructure
 * fileName       : CardPayment
 * author         : kobe
 * date           : 2025. 8. 27.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025. 8. 27.        kobe       최초 생성
 */
// 2. 각 결제 수단이 '결제'라는 역할을 자신만의 방식으로 구현
@Component
public class CardPayment implements PaymentMethod {
	@Override
	public void pay(int amount) {
		System.out.println("신용카드로 " + amount + "원 결제");
		// 카드사 연동 로직...
	}
}
