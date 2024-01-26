package baseball.domain;

import java.util.List;

public class Computer {

    private final List<Integer> computerNumber;

    public Computer(ThreeBalls balls) {
        this.computerNumber = balls.getNumberList();
    }

    public List<Integer> getComputerNumber() {
        return this.computerNumber;
    }
}
