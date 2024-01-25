package baseball.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public InputView(){}

    // 예외처리 하기
    // 1. 정수 타입을 입력하지 않을 때
    // 2. 입력한 정수의 각 자리 숫자가 서로 다른 정수가 아닐 때
    // 3. 1~9사이의 숫자가 아닐 때
    // 4. 세자리 수가 아닐 때
    public int typeGetNumber(){
        return Integer.parseInt(Console.readLine());

    }

    // 예외처리하기
    // 1. 정수 타입을 입력하지 않을 때
    // 2. 1 혹은 2가 아닐 때
    public int typeRestartNumber(){
        return Integer.parseInt(Console.readLine());
    }

}
