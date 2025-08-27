package com.kobe.oopguide.polymorphism.practice.aipractice.infrastructure;

import com.kobe.oopguide.polymorphism.practice.aipractice.domain.OperatingSystem;
import org.springframework.stereotype.Component;

/**
 * packageName    : com.kobe.oopguide.polymorphism.practice.aipractice.infrastructure
 * fileName       : MacOperatingSystem
 * author         : kobe
 * date           : 2025. 8. 27.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025. 8. 27.        kobe       최초 생성
 */
@Component("mac")
public class MacOperatingSystem implements OperatingSystem {

	private final String osName = "macOS";

	@Override
	public void bootAndDescribe() {
		System.out.println("===== " + this.osName + " 시스템 부팅 =====");
		this.processManagement();
		this.memoryManagement();
		System.out.println("========================================");
	}

	private void processManagement() {
		System.out.println(this.osName + " 시스템의 프로세스 관리: XNU 커널 기반의 Mach 스케줄러 사용.");
	}

	private void memoryManagement() {
		System.out.println(this.osName + " 시스템의 메모리 관리: 압축 메모리 및 앱 냅 기능 활용.");
	}
}
