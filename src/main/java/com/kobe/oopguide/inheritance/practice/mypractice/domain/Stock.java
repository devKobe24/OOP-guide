package com.kobe.oopguide.inheritance.practice.mypractice.domain;

import jakarta.persistence.*;

/**
 * packageName    : com.kobe.oopguide.inheritance.practice.mypractice.domain
 * fileName       : Stock
 * author         : kobe
 * date           : 2025. 8. 27.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025. 8. 27.        kobe       최초 생성
 */
// Stock는 생성/수정일, 원가/판매가, 바코드 번호가 필요한 객체
@Entity	// 이 클래스가 DB 테이블과 매핑됨을 명시
public class Stock extends  BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private int quantity; // 재고 수량

	// [핵심] Product와의 연관관계(Composition)
	// Stock은 Product를 '포함'합니다 (Stock HAS-A Product)
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "product_id") // DB에 생성될 외래키(FK) 커럼명
	private Product product;
}
