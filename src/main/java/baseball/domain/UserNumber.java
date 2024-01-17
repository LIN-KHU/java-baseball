package baseball.domain;

import baseball.view.InputView;

public class UserNumber {

    private int userNumber;

    public UserNumber() {

    }

    public void setUserNumber() {
        this.userNumber = InputView.inputUserNumber();
    }

    public int getUserNumber() {
        return this.userNumber;
    }
}
