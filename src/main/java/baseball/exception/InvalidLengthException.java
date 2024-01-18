package baseball.exception;

public class InvalidLengthException extends BaseballException{
    public InvalidLengthException() {
        super("3글자를 입력해 주세요.");
    }
}
