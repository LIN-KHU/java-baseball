package baseball.validate;

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
}
