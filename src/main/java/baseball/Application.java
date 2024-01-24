package baseball;

import baseball.model.ComputerNumber;
import baseball.model.UserNumber;
import baseball.view.InputView;

public class Application {
    public static void main(String[] args) {
        //TODO: 숫자 야구 게임 구현
//        BaseballGame baseballGame = new BaseballGame();
//        baseballGame.start();
        UserNumber inputUserNumber = new UserNumber(InputView.inputUserNumber());
        ComputerNumber computerNumber = new ComputerNumber();
        System.out.println(computerNumber.getRandomNum());
    }
}
