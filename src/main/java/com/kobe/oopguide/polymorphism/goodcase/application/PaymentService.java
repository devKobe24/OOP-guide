package com.kobe.oopguide.polymorphism.goodcase.application;

import com.kobe.oopguide.polymorphism.goodcase.domain.PaymentMethod;
import org.springframework.stereotype.Service;

/**
 * packageName    : com.kobe.oopguide.polymorphism.goodcase.application
 * fileName       : PaymentService
 * author         : kobe
 * date           : 2025. 8. 27.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025. 8. 27.        kobe       최초 생성
 */
// 3. 결제 서비스는 어떤 결제 수단이든 동일한 방식으로 처리
@Service
public class PaymentService {
	public void processPayment(PaymentMethod paymentMethod, int amount) {
		System.out.println("결제를 시작합니다.");
		// paymentMethod가 카드인지, 계좌이체인지 전혀 알 필요가 없다.
		// 그냥 'pay'라는 메시지를 보낼 뿐.
		// 실행 시점(Runtime)에 실제 객체(CardPayment 또는 BankTransferPayment)의 오버라이딩된 pay() 메서드가 실행된다.
		paymentMethod.pay(amount);
		System.out.println("결제가 완료되었습니다.");
	}
}
