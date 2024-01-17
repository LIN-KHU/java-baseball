package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class ComputerNumber {
    private int computerNumber;
    public ComputerNumber() {

    }

    public int createThreeDigitNumberFromRandomNumbers() {
        return generateRandomNumber() * 100 + generateRandomNumber() * 10 + generateRandomNumber();
    }

    private int generateRandomNumber() {
         return Randoms.pickNumberInRange(1, 9);
    }

    public void setComputerNumber() {
        this.computerNumber = createThreeDigitNumberFromRandomNumbers();
    }

    public int getComputerNumber() {
        return this.computerNumber;
    }
}
