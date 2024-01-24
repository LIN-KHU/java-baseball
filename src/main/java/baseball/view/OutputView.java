package baseball.view;

import java.util.StringJoiner;

public class OutputView {
    private static final String ballMessage = "볼";
    private static final String strikeMessage = "스트라이크";
    private static final String nothingMessage = "낫싱";
    public void printGuessNumberInstruction() {
        System.out.print("숫자를 입력해주세요 : ");
    }

    public void printGameResult(int ball, int strike) {
        if (strike == 3) {
            System.out.println("3스트라이크\n3개의 숫자를 모두 맞히셨습니다! 게임 종료\n게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            return;
        }
        printWhenNotGameOver(ball, strike);
    }

    private void printWhenNotGameOver(int ball, int strike) {
        if (ball > 0 || strike > 0){
            printBallStrike(ball, strike);
            return;
        }
        printWhenNothing(ball, strike);
    }

    private void printWhenNothing(int ball, int strike) {
        if (ball == 0 && strike == 0) {
            System.out.println(nothingMessage);
            return;
        }
    }
    private void printBallStrike(int ball, int strike) {
        StringJoiner sj = new StringJoiner(" ");
        if (ball != 0) {
            sj.add(Integer.toString(ball)+ballMessage);
        }
        if (strike != 0) {
            sj.add(Integer.toString(strike)+strikeMessage);
        }
        System.out.println(sj);
    }
}
