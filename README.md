# 자동차 경주 게임

## 기능 요구 사항

---

### 자동차에 이름 부여
* 자동차 이름이 5글자 초과시 예외 처리
* 자동차 이름이 공백일 시 예외 처리

### 자동차 이동
* 랜덤값이 4 이상일 경우 전진
* 랜덤값이 3 이하일 경우 멈춤

### 랜덤값 생성
* 0부터 9사이의 랜덤 값을 생성

### 게임 진행
* 자동차별로 랜덤값 생성과 이동을 n회 만큼 반복

### 우승자 결정
* n회 만큼의 반복이 완료되면 가장 멀리 이동한 자동차를 우승자로 선정
* 우승자는 한 명 이상일 수 있음

### 입력
* 자동차 이름을 쉼표로 구분하여 입력
* 몇 번을 이동할 것인지(n) 입력

### 출력
* 입력된 자동차 이름과 반복 횟수 출력
* 매 실행 마다 중간결과를 출력
* 우승자 출력