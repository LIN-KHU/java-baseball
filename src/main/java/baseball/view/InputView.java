package baseball.view;
import java.util.*;
import camp.nextstep.edu.missionutils.Console;
import static baseball.Application.validateInput;
import static baseball.Application.validateInputNewGameStatus;

public class InputView {
    public static ArrayList<Integer> getUserInput() {
        ArrayList<Integer> userInputList = new ArrayList<>();
        System.out.print("숫자를 입력해주세요 : ");
        String userInput = Console.readLine();
        boolean inputStatus = validateInput(userInput);
        if (!inputStatus) {
            System.exit(0);
        }
        for (int i = 0; i < 3; i++) {
            userInputList.add((int) userInput.charAt(i));
        }
        return userInputList;
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
