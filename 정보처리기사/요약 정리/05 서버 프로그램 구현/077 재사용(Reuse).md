# 077 재사용(Reuse)

- 비용과 개발 시간을 절약하기 위해 이미 개발된 기능들을 파악하고 재구성하여 새로운 시스템 또는 기능 개발에 사용하기 적합하도록 최적화 시키는 작업이다
- 재사용되는 대상은 외부 모듈과의 결합도는 낮고, 응집도는 높아야 한다
- 재사용 규모에 따른 분류
  - 함수와 객체 : 클래스나 메소드 단위의 소스 코드를 재사용함
  - 컴포넌트 : 컴포넌트 자체에 대한 수정 없이 인터페이스를 통해 통신하는 방식으로 재사용함
  - 애플리케이션 : 공통된 기능들을 제공하는 애플리케이션을 공유하는 방식으로 재사용함