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
        boolean inputStatus = (userInput.length() == 3);
        for (int i = 0; i < 3; i++) {
            if (userInput.charAt(i) == '0') {
                inputStatus = false;
                break;
            }
        }
        return inputStatus;
    }

    public static ArrayList<Integer> createComputerNumber() {
        ArrayList<Integer> computerNumberList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            int randomIntegerTypeNumber = Randoms.pickNumberInRange(1,9);
            if (computerNumberList.contains(randomIntegerTypeNumber)) {
                continue;
            }
            computerNumberList.add(randomIntegerTypeNumber);
        }
        return computerNumberList;
    }

    public static ArrayList<Integer> countBallAndStrike() {
        ArrayList<Integer> userNumberList = getUserInput(), computerNumberList = createComputerNumber();
        ArrayList<Integer> comparisonResult = new ArrayList<>();
        int ballNumber = 0, strikeNumber = 0;
        for (int i = 0; i < 3; i++) {
            if (userNumberList.get(i).equals(computerNumberList.get(i))) {
                strikeNumber++;
                continue;
            }
            if (computerNumberList.contains(userNumberList.get(i))) {
                ballNumber++;
            }
        }
        comparisonResult.add(ballNumber,strikeNumber);
        return comparisonResult;
    }

    public static Boolean validateInputNewGameStatus(String userInput) {
        return userInput.equals("1") || userInput.equals("2");
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
