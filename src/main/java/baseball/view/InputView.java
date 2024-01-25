package baseball.view;

import baseball.Computer;
import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public static String inputNum;

    public static void getInput() {
        System.out.print("숫자를 입력해주세요 : ");
        try {
            inputNum = Console.readLine();
        } catch (IllegalArgumentException e) {
            System.exit(0);
        }
    }
    public static void checkIfRestart() {
        String inputRestart = Console.readLine();
        if (inputRestart.equals("1")) {
            Computer.genRandomNum();
            InputView.getInput();

        }
    }
}