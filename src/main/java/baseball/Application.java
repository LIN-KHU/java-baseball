package baseball;

import baseball.controller.BaseballGame;
import baseball.view.InputView;
import baseball.view.OutputView;

public class Application {
    public static void main(String[] args) {
        //TODO: 숫자 야구 게임 구현
        OutputView.outputNumber();
        InputView.inputNumber();
        BaseballGame baseballGame = new BaseballGame();
        baseballGame.start();
    }
}
