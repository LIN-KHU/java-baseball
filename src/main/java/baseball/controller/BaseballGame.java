package baseball.controller;

import baseball.model.ComputerNumber;
import baseball.model.Result;
import baseball.model.UserNumber;
import baseball.validate.ValidateRestart;
import baseball.view.InputView;
import baseball.view.OutputView;

import java.util.List;

public class BaseballGame {

    public void start() {
        do {
            List<Integer> computerRandomNumber = makeComputerNumber();
            playGame(computerRandomNumber);
        } while (isRestart());
    }

    public List<Integer> makeComputerNumber() {
        ComputerNumber computerNumber = new ComputerNumber();
        return computerNumber.getRandomNum();
    }

    public void playGame(List<Integer> computerRandomNumber) {
        while (true) {
            UserNumber inputUserNumber = new UserNumber(InputView.inputUserNumber());
            Result result = makeResult(inputUserNumber, computerRandomNumber);
            OutputView.printResult(result);
            if (result.isSuccess()) {
                break;
            }
        }
    }

    public Result makeResult(UserNumber inputUserNumber, List<Integer> computerRandomNumber) {
        Result result = new Result();
        inputUserNumber.countBall(computerRandomNumber, result);
        inputUserNumber.countStrike(computerRandomNumber, result);
        result.updateIsNothing();
        return result;
    }

    public boolean isRestart() {
        OutputView.outputRestartMessage();
        String inputUserRestartNumber = InputView.inputUserRestartNumber();
        ValidateRestart.validateInputRestartNumber(inputUserRestartNumber);
        return inputUserRestartNumber.equals("1");
    }

}
