package baseball.domain;


import java.util.stream.Stream;

public class ScoreCalculator {

    public ScoreCalculator() {
    }

    public Score createScore(BallNumber ballNumber, BallNumber randomCreatedNumber) {
        return new Score(countStrike(ballNumber, randomCreatedNumber), countBall(ballNumber, randomCreatedNumber));
    }

    public int countBall(BallNumber ballNumber, BallNumber randomCreatedNumber) {
        return (int) Stream.iterate(0, i -> i + 1)
                .limit(BallNumber.NUMBER_MAX_LENGTH)
                .filter(i -> randomCreatedNumber.contains(ballNumber.getNumberAt(i)))
                .filter(i -> ballNumber.getNumberAt(i) != randomCreatedNumber.getNumberAt(i))
                .count();
    }

    public int countStrike(BallNumber ballNumber, BallNumber randomCreatedNumber) {
        return (int) Stream.iterate(0, i -> i + 1)
                .limit(BallNumber.NUMBER_MAX_LENGTH)
                .filter(i -> ballNumber.getNumberAt(i) == randomCreatedNumber.getNumberAt(i))
                .count();
    }
}
