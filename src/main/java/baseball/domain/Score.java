package baseball.domain;

public class Score {
    private int strike;
    private int ball;

    private final String BALL = "볼";
    private final String STRIKE = "스트라이크";
    private final String NOTHING = "낫싱";
    private final String DELIMITER = " ";

    public Score(int strike, int ball) {
        this.strike = strike;
        this.ball = ball;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (isNothing()) {
            return NOTHING;
        }
        if (ball > 0) {
            stringBuilder.append(ball).append(BALL).append(DELIMITER);
        }
        if (strike > 0) {
            stringBuilder.append(strike).append(STRIKE);
        }
        return stringBuilder.toString();
    }

    public boolean isNothing() {
        return strike == 0 && ball == 0;
    }
}
