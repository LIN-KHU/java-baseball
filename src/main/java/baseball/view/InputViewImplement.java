package baseball.view;

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
        return Console.readLine();
    }
}
