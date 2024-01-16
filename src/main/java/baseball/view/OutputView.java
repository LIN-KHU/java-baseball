package baseball.view;

import static baseball.view.InputView.inputNum;

public class OutputView {
    public static String randomNum = "";
    public static int strike = 0;
    public static int ball = 0;

    public static void checkResult(){
        checkStrike();
        checkBallFirst();
        checkBallSecond();
        checkBallThird();
        gameResult();
    }

    public static void checkStrike() {
        for (int i = 0; i < 3; i++) {
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

    public static void gameResult() {
        switch(strike){
            case 3: System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
                System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
                InputView.ifRestart();
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
