# 기능 목록 - 숫자 야구 게임

## domain

### ThreeBalls
- 3자리인 수에 대한 객체
- 3자리인 수에 대한 검증 존재
  - 0 포함하는지?
  - 3자리인지?
  - 각 자리에 서로 다른 수가 입력되는지?

### RandomNumberGenerator
- 임의의 수 생성하는 기능

### Computer
- 컴퓨터 객체
  - ThreeBalls 객체를 통해 3자리 수 받아옴. 
  - 컴퓨터의 수를 반환

### User
- 사용자 객체
  - ThreeBalls 객체를 통해 3자리 수 받아옴.
  - 사용자의 수를 반환

### CompareNumbers
- 컴퓨터 객체, 사용자 객체 받아서 두 수 비교
    - 볼 계산
    - 스트라이크 계산

### Result
- CompareNumbers에서 계산한 볼, 스트라이크 받아서 출력할 결과 문자열 생성함.

<br>

## view

### InputView
- 사용자의 수를 입력 받기
  - 사용자 입력값 공백인지 아닌지 검증
- 재시작 여부 입력 받기

### OutputView
- 사용자의 수 입력 받는 문구 출력
- Result 객체에서 생성된 결과 출력
- 3스트라이크 시 게임 다시 시작 여부 묻기
- 재시작 여부 묻는 문구 출력

<br>

## controller

### GameManager
- 게임 시작 기능
  - 사용자 객체 생성 시 입력 값 예외 처리 기능
  - 재시작 여부 묻고 예외 발생 시 처리하는 기능
    - 사용자 입력 값을 PlayCommand의 값으로 변환하는 기능
    - 재시작 선택 시 필드에 command를 RESTART으로 설정
    - 게임 종료 선택 시 필드에 command를 END로 설정

### PlayCommand
- RESTART와 END에 각각 1과 2 상수 저장

<br>

# 기능 프로세스

(1) 컴퓨터 객체 생성<br>
(2) 임의의 수 받아서 저장하는 ThreeBalls 객체 생성<br>
(3) 컴퓨터 객체에 (2)의 객체 인자로 받기<br>
<br>
(4) 사용자 수 입력 받기<br>
(5) 사용자 수 받아서 저장하는 ThreeBalls 객체 생성<br>
(6) (5)의 객체 인자로 받아서 사용자 객체 생성<br>
<br>
(7) CompareNumbers 객체 생성, 인자는 컴퓨터 객체와 사용자 객체<br>
(8) Result 객체 생성, 인자는 (7)의 객체. 결과 출력<br>
(9) 3 스트라이크 시 게임 종료<br>
<br>
(10)  재시작 여부 묻고 재시작 입력 시 (1)부터 다시 시작