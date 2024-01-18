package baseball.exception;

public class IncludeZeroValueException extends BaseballException{
    protected IncludeZeroValueException(String errorMessage) {
        super("1~9 사이의 값을 입력해 주세요.");
    }
}
