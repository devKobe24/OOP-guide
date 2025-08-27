package com.kobe.oopguide.polymorphism.practice.aipractice.application;

import com.kobe.oopguide.polymorphism.practice.aipractice.domain.OperatingSystem;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * packageName    : com.kobe.oopguide.polymorphism.practice.aipractice.application
 * fileName       : ComputerService
 * author         : kobe
 * date           : 2025. 8. 27.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025. 8. 27.        kobe       최초 생성
 */
@Service
public class ComputerService {

	private final OperatingSystem linux;
	private final OperatingSystem macOS;

	// 생성자를 통해 Spring이 등록한 Bean들을 주입받습니다.
	public ComputerService(@Qualifier("linux") OperatingSystem linux,
	                       @Qualifier("mac") OperatingSystem macOS) {
		this.linux = linux;
		this.macOS = macOS;
	}

	// 서비스는 이제 "어떤 OS를 부팅할지 결정"하는 더 의미있는 역할을 합니다.
	public void bootLinuxComputer() {
		// 서비스는 OS에게 "부팅하고 설명해"라는 메시지만 보낼 뿐,
		// Linux가 어떻게 동작하는지는 전혀 알지 못합니다.
		linux.bootAndDescribe();
	}

	public void bootMacComputer() {
		macOS.bootAndDescribe();
	}
}
