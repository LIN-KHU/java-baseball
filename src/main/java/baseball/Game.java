package baseball;

import baseball.view.InputView;
import baseball.view.OutputView;
import com.sun.org.apache.bcel.internal.Const;

import java.util.ArrayList;
import java.util.List;

import static baseball.message.MessageConst.*;

public class Game {

    public static final Integer COUNT_NUMBER = 3;

    Computer computer = new Computer();

    InputView inputView = new InputView();
    OutputView outputView = new OutputView();

    List<Integer> computerNumberList = new ArrayList<>(); //3개의 숫자를 저장하고 있는 객체.
    List<Integer> playerNumberList = new ArrayList<>();

    public void startGame() {
        computerNumberList = computer.generateNumber();

        int result = 0;

        while (result == 0) {
            String playerNumber = getPlayerNumber();
            if (validateInputNumber(playerNumber)) {
                playerNumberList = savePlayerNumber(playerNumber);
                result = compareNumber(computerNumberList, playerNumberList);
            }
        }
        checkRestart();
    }

    private String getPlayerNumber() {
        outputView.printGetNumMessage();
        return inputView.readPlayerNumber();
    }

    private Boolean validateInputNumber(String playerNumber) { //예외 사항 -> 요란하게 실패하는게 좋음

        if (validateInputNumberType(playerNumber)) {
            return validateInputNumberSize(playerNumber);
        }
        return false;
    }

    private List<Integer> savePlayerNumber(String playerNumber) {
        List<Integer> getPlayerNumberList = new ArrayList<>();
        String[] splitInputNumber = playerNumber.split("");
        for (String s : splitInputNumber) {
            getPlayerNumberList.add(Integer.parseInt(s));
        }
        return getPlayerNumberList;
    }

    private boolean validateInputNumberSize(String playerNumber) {
        if (playerNumber.length() != COUNT_NUMBER) { //매직 넘버 , 상수화
            System.out.println(ERROR_INPUT_SIZE_MSG);
            return false;
        }
        return true;
    }

    private boolean validateInputNumberType(String playerNumber) {
        String[] splitNumber = playerNumber.split("");
        for (String s : splitNumber) {
            try {
                Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.println(ERROR_INPUT_TYPE_MSG);
                return false;
            }
        }
        return true;
    }

    private int compareNumber(List<Integer> computerNumberList, List<Integer> playerNumberList) {

        int strike = 0;
        int ball = 0;
        int nothing = 0;

        for (int i = 0; i < playerNumberList.size(); i++) {
            int index = computerNumberList.indexOf(playerNumberList.get(i));
            if (index == i) {
                strike++;
            } else if (index == -1) {
                nothing++;
            } else {
                ball++;
            }
        }
        playerNumberList.clear();
        return checkResultState(strike, ball, nothing);
    }

    private int checkResultState(int strike, int ball, int nothing) { // else if 메소드 분리

        int state = 0;

        if (nothing == 3) {
            outputView.printNothingMessage();
        } else if (ball > 0) {
            countBallAndStrike(ball, strike);
        } else if (strike > 0) {
            state = countStrike(strike);
        }

        return state;
    }

    private void countBallAndStrike(int ball, int strike) {
        if(strike > 0) {
            outputView.printBallAndStrikeMessage(ball, strike);
        }
        else outputView.printBallMessage(ball);
    }

    private Integer countStrike(int strike) {
        outputView.printStrikeMessage(strike);
        if (strike == 3) {
            outputView.printGameSuccessMessage();
            return 1;
        }
        return 0;
    }

    private void checkRestart() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        int restartNumber = 0;

        try {
            restartNumber = inputView.readRestartNumber();
        } catch (NumberFormatException e) {
            System.out.println(ERROR_RESTART_INPUT_MSG);
            checkRestart();
        }

        if (restartNumber == 1) {
            startGame();
        } else if (restartNumber != 2) {
            System.out.println(ERROR_RESTART_INPUT_MSG);
            checkRestart();
        }
    }
}
