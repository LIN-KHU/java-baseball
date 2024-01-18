package baseball.domain;

public class CompareNumbers {
    private static int ball = 0;
    private static int strike = 0;

    public static void compareNumbers(String computerNumberStr, String userNumberStr) {
        countBall(computerNumberStr, userNumberStr);
        countStrike(computerNumberStr, userNumberStr);
    }

    private static void countBall(String computerNumberStr, String userNumberStr) {
        for (int i = 0; i < userNumberStr.length(); i++) {
            int indexNum = computerNumberStr.indexOf(userNumberStr.charAt(i));
            if (indexNum > 0 && userNumberStr.charAt(i) != computerNumberStr.charAt(i)) {
                ball += 1;
            }
        }
    }

    private static void countStrike(String computerNumberStr, String userNumberStr) {
        for (int i = 0; i < userNumberStr.length(); i++) {
            if (userNumberStr.charAt(i) == computerNumberStr.charAt(i)) {
                strike += 1;
            }
        }
    }

    public static int getBall() {
        return ball;
    }

    public static int getStrike() {
        return strike;
    }


}
