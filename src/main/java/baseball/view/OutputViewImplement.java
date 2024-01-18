package baseball.view;

import baseball.domain.JudgeResult;

public class OutputViewImplement implements OutputView{
    @Override
    public void printInputNumber() {
        System.out.println("숫자를 입력해주세요 : ");
    }

    @Override
    public void printJudgeResult(JudgeResult judgeResult) {
        System.out.println(judgeResult);
    }

    @Override
    public void printEndMessage() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

    @Override
    public void printRetryCommand() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }
}
