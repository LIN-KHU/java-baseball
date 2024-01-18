package baseball.exception;

public abstract class BaseballException extends IllegalArgumentException {
    private static final String ERROR_PREFIX = "[ERROR] ";

    protected BaseballException(String errorMessage) {
        super(ERROR_PREFIX + errorMessage);
    }
}
