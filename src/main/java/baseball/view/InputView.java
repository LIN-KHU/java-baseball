package baseball.view;

import baseball.util.InputValidator;
import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public static int inputUserNumber() {
        String value = Console.readLine();
        if (InputValidator.validator(value)) {
            return Integer.parseInt(value);
        }
        return inputUserNumber();
    }
}
