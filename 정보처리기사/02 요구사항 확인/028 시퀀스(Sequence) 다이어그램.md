# 028 시퀀스(Sequence) 다이어그램

## 1 동적 모델링의 개념

- 동적 모델링은 시스템의 내부 구성 요소들의 상태가 시간의 흐름에 따라 변화하는 과정과 변화하는 과정에서 발생하는 상호 작용을 표현한 것이다
- 동적 모델링은 시스템 내부 구성 요소들 간에 이루어지는 동작이라는 관점(View)에서 표현한다
- 동적 모델링은 시스템이 실행될 때 구성 요소들 간의 메시지 호출, 즉 오퍼레이션을 통한 상호 작용에 초점을 둔다
- UML의 시퀀스 다이어그램, 커뮤니케이션 다이어그램, 상태 다이어그램이 동적 모델링에 해당한다



## 2 시퀀스(Sequence) 다이어그램의 개념

- 시퀀스 다이어그램은 시스템이나 객체들이 메시지를 주고받으며 시간의 흐름에 따라 상호 작용하는 과정을 액터, 객체, 메시지 등의 요소를 사용하여 그림으로 표현한 것이다
- 시퀀스 다이어그램은 시스템이나 객체들의 상호 작용 과정에서 주고받는 메시지를 표현한다
- 시퀀스 다이어그램을 통해 각 동작에 참여하는 시스템이나 객체들의 수행 기간을 확인할 수 있다
- 시퀀스 다이어그램은 클래스 내부에 있는 객체들을 기본 단위로 하여 그들의 상호 작용을 표현한다
- 시퀀스 다이어그램은 주로 기능 모델링에서 작성한 유스케이스 명세서를 하나의 표현 범위로 하지만, 하나의 클레스에 포함된 ㄴ오퍼레이션을 하나의 범위로 표현하기도 한다



## 3 시퀀스 다이어그램의 구성 요소

- 시퀀스 다이어그램은 액터, 객체, 라이프라인, 활성 상자, 메시지 등으로 구성된다



### 액터(Actor)

- 시스템으로부터 서비스를 요청하는 외부 요소로, 사람이나 외부 시스템을 의미한다



### 객체(Object)

- 메시지를 주고받는 주체이다
- 콜론(:)을 기준으로 앞쪽에는 객체명을 뒤쪽에는 클래스명을 기술한다



### 라이프라인(Lifeline)

- 객체가 메모리에 존재하는 기간으로, 객체 아래쪽에 점선을 그어 표현한다
- 객체 소멸(X)이 표시된 기간까지 존재한다



### 활성 상자(Activation Box)

- 객체가 메시지를 주고받으며 구동되고 있음을 표현한다
- 라이프라인 상에 겹쳐 직사각형 형태로 표현한다



### 메시지(Message)

- 객체가 상호 작용을 위해 주고받는 메시지이다
- 메시지의 전달 순서는 메시지의 위치에 따라 묵시적으로 결정되지만 메시지에 번호를 표기하여 전달 순서를 표현할 수 있다
- 화살표의 방향은 메시지를 받는 쪽으로 향하게 표현한다
- 메시지의 종류
  - 속이 찬 실선 화살표
    - 의미 : 동기
    - 메시지를 보낸 후 결과가 반환될 때까지 기다린다
  - 실선 화살표
    - 의미 : 비동기
    - 메시지를 보낸 후 결과가 반환될 때까지 기다리지 않고 다른 작업을 수행한다
  - 점선 화살표
    - 의미 : 생성
    - 메시지를 받는 새로운 객체를 생성한다
  - 속이 찬 점선 화살표
    - 의미 : 응답
    - 동기 메시지에 대한 수행 결과이다



### 객체 소멸

- 라이프라인 상에서 객체 소멸 표시를 만나면 해당 객체는 더 이상 메모리에 존재하지 않음을 의미한다
- 객체 라이프라인 마지막에 X로 표현한다



### 프레임(Frame)

- 다이어그램의 전체 또는 일부를 묶어 표현한다
- 전체, 복합적인 부분(Combined Fragment), 반복 구조, 선택 구조 등이 프레임 안에 표현된다
- 프레임의 왼쪽 위에 다이어그램의 종류와 제목을 표기한다