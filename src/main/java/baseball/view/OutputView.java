package baseball.view;

import baseball.Computer;

import static baseball.view.InputView.inputNum;

public class OutputView {
    public static String randomNum = "";
    public static int strike = 0;
    public static int ball = 0;

    public static void checkResult(){
        Computer.genRandomNum();
        checkStrike();
        checkBallFirst();
        checkBallSecond();
        checkBallThird();
        printGameResult();
    }

    public static void checkStrike() {
        for (int i = 0; i < inputNum.length(); i++) {
            if (inputNum.charAt(i)==randomNum.charAt(i)) {
                strike++;
            }
        }
    }

    public static void checkBallFirst() {
        for (int i = 0; i < 3; i++) {
            if (inputNum.charAt(0)==randomNum.charAt(i)) {
                ball++;
            }
        }
    }

    public static void checkBallSecond() {
        for (int i = 0; i < 3; i++) {
            if (inputNum.charAt(1)==randomNum.charAt(i)) {
                ball++;
            }
        }
    }

    public static void checkBallThird() {
        for (int i = 0; i < 3; i++) {
            if (inputNum.charAt(2)==randomNum.charAt(i)) {
                ball++;
            }
        }
    }

    public static void printGameResult() {
        switch(strike){
            case 3: System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
                System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
                InputView.checkIfRestart();
                break;
            case 0:
                if (ball == 0) {
                    System.out.println("낫싱");}
                break;
            default:
            {
                System.out.println((ball - strike) + "볼" + " " + strike + "스트라이크");
            }
        }

    }


}