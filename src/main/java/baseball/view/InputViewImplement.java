package baseball.view;

import static baseball.constants.GameStatusValue.NUMBER_LIMIT;

import baseball.exception.InvalidLengthException;
import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.List;

public class InputViewImplement implements InputView{
    @Override
    public List<Integer> getNumbers() {
        List<Integer> numbers = new ArrayList<>();

        String input = Console.readLine();
        checkDigit(input);
        for (Character c : input.toCharArray()) {
            numbers.add(c - '0');
        }
        return numbers;
    }

    @Override
    public String getRestartAnswer() {
        return Console.readLine();
    }

    private void checkDigit(String input) {
        if (input.length() != NUMBER_LIMIT) {
            throw new InvalidLengthException();
        }
    }
}
