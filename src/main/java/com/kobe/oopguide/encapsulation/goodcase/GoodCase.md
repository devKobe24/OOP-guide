* **결과 :**
  * 이제 `Member`의 `level`은 `levelUp()` 메서드를 통하지 않고는 절대 변경할 수 없습니다.
  * 레벨 관리의 모든 책임은 `Member` 객체 안에 **캡슐화(Encapsulation)**되어 **응집도(Cohesion)**가 높아졌습니다.
  * `LevelService`는 `Member`의 내부 구조를 몰라도 되므로 **결합도(Coupling)**가 낮아졌습니다.