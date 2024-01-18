package baseball;

import baseball.message.MessageConst;

import java.util.ArrayList;
import java.util.List;

public class Game {

    ComputerUtil computer = new ComputerUtil();
    PlayerUtil player = new PlayerUtil();

    List<Integer> computerNumber = new ArrayList<>();
    List<Integer> playerNumber = new ArrayList<>();

    public void startGame() {
        computerNumber = computer.generateNumber();

        int result = 0;

        while (result == 0) {
            playerNumber = player.generateNumber();
            result = compareNumber(computerNumber, playerNumber);
        }

        checkRestart();
    }

    private int compareNumber(List<Integer> computerNumber, List<Integer> playerNumber) {

        int strike = 0;
        int ball = 0;
        int nothing = 0;

        for (int i = 0; i < playerNumber.size(); i++) {
            int index = computerNumber.indexOf(playerNumber.get(i));
            if (index == i) {
                strike++;
            } else if (index == -1) {
                nothing++;
            } else {
                ball++;
            }
        }

        return checkResultState(strike, ball, nothing);
    }

    private int checkResultState(int strike, int ball, int nothing) {

        int state = 0;

        if (nothing == 3) {
            System.out.println(MessageConst.NOTHING);
        } else if (ball > 0) {
            if (strike > 0) {
                System.out.println(ball + MessageConst.BALL + " " + strike +  MessageConst.STRIKE);
            } else {
                System.out.println(ball + MessageConst.BALL);
            }
        } else if (strike > 0) {
            System.out.println(strike + MessageConst.STRIKE);
            if (strike == 3) {
                System.out.println(MessageConst.SUCCESS_MSG);
               state = 1;
            }
        }

        return state;
    }

    private void checkRestart() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        int restartNumber = player.getRestartNumber();
        if(restartNumber == 1){
            startGame();
        } else if (restartNumber == 2) {

        } else {

        }
    }
}
