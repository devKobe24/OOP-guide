# 1. 예제 코드의 아키텍처.
## 추상화 예제 코드의 각 구성요소는 어떤 아키텍처 계층일까?
* 이는 계층형(Layered Architecture)와 의존관계 역전 원칙(DIP, Dependency Inversion Principle)을 이해하는 데 매우 중요한 부분입니다.

### Q. 🤔 Notifier, KakaoNotifier, SmsNotifier, NotificationService는 어떤 계층일까?
결론부터 말씀드리면 각 클래스는 다음과 같은 계층에 속합니다.

* 1. `NotificationService` ➞ **애플리케이션 계층(Application Layer)**
* 2. `Notifier` 인터페이스 ➞ **도메인 계층(Domain Layer)**
* 3. `KakaoNotifier`, `SmsNotifier` ➞ **인프라스트럭처 계층(Infrastructrue Layer)**

### ✅ 각 계층의 역할과 책임.
1. `NotificationService` ➞ **애플리케이션 계층(Application Layer)**
`NotificationService`는 **"언제, 왜 알림을 보내야 하는가?"** 라는 **비즈니스 규칙(정책)** 을 결정하는 책임을 가집니다.
   * 역할:
     * 애플리케이션의 핵심 비즈니스 로직을 지휘(Orchestration)합니다.
       * 예를 들어 "주문이 완료되면 고객에게 알림을 보낸다." 또는 "비밀번호가 변경되면 사용자에게 알림을 보낸다" 와 같은 워크플로우를 처리합니다.
     * 어떻게 알림을 보낼지(카카오톡? SMS?)에 대한 구체적인 방법은 알지 못합니다.
       * 단지 `Notifier`라는 추상적인 '알림 담당자'에게 "이 메시지를 보내줘"라고 **명령**할 뿐입니다.
     * `@Service` 어노테이션이 붙는 클래스들이 바로 이 계층에 속합니다.

2. `Notifier` 인터페이스 ➞ **도메인 계층(Domain Layer)**
`Notifier` 인터페이스는 **"알림을 보낸다"** 는 **도메인의 핵심 개념(역학)을 추상화(abstraction)** 한 것입니다.
    * 역할:
      * 도메인 계층의 가장 안쪽에 위치합니다. 외부의 구체적인 기술로부터 도메인을 보호하는 **방화벽(firewall)** 역할을 합니다.
      * 애플리케이션 계층(`NotificationService`)이 의존하는 **추상화(Abstraction)** 를 제공합니다.
        * 이를 통해 `NotificationService`는 `KakaoNotifier`나 `SmsNotifier` 같은 구체적인 클래스에 직접 의존하지 않고, 오직 `Notifier라는 '역할'에만 의존하게 됩니다.
          * **이것이 바로 의존관계 역전 원칙(DIP, Dependency Inversion Principle)** 의 핵심입니다.

3. `KakaoNotifier`, `SmsNotifier` ➞ **인프라스트러처 계층(Infrastructure Layer)**
`KakaoNotifier`와 `SmsNotifier`는 `Notifier`라는 '역할'을 **실제로 수행하는 구체적인 기술 구현체**입니다.
    * 역할:
      * 어떻게 알림을 보낼 것인지에 대한 모든 기술적인 세부 사항을 책임집니다. 카카오톡 API 서버와 통신하거나, SMS 발송 업체의 서버와 연동하는 등의 복잡한 로직은 모두 이 계층에 숨겨져 있습니다.
      * 이들은 도메인 계층의 `Notifier` 인터페이스를 **구현(implements)** 함으로써, 애플리케이션의 다른 부분과 소통할 수 있는 통로를 마련합니다.
      * 데이터베이스, 외부 API, 메시징 큐 등 외부 시스템과 연동하는 모든 코드가 이 계층에 속합니다.

## ✌️ 결과.
* `NotificationService`는 `Notifier`라는 **추상적인 인터페이스**에만 의존합니다.
  * 나중에 이메일 알림 기능이 추가되어도 `EmailNotifier`를 만들기만 하면 될 뿐, `NotificationService`의 코드는 전혀 수정할 필요가 없습니다.
    * 이것이 바로 **추상화(Abstraction)를 통해 결합도(Coupling)를 낮춘** 대표적인 예입니다.