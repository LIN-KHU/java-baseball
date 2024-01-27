package baseball.validate;

public class ValidateRestart {

    public static void validateInputRestartNumber(String inputRestartNumber){
        if (!inputRestartNumber.equals("1") && !inputRestartNumber.equals("2")) {
            throw new IllegalArgumentException("잘못된 입력입니다");
        }
    }
}
