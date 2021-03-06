# 147 프로세스(Process) 관리

- 프로세스는 프로세서(처리기, CPU)에 의해 처리되는 사용자 프로그램, 시스템 프로그램, 즉 실행중인 프로그램을 의미하며, 작업(Job), 태스크(Task)라고도 한다
- 프로세스 상태 전이
  - 제출(Submit) : 작업을 처리하기 위해 사용자가 작업을 시스템에 제출한 상태
  - 접수(Hold) : 제출된 작업이 스풀 공간인 디스크의 할당 위치에 저장된 상태
  - 준비(Ready) : 프로세스가 프로세서를 할당받기 위해 기다리고 있는 상태
  - 실행(Run) : 준비상태 큐에 있는 프로세스가 프로세서를 할당받아 실행되는 상태
  - 대기(Wait), 블록(Block) : 프로세스에 입출력 처리가 필요하면 현재 실행 중인 프로세스가 중단되고, 입출력 처리가 완료될 때까지 대기하고 있는 상태
  - 종료(Terminated, Exit) : 프로세스의 실행이 끝나고 프로세스 할당이 해제된 상태
- 프로세스 상태 전이 관련 용어
  - Dispatch : 준비 상태에서 대기하고 있는 프로세스 중 하나가 프로세서를 할당받아 실행 상태로 전이되는 과정
  - Wake Up : 입출력 작업이 완료되어 프로세스가 대기 상태에서 준비 상태로 전이되는 과정
  - Spooling : 입출력장치의 공유 및 상대적으로 느린 입출력장치의 처리 속도를 보완하고 다중 프로그래밍 시스템의 성능을 향상시키기 위해 입출력할 데이터를 직접 입출력장치에 보내지 않고 나중에 한꺼번에 입출력하기 위해 디스크에 저장하는 과정