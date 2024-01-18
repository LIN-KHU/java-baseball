package baseball.domain;

import java.util.ArrayList;
import java.util.List;

public class CompareNumbers {

    public static List<Integer> compareNumbers(int computerNumber, int userNumber) {
        String computerNumberStr = convertIntegerToString(computerNumber);
        String userNumberStr = convertIntegerToString(userNumber);
        List<Integer> list = new ArrayList<Integer>();
        list.add(countBall(computerNumberStr, userNumberStr));
        list.add(countStrike(computerNumberStr, userNumberStr));
        return list;
    }

    private static String convertIntegerToString(int number) {
        return Integer.toString(number);
    }

    private static int countBall(String computerNumberStr, String userNumberStr) {
        int ball = 0;
        for (int i = 0; i < userNumberStr.length(); i++) {
            int indexNum = computerNumberStr.indexOf(userNumberStr.charAt(i));
            if ((indexNum >= 0) && (userNumberStr.charAt(i) != computerNumberStr.charAt(i))) {
                ball += 1;
            }
        }
        return ball;
    }

    private static int countStrike(String computerNumberStr, String userNumberStr) {
        int strike = 0;
        for (int i = 0; i < userNumberStr.length(); i++) {
            if (userNumberStr.charAt(i) == computerNumberStr.charAt(i)) {
                strike += 1;
            }
        }
        return strike;
    }
}
