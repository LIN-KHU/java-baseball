package baseball.view;

import java.util.StringJoiner;

public class OutputView {
    public void printGuessNumberInstruction() {
        System.out.print("숫자를 입력해주세요 : ");
    }

    public void gameResult(int ball, int strike) {
        if (strike == 3) {
            System.out.println("3스트라이크\n3개의 숫자를 모두 맞히셨습니다! 게임 종료\n게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        }
        else if (ball == 0 && strike == 0) {
            System.out.println("낫싱");
        }
        else {
            printBallStrike(ball, strike);
        }
    }

    private void printBallStrike(int ball, int strike) {
        StringJoiner sj = new StringJoiner(" ");
        if (ball != 0) {
            sj.add(Integer.toString(ball)+"볼");
        }
        if (strike != 0) {
            sj.add(Integer.toString(strike)+"스트라이크");
        }
        System.out.println(sj);
    }
}
