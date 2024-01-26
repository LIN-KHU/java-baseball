package baseball;
import java.util.*;
import camp.nextstep.edu.missionutils.Randoms;

import static baseball.view.InputView.askContinueGame;
import static baseball.view.InputView.getUserInput;
import static baseball.view.OutputView.printResult;

public class Application {
    public static void main(String[] args) {
        while (true) {
            ArrayList<Integer> computerNumberList = createComputerNumber();
            Boolean newGame = playGame(computerNumberList);
            if (newGame) {
                continue;
            }
        }
    }

    public static ArrayList<Integer> createComputerNumber() {
        ArrayList<Integer> computerNumberList = new ArrayList<>();
        while (true) {
            int randomIntegerNumber = Randoms.pickNumberInRange(1,9);
            if (computerNumberList.contains(randomIntegerNumber)) {
                continue;
            }
            computerNumberList.add(randomIntegerNumber);
            if (computerNumberList.size() == 3) {
                break;
            }
        }
        return computerNumberList;
    }

    public static Boolean playGame(ArrayList<Integer> computerNumberList) {
        while (true) {
            String stringUserInput = getUserInput();
            validateUserNumberInput(stringUserInput);
            ArrayList<Integer> userNumberList = createUserNumberList(stringUserInput);
            ArrayList<Integer> resultList = countBallAndStrike(userNumberList, computerNumberList);
            Boolean gameEndStatus = checkGameEndStatus(resultList);
            printResult(gameEndStatus, resultList);
            if (gameEndStatus) {
                String userNewGameStartStatus = askContinueGame();
                String newGameStartStatus = validateInputNewGameStatus(userNewGameStartStatus);
                endGame(newGameStartStatus);
                break;
            }
        }
        return true;
    }

    public static void validateUserNumberInput(String userInput) {
        if (userInput.length() != 3) {
            System.exit(0);
        }
        for (int i = 0; i < 3; i++) {
            String StringTypeNumber = String.valueOf(userInput.charAt(i));
            char charTypeNumber = userInput.charAt(i);
            if (StringTypeNumber.equals("0")) {
                System.exit(0);
            }
            if (countDuplicateNumbers(userInput, charTypeNumber) > 1) {
                System.exit(0);
            }
        }
    }

    public static Integer countDuplicateNumbers(String userInput, char number) {
        int count = 0;
        for (int i = 0; i < 3; i++) {
            if (userInput.charAt(i) == number) {
                count++;
            }
        }
        return count;
    }

    public static ArrayList<Integer> createUserNumberList(String userInput) {
        ArrayList<Integer> userNumberList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            userNumberList.add((int) userInput.charAt(i) - '0');
        }
        return userNumberList;
    }

    public static ArrayList<Integer> countBallAndStrike(ArrayList<Integer> userNumberList, ArrayList<Integer> computerNumberList) {
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
        comparisonResult.add(ballNumber);
        comparisonResult.add(strikeNumber);
        return comparisonResult;
    }

    public static Boolean checkGameEndStatus(ArrayList<Integer> resultList) {
        return (resultList.get(1) == 3);
    }

    public static String validateInputNewGameStatus(String userInput) {
        String newGameStatus = "1";
        if (!(userInput.equals("1") || userInput.equals("2"))) {
            System.exit(0);
        }
        if (userInput.equals("2")) {
            newGameStatus = "2";
        }
        return newGameStatus;
    }

    public static void endGame(String startNewGameStatus) {
        if (startNewGameStatus.equals("2")) {
            System.exit(0);
        }
    }

}
