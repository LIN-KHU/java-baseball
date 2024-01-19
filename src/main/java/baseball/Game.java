package baseball;

import baseball.view.InputView;
import baseball.view.OutputView;

public class Game {
    private final InputView input;
    private final OutputView output;
    private final int answer;

    public Game(int answer, InputView input, OutputView output) {
        this.answer = answer;
        this.input = input;
        this.output = output;
    }
    public void doGame() {
        int ball, strike = 0;
        while (strike != 3) {
            output.printGuessNumberInstruction();
            int userNumber = input.userNumber();
            strike = calStrike(userNumber);
            ball = calBall(userNumber,strike);
            output.gameResult(ball, strike);
        }
    }

    private int calBall(int number, int strike) {
        int result = 0;
        char[] answerArray = String.valueOf(answer).toCharArray();
        char[] userArray = String.valueOf(number).toCharArray();
        if ((answerArray[0] == userArray[1]) || (answerArray[0] == userArray[2])) {
            result++;
        }
        if ((answerArray[1] == userArray[0]) || (answerArray[1] == userArray[2])) {
            result++;
        }
        if ((answerArray[2] == userArray[0]) || (answerArray[2] == userArray[1])) {
            result++;
        }
        return result;
    }

    private int calStrike(int number) {
        int result = 0;
        char[] answerArray = String.valueOf(answer).toCharArray();
        char[] userArray = String.valueOf(number).toCharArray();
        for (int i = 0; i < 3; i++) {
            if (answerArray[i] == userArray[i]) {
                result++;
            }
        }
        return result;
    }

    public boolean askIfRetry() {
        return (input.exitNumber() == 1);
    }
}
