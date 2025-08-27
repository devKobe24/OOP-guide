# 🚀 OOP Guide - 객체지향 프로그래밍 실전 가이드

> **실무에 바로 적용할 수 있는 객체지향 설계 원칙과 패턴을 Java/Spring Boot로 구현한 학습 레포지토리**

## 📋 프로젝트 소개

이 레포지토리는 객체지향 프로그래밍의 4대 원칙(캡슐화, 추상화, 상속, 다형성)과 SOLID 원칙 중 의존성 역전 원칙(DIP)을 **이론과 실제 코드**로 함께 학습할 수 있도록 구성되었습니다.

단순한 예제를 넘어서 **실무에서 마주치는 실제 상황들**을 바탕으로 한 코드 예시와 함께, 잘못된 설계와 올바른 설계를 비교하여 **왜 이렇게 설계해야 하는지**를 명확하게 이해할 수 있습니다.

## 🛠️ 기술 스택

- **Java 17**
- **Spring Boot 3.5.5**
- **Spring Data JPA**
- **Gradle 8.14.3**

## 🎯 학습 목표

- [x] 객체지향의 4대 원칙을 **실제 비즈니스 로직**에 적용하는 방법 이해
- [x] **캡슐화**를 통한 데이터 무결성 보장 및 책임 분리
- [x] **추상화**를 통한 결합도 감소와 확장성 확보
- [x] **상속**의 올바른 사용법과 위험성 인지
- [x] **다형성**을 활용한 유연한 시스템 설계
- [x] **의존성 역전 원칙(DIP)**을 통한 테스트 가능한 코드 작성

## 📚 학습 컨텐츠 구조

### 🔐 1. 캡슐화 (Encapsulation)
```
src/main/java/com/kobe/oopguide/encapsulation/
├── badcase/        # ❌ 잘못된 예시: 데이터와 로직 분리
│   ├── domain/BadMember.java
│   └── service/LevelService.java
├── goodcase/       # ✅ 올바른 예시: 데이터와 행위의 응집
│   ├── domain/Member.java
│   └── service/LevelService.java
└── practice/       # 🎮 실습: 게임 챔피언 시스템
    └── aipractice/ # AI 피드백 기반 리팩토링
        ├── domain/Champion.java
        ├── common/Skill.java (Enum 활용)
        └── service/SummonerService.java
```

**핵심 학습 포인트:**
- 객체가 자신의 데이터를 스스로 관리하는 책임 설계
- `private` 필드와 `public` 메서드를 통한 데이터 보호
- 비즈니스 규칙을 도메인 객체 내부에 캡슐화

### 🎨 2. 추상화 (Abstraction)
```
src/main/java/com/kobe/oopguide/abstraction/goodcase/
├── domain/Notifier.java              # 인터페이스
├── infrastructure/
│   ├── KakaoNotifier.java            # 구현체 1
│   └── SmsNotifier.java              # 구현체 2
└── application/NotificationService.java  # 클라이언트
```

**핵심 학습 포인트:**
- 인터페이스를 통한 역할과 구현의 분리
- 계층형 아키텍처에서의 추상화 활용
- 클라이언트 코드의 변경 없는 기능 확장

### 👨‍👩‍👧 3. 상속 (Inheritance)
```
src/main/java/com/kobe/oopguide/inheritance/
├── goodcase/
│   └── domain/
│       ├── BaseEntity.java    # @MappedSuperclass
│       ├── Post.java          # extends BaseEntity
│       └── Comment.java       # extends BaseEntity
└── practice/
    └── domain/
        ├── BaseEntity.java    # 공통 메타데이터만 상속
        ├── Product.java       # 상품 고유 속성
        └── Stock.java         # Product와 연관관계 (Composition)
```

**핵심 학습 포인트:**
- JPA에서의 `@MappedSuperclass` 활용
- IS-A 관계 vs HAS-A 관계의 올바른 선택
- 상속 vs 조합(Composition)의 trade-off

