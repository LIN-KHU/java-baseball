package baseball.domain;

import java.util.ArrayList;
import java.util.List;

public class BallNumber {
    public static int NUMBER_MAX_LENGTH = 3;

    private final List<Integer> numbers;

    public BallNumber(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public int getNumberAt(int index) {
        return numbers.get(index);
    }

    public boolean contains(int number) {
        return numbers.contains(number);
    }
}
