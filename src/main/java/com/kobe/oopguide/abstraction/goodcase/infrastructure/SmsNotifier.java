package com.kobe.oopguide.abstraction.goodcase.infrastructure;

import com.kobe.oopguide.abstraction.goodcase.domain.Notifier;

/**
 * packageName    : com.kobe.oopguide.abstraction.goodcase.infrastructure
 * fileName       : SmsNotifier
 * author         : kobe
 * date           : 2025. 8. 26.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025. 8. 26.        kobe       최초 생성
 */
// 2. 구체적인 구현은 SmsNotifier 클래스가 알아서 책임진다.
public class SmsNotifier implements Notifier {
	@Override
	public void send(String message) {
		System.out.println("SMS 발송: " + message);
		// 복잡한 SMS 발송 서버 연동 로직...
	}
}
