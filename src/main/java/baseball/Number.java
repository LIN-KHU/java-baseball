package baseball;
import java.util.ArrayList;

public class Number {
    private final String numberString;
    private final ArrayList<Character> digitList;

    public Number(int number) {
        this.numberString = String.valueOf(number);
        this.digitList = new ArrayList<Character>();
        for (int i = 0; i < numberString.length(); i++) {
            digitList.add(numberString.charAt(i));
        }
    }

    public int countStrike(Number other) {
        int strike = 0;
        for (int i = 0; i < numberString.length(); i++) {
            if (digitList.get(i) == other.digitList.get(i)) {
                strike++;
            }
        }
        return strike;
    }

    public int countBall(Number other) {
        int ball = 0;
        for (int i = 0; i < numberString.length(); i++) {
            if ((digitList.get(i) != other.digitList.get(i)) &&
                    digitList.contains(other.digitList.get(i))){
                ball++;
            }
        }
        return ball;
    }
}