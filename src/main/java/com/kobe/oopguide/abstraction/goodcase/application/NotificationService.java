package com.kobe.oopguide.abstraction.goodcase.application;

import com.kobe.oopguide.abstraction.goodcase.domain.Notifier;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * packageName    : com.kobe.oopguide.abstraction.goodcase.service
 * fileName       : NotificationService
 * author         : kobe
 * date           : 2025. 8. 26.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025. 8. 26.        kobe       최초 생성
 */
// 3. 클라이언트는 구체적인 구현(Kakao, Sms)을 몰라도 된다.
@Service
public class NotificationService {
	private final Notifier notifier;

	// 예시: 생서자에서 특정 Notifier를 주입받음 (실제로는 전략 패턴 등을 사용)
	public NotificationService(@Qualifier("kakaoNotifier") Notifier notifier) {
		this.notifier = notifier;
	}

	public void sendNotifier(String message) {
		// Notifier가 카카오톡인지 SMS인지 신경쓰지 않고, 그냥 'send'라는 약속된 기능만 호출
		notifier.send(message);
	}
}
