# 08 Memory Management 01 - Backgrounds

### 메모리(기억장치) 계층구조

- processor registers
- cache memory
- main memory
- auxiliary storage



#### Block

- 보조기억장치와 주기억장치 사이의 데이터 전송 단위
- Size : 1 ~ 4 KB



#### Word

- 주기억장치와 레지스터 사이의 데이터 전송 단위
- Size : 16 ~ 64 bits
- cpu 32bit / 64bit 구분하는 단위이기도 하다



## Address Binding

- 프로그램의 논리 주소를 실제 메모리의 물리 주소로 매핑(mapping)하는 작업
- Binding 시점에 따른 구분
  - Compile time binding
  - Load time binding
  - Run time binding



### Compile time binding

- 프로세스가 메모리에 적재될 위치를 컴파일러가 알 수 있는 경우
  - 위치가 변하지 않음
- 프로그램 전체가 메모리에 올라가야 함



### Load time binding

- 메모리 적재 위치를 컴파일 시점에서 모르면, 대체 가능한 상대 주소를 생성
- 적재 시점(load time)에 시작 주소를 반영하여 사용자 코드 상의 주소를 재설정
- 프로그램 전체가 메모리에 올라가야 함



### Run-time binding

- Address binding을 수행시간까지 연기
  - 프로세스가 수행 도중 다른 메모리 위치로 이동할 수 있음
- HW의 도움이 필요
  - MMU : Memory Management Unit
- 대부분의 OS가 사용



## Dynamic Loading

- 모든 루틴을 교체 가능한 형태로 디스크에 저장
- 실제 호출 전까지는 루틴을 적재하지 않음
  - 메인 프로그램만 메모리에 적재하여 수행
  - 루틴의 호출 시점에 address binding 수행
- 장점
  - 메모리 공간의 효율적 사용



## Swapping

- 프로세서 할당이 끝나고 수행이 완료된 프로세스는 swap-device로 보내고(Swap-out)
- 새롭게 시작하는 프로세스는 메모리에 적재(Swap-in)