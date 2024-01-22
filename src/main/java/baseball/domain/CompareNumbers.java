package baseball.domain;

import java.util.ArrayList;
import java.util.List;

public class CompareNumbers {

    private List<Integer> computerNumber;
    private List<Integer> userNumber;

    public CompareNumbers(Computer computer, User user) {
        this.computerNumber = computer.getComputerNumber();
        this.userNumber = user.getUserNumber();
    }

    public int countBall() {
        int ball = 0;
        for (int i = 0; i < this.userNumber.size(); i++) {
            if ((computerNumber.contains(userNumber.get(i))) && (computerNumber.get(i) != userNumber.get(i))) {
                ball++;
            }
        }
        return ball;
    }

    public int countStrike() {
        int strike = 0;
        for (int i = 0; i < this.userNumber.size(); i++) {
            if (computerNumber.get(i) == userNumber.get(i)) {
                strike++;
            }
        }
        return strike;
    }
}
