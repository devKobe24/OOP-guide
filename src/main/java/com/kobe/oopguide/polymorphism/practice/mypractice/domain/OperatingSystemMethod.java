package com.kobe.oopguide.polymorphism.practice.mypractice.domain;

/**
 * packageName    : com.kobe.oopguide.polymorphism.practice.mypractice.domain
 * fileName       : OperatingSystem
 * author         : kobe
 * date           : 2025. 8. 27.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025. 8. 27.        kobe       최초 생성
 */
// 1. '운영체제'라는 추상적인 역할 정의
public interface OperatingSystemMethod {
	void processManagement(String os);
	void memoryManagement(String os);
	void fileSystemManagement(String os);
	void deviceManagement(String os);
	void userInterface(String os);
	void securityAndProtection(String os);
	void networking(String os);
	void resourceManagementAndAbstraction(String os);
}
