package baseball.view;

import baseball.domain.Result;

import java.util.List;

public class OutputView {
    public void printInputUserNumberMessage() {
        System.out.print("숫자를 입력해주세요 : ");
    }

    public void printResult(Result result) {
        System.out.println(result);
    }

    public void printEndMessage() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

    public void printRestartMessage() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }
}
