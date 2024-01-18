package baseball.domain;


import java.util.List;
import java.util.stream.Stream;

public class ScoreCalculator {
    private final RandomNumberGenerator randomNumberGenerator;

    public ScoreCalculator(RandomNumberGenerator randomNumberGenerator) {
        this.randomNumberGenerator = randomNumberGenerator;
    }

    public Score createScore(BallNumber ballNumber, BallNumber randomCreatedNumber) {
        return new Score(countBall(ballNumber, randomCreatedNumber), countStrike(ballNumber, randomCreatedNumber));
    }

    public int countBall(BallNumber ballNumber, BallNumber randomCreatedNumber) {
        return (int) Stream.iterate(0, i -> i + 1)
                .filter(i -> randomCreatedNumber.contains(ballNumber.getNumberAt(i)))
                .filter(i -> ballNumber.getNumberAt(i) != randomCreatedNumber.getNumberAt(i))
                .count();
    }

    public int countStrike(BallNumber ballNumber, BallNumber randomCreatedNumber) {
        return (int) Stream.iterate(0, i -> i + 1)
                .filter(i -> ballNumber.getNumberAt(i) == randomCreatedNumber.getNumberAt(i))
                .count();
    }

    public List<Integer> makeComputerNumber() {
        return randomNumberGenerator.makeRandomNumbers();
    }
}
