package baseball;

import baseball.controller.BaseballGame;
import baseball.model.ComputerNumber;
import baseball.model.Result;
import baseball.model.UserNumber;
import baseball.view.InputView;
import baseball.view.OutputView;

import java.awt.*;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        //TODO: 숫자 야구 게임 구현
        BaseballGame baseballGame = new BaseballGame();
        baseballGame.start();
    }
}
