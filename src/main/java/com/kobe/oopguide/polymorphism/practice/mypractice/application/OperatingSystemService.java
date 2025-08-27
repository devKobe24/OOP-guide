package com.kobe.oopguide.polymorphism.practice.mypractice.application;

import com.kobe.oopguide.polymorphism.practice.mypractice.domain.OperatingSystemMethod;
import org.springframework.stereotype.Service;

/**
 * packageName    : com.kobe.oopguide.polymorphism.practice.mypractice.application
 * fileName       : OperatingSystemService
 * author         : kobe
 * date           : 2025. 8. 27.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025. 8. 27.        kobe       최초 생성
 */
@Service
public class OperatingSystemService {
	public void processOperatingSystem(OperatingSystemMethod operatingSystemMethod, String osName) {
		System.out.println(osName + " 시스템에 대해 설명합니다.");
		operatingSystemMethod.processManagement(osName);
		operatingSystemMethod.memoryManagement(osName);
		operatingSystemMethod.fileSystemManagement(osName);
		operatingSystemMethod.deviceManagement(osName);
		operatingSystemMethod.userInterface(osName);
		operatingSystemMethod.securityAndProtection(osName);
		operatingSystemMethod.networking(osName);
		operatingSystemMethod.resourceManagementAndAbstraction(osName);
		System.out.println("설명이 완료되었습니다.");
	}
}
