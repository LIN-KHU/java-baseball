package baseball.controller;

import baseball.domain.*;
import baseball.view.InputView;
import baseball.view.OutputView;

import java.util.List;

public class GameManager {

    private PlayCommand command;

    private final InputView inputView;
    private final OutputView outputView;

    public GameManager(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void run() {
        Result result;
        ThreeBalls computerNumber = new ThreeBalls(RandomNumberGenerator.generateUniqueDigitRandomNumberList());
        Computer computer = new Computer(computerNumber);

        do {
            User user = getUser();

            CompareNumbers compareNumbers = new CompareNumbers(computer, user);

            result = new Result(compareNumbers);
            outputView.printResult(result);
        } while (!result.isThreeStrike());
        outputView.printEndMessage();
        restartOrNot();
        if (command == PlayCommand.RESTART) {
            run();
        }
    }

    private User getUser() {
        try {
            outputView.printInputUserNumberMessage();
            List<Integer> inputValue = inputView.inputNumber();
            ThreeBalls userNumber = new ThreeBalls(inputValue);
            User user = new User(userNumber);
            return user;
        } catch (IllegalArgumentException e) {
            System.out.println("[ERROR] " + e.getMessage());
            return getUser();
        }
    }

    public void restartOrNot() {
        try {
            outputView.printRestartMessage();
            PlayCommand userCommand = getUserCommand(inputView.inputRestartOption());
            if (userCommand == PlayCommand.RESTART) {
                restart();
            }
            if (userCommand == PlayCommand.END) {
                gameEnd();
            }
        } catch (IllegalArgumentException e) {
            System.out.println("[ERROR] " + e.getMessage());
            restartOrNot();
        }
    }

    private PlayCommand getUserCommand(int userInput) {
        switch (userInput) {
            case 1:
                return PlayCommand.RESTART;
            case 2:
                return PlayCommand.END;
            default:
                throw new IllegalArgumentException("1 또는 2를 입력하세요.");
        }
    }


    private void restart() {
        command = PlayCommand.RESTART;
    }

    private void gameEnd() {
        command = PlayCommand.END;
    }

}
