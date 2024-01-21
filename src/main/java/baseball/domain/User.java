package baseball.domain;

import baseball.view.InputView;

public class User {

    private String userNumber;

    public User() {

    }

    public void setUserNumber() {
        this.userNumber = InputView.inputConsole();
    }

    public int getUserNumber() { 
        return this.userNumber;
    }
}
