package com.kobe.oopguide.polymorphism.practice.aipractice.infrastructure;

import com.kobe.oopguide.polymorphism.practice.aipractice.domain.OperatingSystem;
import org.springframework.stereotype.Component;

/**
 * packageName    : com.kobe.oopguide.polymorphism.practice.aipractice.infrastructure
 * fileName       : LinuxOperatingSystem
 * author         : kobe
 * date           : 2025. 8. 27.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025. 8. 27.        kobe       최초 생성
 */
@Component("linux") // Spring Bean의 이름을 명시적으로 지정
public class LinuxOperatingSystem implements OperatingSystem {

	// ✅ 자신의 상태(이름)를 스스로 책임집니다.
	private final String osName = "Linux";

	@Override
	public void bootAndDescribe() {
		System.out.println("===== " + this.osName + " 시스템 부팅 =====");
		this.processManagement();
		this.memoryManagement();
		System.out.println("========================================");
	}

	// 각 기능은 외부에 노출될 필요가 없으므로 private으로 캡슐화합니다.
	private void processManagement() {
		System.out.println(this.osName + " 시스템의 프로세스 관리: System V와 BSD 스타일 스케줄러 사용");
	}

	private void memoryManagement() {
		System.out.println(this.osName + " 시스템의 메모리 관리: 가상 메모리 및 페이징 기법 활용");
	}
}
