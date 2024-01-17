# 기능 목록 - 숫자 야구 게임

## domain

### ComputerNumber
필드: 수
  - 1에서 9까지 임의의 수 생성
  - 임의 생성한 3개의 수를 3자리인 수로 만들기 
  - 컴퓨터의 수를 반환

### UserNumber
필드: 수
  - 사용자의 수를 설정
  - 사용자의 수를 반환

### ConvertType
  - 문자열을 정수로 변환
  - 정수를 문자열로 변환

### CompareNumbers
  - 볼 값 반환
  - 스트라이크 값 반환


## util

### InputValidator
  - 입력값이 비어 있거나 null인 경우
  - 입력값이 숫자가 아닌 경우
  - 입력값이 3자리가 아닌 경우

## view

### InputView
  - 사용자의 수를 입력 받기

### OutputView
  - 비교한 결과를 출력
  - 3스트라이크 시 게임 다시 시작 여부 묻기