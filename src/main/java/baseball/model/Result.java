package baseball.model;

/**
 * 온전히 결과에 대한 책임만
 */
public class Result {
    private int ball;
    private int strike;
    private boolean isNothing;

    public Result() {
        this.ball = 0;
        this.strike = 0;
        this.isNothing = false;
    }

    public int getBall() {
        return ball;
    }

    public int getStrike() {
        return strike;
    }

    public boolean isNothing() {
        return isNothing;
    }

    public void updateBall() {
        this.ball+=1;
    }

    public void updateStrike() {
        this.strike+=1;
    }

    public void updateIsNothing() {
        if (this.ball == 0 && this.strike == 0) {
            this.isNothing = true;
        }
    }

    public boolean isSuccess() {
        return this.strike == 3;
    }
}