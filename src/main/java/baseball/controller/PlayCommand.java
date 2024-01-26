package baseball.controller;

public enum PlayCommand {
    RESTART(1),
    END(2)
    ;

    private final Integer value;

    PlayCommand(Integer value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }


}