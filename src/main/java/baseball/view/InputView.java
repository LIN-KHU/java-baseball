package baseball.view;
import java.util.*;
import camp.nextstep.edu.missionutils.Console;
import static baseball.Application.validateInput;
import static baseball.Application.validateInputGameStatus;

public class InputView {
    public static String getUserInput() {
        String gameStatus = "error";
        System.out.print("숫자를 입력해주세요 : ");
        String userInput = Console.readLine();
        boolean inputStatus = validateInput(userInput);
        if (inputStatus) {
            gameStatus = userInput;
        }
        return gameStatus;
    }

    public static String askContinueGame() {
        String userInput = Console.readLine();
        Boolean gameStatus = validateInputGameStatus(userInput);
        if (!gameStatus) {
            System.exit(0);
        }
        return userInput;
    }

}
