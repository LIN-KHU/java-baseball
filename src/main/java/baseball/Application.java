package baseball;

import baseball.controller.GameClient;
import baseball.domain.RandomNumberGenerator;
import baseball.domain.ScoreCalculator;
import baseball.view.InputView;
import baseball.view.InputViewImplement;
import baseball.view.OutputView;
import baseball.view.OutputViewImplement;

public class Application {
    public static void main(String[] args) {
        InputView inputView = new InputViewImplement();
        OutputView outputView = new OutputViewImplement();
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        ScoreCalculator scoreCalculator = new ScoreCalculator();
        GameClient gameClient = new GameClient(inputView, outputView, scoreCalculator);

        do {
            gameClient.run();
        } while (gameClient.restart());
    }
}
