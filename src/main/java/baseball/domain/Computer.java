package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.*;

public class Computer {
    private final int computerNumber;
    public Computer(ThreeBall balls) {
        this.computerNumber = balls.balls;
    }


    private void validate() {

    }

    public int getComputerNumber() {
        return this.computerNumber;
    }
}
