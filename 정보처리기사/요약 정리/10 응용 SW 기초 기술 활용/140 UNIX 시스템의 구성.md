# 140 UNIX 시스템의 구성

## 커널(Kernel)

- UNIX의 가장 핵심적인 부분이다
- 하드웨어를 보호(캡슐화)하고 프로그램들과 하드웨어 간의 인터페이스 역할을 담당한다
- 프로세스, 기억장치, 파일, 입출력 관리, 프로세스 간 통신, 데이터 전송 및 변환 등 여러 가지 기능을 수행한다
- 컴퓨터 부팅 시 주기억장치에 적재되어 상주하면서 실행된다



## 쉘(Shell)

- 사용자의 명령어를 인식하여 프로그램을 호출하고, 명령을 수행하는 명령어 해석기이다
- 시스템과 사용자 간의 인터페이스를 담당한다
- DOS의 COMMAND.COM과 같은 기능을 수행한다
- 주기억장치에 상주하지 않고, 명령어가 포함된 파일 형태로 존재하며 보조기억장치에서 교체 처리가 가능하다
- 종류 : Bourne Shell, C Shell, Korn Shell 등