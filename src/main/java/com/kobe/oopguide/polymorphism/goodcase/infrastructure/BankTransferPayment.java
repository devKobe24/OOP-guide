package com.kobe.oopguide.polymorphism.goodcase.infrastructure;

import com.kobe.oopguide.polymorphism.goodcase.domain.PaymentMethod;
import org.springframework.stereotype.Component;

/**
 * packageName    : com.kobe.oopguide.polymorphism.goodcase.infrastructure
 * fileName       : BankTransferPayment
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
public class BankTransferPayment implements PaymentMethod {
	@Override
	public void pay(int amount) {
		System.out.println("계좌이체로 " + amount + "원 결제");
		// 은행 PG사 연동 로직...
	}
}
