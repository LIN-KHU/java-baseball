package baseball.view;

import baseball.domain.JudgeResult;

public interface OutputView {
    void printInputNumber();

    void printJudgeResult(JudgeResult judgeResult);

    void printEndMessage();

    void printRetryCommand();
}
