package com.kobe.oopguide.polymorphism.practice.mypractice.infrastructure;

import com.kobe.oopguide.polymorphism.practice.mypractice.domain.OperatingSystemMethod;
import org.springframework.stereotype.Component;

/**
 * packageName    : com.kobe.oopguide.polymorphism.practice.mypractice.infrastructure
 * fileName       : LinuxOperatingSystem
 * author         : kobe
 * date           : 2025. 8. 27.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025. 8. 27.        kobe       최초 생성
 */
@Component
public class LinuxOperatingSystem implements OperatingSystemMethod {
	@Override
	public void processManagement(String os) {
		System.out.println(os + " 시스템의 프로세스 관리");
		// Linux os 프로세스 관리 로직...
	}

	@Override
	public void memoryManagement(String os) {
		System.out.println(os + " 시스템의 메모리 관리");
		// Linux os 메모리 관리 로직...
	}

	@Override
	public void fileSystemManagement(String os) {
		System.out.println(os + " 시스템의 파일 시스템 관리");
		// Linux os 파일 시스템 관리 로직...
	}

	@Override
	public void deviceManagement(String os) {
		System.out.println(os + " 시스템의 입출력(I/O) 관리");
		// Linux os 입출력(I/O) 관리 로직...
	}

	@Override
	public void userInterface(String os) {
		System.out.println(os + " 시스템의 사용자 인터페이스(UI)");
		// Linux os UI 로직...
	}

	@Override
	public void securityAndProtection(String os) {
		System.out.println(os + " 시스템의 보안 및 보호");
		// Linux os 보안 및 보호 로직...
	}

	@Override
	public void networking(String os) {
		System.out.println(os + " 시스템의 네트워킹(Networking)");
		// Linux os 네트워킹 로직...
	}

	@Override
	public void resourceManagementAndAbstraction(String os) {
		System.out.println(os + " 시스템의 자원 관리와 추상화");
		// Linux os 자원 관리와 추상화 로직...
	}
}
