package baseball.view;

import baseball.controller.InputValidator;
import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public static int inputUserNumber() {
        OutputView.printInputUserNumberMessage();
        String value = Console.readLine();
        if (InputValidator.inputUserNumberValidator(value)) {
            return Integer.parseInt(value);
        }
        return inputUserNumber();
    }

    public static int inputRestartOrNotNumber() {
        OutputView.printRestartOrNotMessage();
        String value = Console.readLine();
        if (InputValidator.inputRestartOrNotNumberValidator(value)) {
            return Integer.parseInt(value);
        }
        return inputRestartOrNotNumber();
    }
}
