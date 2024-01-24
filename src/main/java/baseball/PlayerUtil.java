package baseball;

import baseball.view.InputView;
import baseball.view.OutputView;
import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class PlayerUtil {

    InputView inputView = new InputView();
    OutputView outputView = new OutputView();

    public String generateNumber() {
        outputView.printGetNumMessage();
        return inputView.readPlayerNumber();
    }

    public int getRestartNumber() {
        return inputView.readRestartNumber();
    }

}
