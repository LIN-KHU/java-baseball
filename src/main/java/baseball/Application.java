package baseball;

import baseball.view.InputView;
import baseball.view.OutputView;

public class Application {
    public static void main(String[] args) {
        while (true) {
            int answerNumber = new RandomNumberGenerator().makeThreeDigitNumberMadeOfDifferentNumbers();
            Game game = new Game(answerNumber);
            game.doGame();
            if (!game.askIfRetry()) {
                break;
            }
        }
    }
}
