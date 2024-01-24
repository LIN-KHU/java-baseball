package baseball.controller;

import baseball.model.ComputerNumber;
import baseball.view.InputView;

public class BaseballGame {

    public void start(){
        InputView.inputUserNumber();
        ComputerNumber computerNumber = new ComputerNumber();
    }
}
