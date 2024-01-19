package baseball;

public class Number {
    private final int number;
    private final int firstDigit;
    private final int secondDigit;
    private final int thirdDigit;

    public Number(int number) {
        this.number = number;
        this.firstDigit = String.valueOf(number).charAt(0);
        this.secondDigit = String.valueOf(number).charAt(1);
        this.thirdDigit = String.valueOf(number).charAt(2);
    }

    public int getNumber() {
        return number;
    }

    public int getFirstDigit() {
        return firstDigit;
    }

    public int getSecondDigit() {
        return secondDigit;
    }

    public int getThirdDigit() {
        return thirdDigit;
    }
}
