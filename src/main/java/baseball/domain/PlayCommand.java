package baseball.domain;

public enum PlayCommand {
    RESTART(1),
    END(2)
    ;

    private final Integer value;

    PlayCommand(Integer value) {
        this.value = value;
    }
}
