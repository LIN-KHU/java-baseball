package baseball.view;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class InputView {
    public List<Integer> inputNumber() {
        String value = Console.readLine();
        validateIsEmpty(value);
        List<Integer> numberList = new ArrayList<Integer>();
        for (int i = 0; i < value.length(); i++) {
            numberList.add(Character.getNumericValue(value.charAt(i)));
        }
        return numberList;
    }

    private static void validateIsEmpty(String value) {
        if (value.isEmpty()) {
            throw new IllegalArgumentException("값을 입력하세요.");
        }
    }

    public int inputRestartOption() {
        return Integer.parseInt(Console.readLine());
    }

}
