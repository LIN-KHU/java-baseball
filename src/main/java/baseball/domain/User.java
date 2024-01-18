package baseball.domain;

import baseball.view.InputView;

public class User {

    private int userNumber;

    public User() {

    }

    public void setUserNumber() {
        this.userNumber = InputView.inputUserNumber();
    }

    public int getUserNumber() { 
        return this.userNumber;
    }
}
