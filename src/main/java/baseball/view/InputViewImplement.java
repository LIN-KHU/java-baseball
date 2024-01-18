package baseball.view;

import baseball.exception.UndefinedCommandException;
import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.List;

public class InputViewImplement implements InputView {
    @Override
    public List<Integer> getNumbers() {
        List<Integer> numbers = new ArrayList<>();
        String input = Console.readLine();
        for (Character c : input.toCharArray()) {
            numbers.add(c - '0');
        }
        return numbers;
    }

    @Override
    public String getRestartAnswer() {
        String input = Console.readLine();
        if (!(input.contains("1") || input.contains("2"))) {
            throw new UndefinedCommandException();
        }
        return input;
    }
}
