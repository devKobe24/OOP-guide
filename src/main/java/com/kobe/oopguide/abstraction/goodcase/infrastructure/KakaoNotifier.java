package com.kobe.oopguide.abstraction.goodcase.infrastructure;

import com.kobe.oopguide.abstraction.goodcase.domain.Notifier;

/**
 * packageName    : com.kobe.oopguide.abstraction.goodcase.infrastructure
 * fileName       : KakaoNotifier
 * author         : kobe
 * date           : 2025. 8. 26.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025. 8. 26.        kobe       최초 생성
 */
// 2. 구체적인 구현은 KakaoNotifier 클래스가 알아서 책임진다.
public class KakaoNotifier implements Notifier {
	@Override
	public void send(String message) {
		System.out.println("카카오톡 발송: " + message);
		// 복잡한 카카오톡 API 연동 로직...
	}
}
