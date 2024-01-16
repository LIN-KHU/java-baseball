package baseball;

import baseball.view.InputView;
import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;
import static baseball.view.OutputView.checkResult;

public class Application {
    public static void main(String[] args) {
        Computer.genRandomNum();
        InputView.getInput();
        checkResult();
    }
}
