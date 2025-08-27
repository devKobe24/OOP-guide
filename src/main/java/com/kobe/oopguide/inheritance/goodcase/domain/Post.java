package com.kobe.oopguide.inheritance.goodcase.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

/**
 * packageName    : com.kobe.oopguide.inheritance.goodcase.domain
 * fileName       : Post
 * author         : kobe
 * date           : 2025. 8. 27.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025. 8. 27.        kobe       최초 생성
 */

// Post 셍성/수정일이 필요한 객체
@Entity
public class Post extends BaseEntity {
	@Id
	@GeneratedValue
	private Long id;
	private String content;
}
