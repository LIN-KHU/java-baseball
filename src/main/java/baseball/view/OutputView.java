package baseball.view;

import baseball.domain.Score;

public interface OutputView {
    void printInputNumber();

    void printScore(Score score);

    void printEndMessage();

    void printRetryCommand();
}
