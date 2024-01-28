package baseball.validate;

import java.util.HashSet;
import java.util.Set;

public class ValidateUserNumber {

    public static void isNumber(String userNumber) {
        try {
            int toNumber = Integer.parseInt(userNumber);
        } catch (NumberFormatException e) {
            System.out.println("숫자로 입력해주세요");
        }
    }

    public static void is3DigitNumber(String userNumber) {
        if (userNumber.length() != 3) {
            throw new IllegalArgumentException("3자리 숫자로 입력해주세요");
        }
    }

    public static void isDulplicateDigit(String userNumber) {
        Set<Character> digitSet = new HashSet<>();
        for (char digit : userNumber.toCharArray()) {
            if (!digitSet.add(digit)) {
                throw new IllegalArgumentException("각 자리 숫자가 중복되지 않게 입력해주세요.");
            }
        }
    }
}
