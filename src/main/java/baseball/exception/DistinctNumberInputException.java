package baseball.exception;

public class DistinctNumberInputException extends BaseballException{
    public DistinctNumberInputException(){
        super("중복된 숫자는 입력할 수 없습니다.");
    }
}
