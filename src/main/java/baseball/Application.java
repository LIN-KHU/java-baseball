package baseball;
import java.util.*;
import camp.nextstep.edu.missionutils.Randoms;

import static baseball.view.InputView.askContinueGame;
import static baseball.view.InputView.getUserInput;
import static baseball.view.OutputView.printRoundResult;

public class Application {
    public static void main(String[] args) {
        playGame();

    }

    public static Boolean validateInput(String userInput) {
        boolean inputStatus = true;
        if (userInput.length() != 3) {
            return false;
        }
        for (int i = 0; i < 3; i++) {
            if (userInput.charAt(i) == 0) {
                return false;
            }
        }
        return inputStatus;
    }

    public static String createComputerNumber() {
        String computerNumber = "";
        for (int i = 0; i < 3; i++) {
            Integer randomIntegerTypeNumber = Randoms.pickNumberInRange(1,9);
            String randomStringTypeNumber = String.valueOf(randomIntegerTypeNumber);
            computerNumber = computerNumber + randomStringTypeNumber;
        }
        return computerNumber;
    }

    public static ArrayList<Integer> countBallAndStrike() {
        String userNumber = getUserInput(), computerNumber = createComputerNumber();
        ArrayList<Integer> comparisonResult = new ArrayList<>();
        int ballNumber = 0, strikeNumber = 0;
        for (int i = 0; i < 3; i++) {
            if (userNumber.charAt(i) == computerNumber.charAt(i)) {
                strikeNumber++;
                continue;
            } ballNumber++;
        }
        comparisonResult.add(ballNumber,strikeNumber);
        return comparisonResult;
    }

    public static Boolean validateInputNewGameStatus(String userInput) {
        return (userInput.equals("1") || userInput.equals("2"));
    }

    public static void playGame() {
        do {
            getUserInput();
            createComputerNumber();
            countBallAndStrike();
            printRoundResult();
        } while (!printRoundResult().equals("2"));
    }

}
