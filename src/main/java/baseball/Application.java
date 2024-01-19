package baseball;

import baseball.view.InputView;
import baseball.view.OutputView;

public class Application {
    public static void main(String[] args) {
        InputView input = new InputView();
        OutputView output = new OutputView();
        while (true) {
            RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
            Number answerNumber = new Number(randomNumberGenerator.makeThreeDigitNumberMadeOfDifferentNumbers());
            Game game = new Game(answerNumber, input, output);
            game.doGame();
            if (!game.askIfRetry()) {
                break;
            }
        }
    }
}
