package baseball.controller;

import baseball.domain.CompareNumbers;
import baseball.domain.Computer;
import baseball.domain.User;
import baseball.view.InputView;
import baseball.view.OutputView;

import java.util.List;


public class GameManager {

    public GameManager() {

    }

    public void gameStart() {
        Computer computer = new Computer();
        int computerNumber = computer.getComputerNumber();

        User user1 = new User();

        List<Integer> list = userNumberInputAndCompareNumbersProcessingLogic(user1, computerNumber);

        OutputView.printThreeStrikeAndGameEnd(list);
        int restartNum = InputView.inputRestartOrNotNumber();
        if (restartNum == 1) {
            gameStart();
        }
    }

    private List<Integer> userNumberInputAndCompareNumbersProcessingLogic(User user, int computerNumber) {
        user.setUserNumber();
        int userNumber = user.getUserNumber();
        List<Integer> list = CompareNumbers.compareNumbers(computerNumber, userNumber);
        OutputView.printBallAndStrikeMessage(list);
        if (list.get(1) == 3) {
            return list;
        }
        return userNumberInputAndCompareNumbersProcessingLogic(user, computerNumber);
    }

}
