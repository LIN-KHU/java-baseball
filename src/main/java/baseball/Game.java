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
        int ball = 0;
        int strike = 0;
        while (strike != 3) {
            output.printGuessNumberInstruction();
            Number userNumber = new Number(input.readUserNumber());
            strike = userNumber.countStrike(answer);
            ball = userNumber.countBall(answer);
            output.printGameResult(ball, strike);
        }
    }

    public boolean askIfRetry() {
        return (input.readExitNumber() == 1);
    }
}
