package baseball.domain;

import java.util.List;

public class User {

    private List<Integer> userNumber;

    public User(ThreeBalls balls) {
        this.userNumber = balls.getNumberList();
    }

    public List<Integer> getUserNumber() {
        return this.userNumber;
    }
}
