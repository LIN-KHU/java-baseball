package baseball.controller;

import static baseball.constants.GameStatusValue.NUMBER_LIMIT;

import baseball.constants.GameStatusValue;
import baseball.domain.BallNumber;
import baseball.domain.Score;
import baseball.domain.ScoreCalculator;
import baseball.exception.DistinctNumberInputException;
import baseball.exception.IncludeZeroValueException;
import baseball.exception.InvalidLengthException;
import baseball.view.InputView;
import baseball.view.OutputView;
import java.util.List;

public class GameClient {

    private final InputView inputView;
    private final OutputView outputView;
    private final ScoreCalculator scoreCalculator;
    private BallNumber randomCreatedNumber;

    public GameClient(InputView inputView, OutputView outputView, ScoreCalculator scoreCalculator) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.scoreCalculator = scoreCalculator;
        this.randomCreatedNumber = new BallNumber(scoreCalculator.makeComputerNumber());
    }

    public void run() {
        Score score;
        do {
            outputView.printInputNumber();
            List<Integer> number = inputView.getNumbers();
            checkDigit(number);
            checkDistinctNumbers(number);
            checkIncludeZero(number);
            BallNumber ballNumber = new BallNumber(number);
            score = scoreCalculator.createScore(ballNumber, randomCreatedNumber);
            outputView.printJudgeResult(score);
        } while (!score.isThreeStrike());
        outputView.printEndMessage();
    }
    public boolean restart() {
        outputView.printRetryCommand();
        String answer = inputView.getRestartAnswer();
        return answer.equals(GameStatusValue.GAME_RESTART);
    }

    private void checkDistinctNumbers(List<Integer> numbers) {
        if (numbers.stream().distinct().count() != numbers.size()) {
            throw new DistinctNumberInputException();
        }
    }

    private void checkIncludeZero(List<Integer> numbers) {
        if (numbers.contains(0)) {
            throw new IncludeZeroValueException();
        }
    }

    private void checkDigit(List<Integer> numbers) {
        if (numbers.size() != NUMBER_LIMIT) {
            throw new InvalidLengthException();
        }
    }
}
