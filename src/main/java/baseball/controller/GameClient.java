package baseball.controller;

import static baseball.constants.GameStatusValue.NUMBER_LIMIT;

import baseball.constants.GameStatusValue;
import baseball.domain.BallNumber;
import baseball.domain.RandomNumberGenerator;
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

    public GameClient(InputView inputView, OutputView outputView, ScoreCalculator scoreCalculator) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.scoreCalculator = scoreCalculator;
    }

    public void run() {
        Score score;
        BallNumber randomCreatedNumber = new BallNumber(new RandomNumberGenerator().makeRandomNumbers());
        do {
            outputView.printInputNumber();
            List<Integer> number = inputView.getNumbers();
            checkDigit(number);
            checkDistinctNumbers(number);
            checkIncludeZero(number);
            BallNumber ballNumber = new BallNumber(number);
            score = scoreCalculator.createScore(ballNumber, randomCreatedNumber);
            outputView.printScore(score);
        } while (!score.isThreeStrike());
        outputView.printEndMessage();
    }

    public boolean restart() {
        outputView.printRetryCommand();
        int answer = inputView.getRestartAnswer();
        return (answer == GameStatusValue.GAME_RESTART);
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
