package baseball.view;

import baseball.model.Result;

public class OutputView {

    public static void printResult(Result result) {
        if (result.isSuccess()) {
            outputSuccessMessage();
        }
        if (!result.isSuccess()) {
            printNotSuccessResult(result);
        }
    }

    public static void printNotSuccessResult(Result result) {
        outputNothingMessage(result);
        outputBallMessage(result);
        outputStrikeMessage(result);
        outputBallStrikeMessage(result);
    }


    public static void outputNothingMessage(Result result) {
        if (result.isNothing()) {
            System.out.println("낫싱");
        }
    }

    public static void outputBallMessage(Result result) {
        if (result.getBall() > 0 && result.getStrike() == 0) {
            System.out.println(result.getBall() + "볼");
        }
    }

    public static void outputStrikeMessage(Result result) {
        if (result.getStrike() > 0 && result.getBall() == 0) {
            System.out.println(result.getStrike() + "스트라이크");
        }
    }

    public static void outputBallStrikeMessage(Result result) {
        if (result.getBall() > 0 && result.getStrike() > 0) {
            System.out.println(result.getBall() + "볼 " + result.getStrike() + "스트라이크");
        }
    }

    public static void outputSuccessMessage() {
        System.out.println("3스트라이크\n3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

    public static void outputRestartMessage() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }
}