### 🎭 4. 다형성 (Polymorphism)
```
src/main/java/com/kobe/oopguide/polymorphism/goodcase/
├── domain/PaymentMethod.java         # 인터페이스
├── infrastructure/
│   ├── CardPayment.java             # 신용카드 결제
│   └── BankTransferPayment.java     # 계좌이체 결제
└── application/PaymentService.java   # 다형적 처리
```

**핵심 학습 포인트:**
- 런타임에 결정되는 메서드 호출 (Dynamic Dispatch)
- 개방-폐쇄 원칙(OCP) 구현
- Spring Bean과 `@Qualifier`를 활용한 다형성

### ⚡ 5. 의존성 역전 원칙 (DIP)
```
DIP.md - 인터페이스 vs 구현체 의존성 주입 완벽 가이드
```

**핵심 학습 포인트:**
- 왜 구현체가 아닌 인터페이스에 의존해야 하는가?
- Spring DI 컨테이너의 동작 원리
- USB 포트 비유를 통한 직관적 이해

## 🎮 실행 방법

### 기본 실행
```bash
./gradlew bootRun
```

### 캡슐화 예제 실행 결과
```
1레벨에 Q 스킬을 배웠습니다.
스킬 배우기 실패: 6레벨 미만은 R 스킬을 배울 수 없습니다.

--- 5번 레벨업 ---
레벨업! 현재 레벨: 2
2레벨에 E 스킬을 배웠습니다.
레벨업! 현재 레벨: 3
3레벨에 W 스킬을 배웠습니다.
...
6레벨에 R 스킬을 배웠습니다.
야스오가 배운 스킬들: [Q, E, W, E, Q, R]
```

## 📖 학습 가이드

### 🚀 초급자 (OOP 입문)
1. **캡슐화 badcase vs goodcase 비교** - 데이터 보호의 중요성 이해
2. **상속 goodcase** - JPA에서의 상속 활용 패턴 학습
3. **DIP.md** - 인터페이스 기반 설계의 기초 이해

### 🔥 중급자 (실무 적용)
1. **추상화 + 계층형 아키텍처** - Domain/Application/Infrastructure 분리
2. **다형성 + Spring Bean** - 의존성 주입과 다형성의 결합
3. **practice 코드 리팩토링** - 스스로 코드를 개선해보기

### ⚡ 고급자 (아키텍처 설계)
1. **전체 패키지 구조 분석** - 계층간 의존성 방향 이해
2. **AI 피드백 코드 리뷰** - `aipractice` vs `mypractice` 비교
3. **SOLID 원칙 종합 적용** - 실제 프로젝트에 적용 연습

## 🔍 코드 리뷰 포인트

### ✅ 잘된 설계의 특징
- **높은 응집도(High Cohesion)**: 관련된 데이터와 기능이 한 곳에
- **낮은 결합도(Low Coupling)**: 인터페이스를 통한 느슨한 연결
- **단일 책임(SRP)**: 각 클래스가 하나의 명확한 역할
- **확장성(OCP)**: 기존 코드 수정 없이 새 기능 추가 가능

### ❌ 피해야 할 안티패턴
- **빈약한 도메인 모델**: 데이터만 있고 로직이 없는 객체
- **신의 객체(God Object)**: 너무 많은 책임을 가진 클래스
- **순환 의존성**: 서로를 참조하는 클래스들
- **구현체 직접 의존**: 인터페이스 없이 구체 클래스에 의존

## 💡 핵심 인사이트

> **"객체지향은 단순한 문법이 아닌 사고방식의 전환이다"**

- 현실 세계를 **상태와 행동을 가진 객체들의 협력**으로 모델링
- **메시지 전달** 방식으로 객체간 상호작용
- **변경에 강한 시스템**을 만들기 위한 설계 원칙들

## 📚 추천 학습 자료

- **도서**: 『객체지향의 사실과 오해』- 조영호
- **도서**: 『Clean Architecture』- Robert C. Martin
- **도서**: 『Effective Java』- Joshua Bloch
- **패턴**: GoF Design Patterns
- **원칙**: SOLID Principles

## 📞 문의 및 피드백

- **이슈 등록**: GitHub Issues 활용
- **코드 리뷰 요청**: Pull Request 생성
- **학습 관련 질문**: Discussion 활용

---