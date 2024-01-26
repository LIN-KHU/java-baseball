package baseball.view;
import camp.nextstep.edu.missionutils.Console;

import static baseball.view.OutputView.printIntroMessage;

public class InputView {
    public static String getUserInput() {
        printIntroMessage();
        return Console.readLine();
    }

    public static String askContinueGame() {
        return Console.readLine();
    }

}
