# 144 가상 기억장치(Virtual Memory)

- 보조기억장치(하드디스크)의 일부를 주기억장치처럼 사용하는 것으로, 용량이 작은 주기억장치를 마치 큰 용량을 가진 것처럼 사용하는 것으로, 현재 사용되는 운영체제에서 흔히 사용되는 기법이다



## 가상 기억장치 구현 기법

- 페이징(Paging) 기법
  - 가상 기억장치에 보관되어 있는 프로그램과 주기억장치의 영역을 동일한 크기로 나눈 후 나눠진 프로그램(페이지)을 동일하게 나눠진 주기억장치의 영역에 적재시켜 실행하는 기법으로, 외부 단편화는 발생하지 않으나 내부 단편화는 발생할 수 있음
- 세그먼테이션(Segmentation) 기법
  - 가상 기억장치에 보관되어 있는 프로그램을 다양한 크기의 논리적인 단위로 나눈 후 주기억장치에 적재시켜 실행시키는 기법으로, 내부 단편화는 발생하지 않으나 외부 단편화는 발생할 수 있음