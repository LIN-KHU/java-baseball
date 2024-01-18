package baseball.exception;

public class UndefinedCommandException extends BaseballException{
    public UndefinedCommandException() {
        super("1(재시작) 혹은 2(종료)를 입력해 주세요.");
    }
}
