package baseball.view;
import java.util.*;
import camp.nextstep.edu.missionutils.Console;
import static baseball.Application.validateInput;
import static baseball.Application.validateInputGameStatus;

public class InputView {
    public static String getUserInput() {
        while(true) {
            System.out.println("숫자를 입력해주세요 : ");
            String userInput = Console.readLine();
            try {
                validateInput(userInput);
                return userInput;
            } catch (IllegalArgumentException error) {
                System.out.println(error.getMessage());
            }
        }
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
