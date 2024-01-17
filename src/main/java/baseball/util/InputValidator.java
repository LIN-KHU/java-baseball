package baseball.util;

import org.mockito.internal.matchers.Null;

public class InputValidator {

    public static boolean validator(String value) {
        try {
            validateNullOrNot(value);
            validateIntegerNot(value);
            validateThreeDigitNumberNot(value);
            return true;
        } catch (IllegalArgumentException e) {
            System.out.println("[ERROR] " + e.getMessage());
            return false;
        }
    }

    private static void validateNullOrNot(String value) {
        if (value.isEmpty() || value == null) {
            throw new IllegalArgumentException("값을 입력하세요.");
        }
    }

    private static void validateIntegerNot(String value) {
        try {
            Integer.parseInt(value);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자를 입력하세요.");
        }
    }

    private static void validateThreeDigitNumberNot(String value) {
        if (value.length() != 3) {
            throw new IllegalArgumentException("3자리 수를 입력하세요.");
        }
    }
}
