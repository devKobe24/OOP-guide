package com.kobe.oopguide.inheritance.practice.mypractice.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * packageName    : com.kobe.oopguide.inheritance.practice.mypractice.domain
 * fileName       : Product
 * author         : kobe
 * date           : 2025. 8. 27.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025. 8. 27.        kobe       최초 생성
 */
// Post는 생성/수정일, 원가/판매가, 바코드 번호가 필요한 객체
@Entity // 이 클래스가 DB 테이블과 매핑됨을 명시
public class Product extends  BaseEntity { // BaseEntity로부터 CreatedAt, UpdatedAt만 상속받음
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String productName;

	// 상품의 고유의 속성들은 Product 클래스가 직접 가집니다.
	private Integer costPrice;
	private Integer regularPrice;
	private String barcodeNumber;
}
