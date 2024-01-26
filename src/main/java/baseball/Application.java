package baseball;

import baseball.controller.GameManager;
import baseball.view.InputView;
import baseball.view.OutputView;

public class Application {
    public static void main(String[] args) {
        //TODO: 숫자 야구 게임 구현
        OutputView outputView = new OutputView();
        InputView inputView = new InputView();

        GameManager manager = new GameManager(inputView, outputView);
        manager.run();

    }
}
