package baseball.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public static String inputConsole() {
        OutputView.printInputUserNumberMessage();
        String value = Console.readLine();
        validateIsEmpty(value);
        return value;
    }

    private static void validateIsEmpty(String value) {
        if (value.isEmpty()) {
            throw new IllegalArgumentException("값을 입력해주세요.");
        }
    }
}
