package baseball;

import baseball.view.InputView;
import baseball.view.OutputView;

public class Game {
    private final InputView input;
    private final OutputView output;
    private final Number answer;

    public Game(Number answer, InputView input, OutputView output) {
        this.answer = answer;
        this.input = input;
        this.output = output;
    }
    public void doGame() {
        int ball, strike = 0;
        while (strike != 3) {
            output.printGuessNumberInstruction();
            Number userNumber = new Number(input.readUserNumber());
            strike = calStrike(userNumber);
            ball = calBall(userNumber);
            output.printGameResult(ball, strike);
        }
    }

    private int calBall(Number userNumber) {
        int result = 0;
        if (( answer.getFirstDigit() == userNumber.getSecondDigit() ) || ( answer.getFirstDigit() == userNumber.getThirdDigit() )) {
            result++;
        }
        if (( answer.getSecondDigit() == userNumber.getFirstDigit() ) || ( answer.getSecondDigit() == userNumber.getThirdDigit() )) {
            result++;
        }
        if (( answer.getThirdDigit() == userNumber.getFirstDigit() ) || ( answer.getThirdDigit() == userNumber.getSecondDigit() )) {
            result++;
        }
        return result;
    }

    private int calStrike(Number userNumber) {
        int result = 0;
        if (answer.getFirstDigit() == userNumber.getFirstDigit()) {
            result++;
        }
        if (answer.getSecondDigit() == userNumber.getSecondDigit()) {
            result++;
        }
        if (answer.getThirdDigit() == userNumber.getThirdDigit()) {
            result++;
        }
        return result;
    }

    public boolean askIfRetry() {
        return (input.readExitNumber() == 1);
    }
}
