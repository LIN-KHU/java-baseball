package baseball.view;
import java.util.*;
import camp.nextstep.edu.missionutils.Console;
import static baseball.Application.validateInput;
import static baseball.Application.validateInputNewGameStatus;

public class InputView {
    public static String getUserInput() {
        System.out.print("숫자를 입력해주세요 : ");
        String userInput = Console.readLine();
        boolean inputStatus = validateInput(userInput);
        if (!inputStatus) {
            System.exit(0);
        }
        return userInput;
    }

    public static String askContinueGame() {
        String continueStatus = Console.readLine();
        Boolean gameStatus = validateInputNewGameStatus(continueStatus);
        if (!gameStatus) {
            System.exit(0);
        }
        return continueStatus;
    }

}
