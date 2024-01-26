package baseball;

import baseball.controller.BaseballGame;
import baseball.model.ComputerNumber;
import baseball.model.UserNumber;
import baseball.view.InputView;
import baseball.view.OutputView;

import java.awt.*;

public class Application {
    public static void main(String[] args) {
        //TODO: 숫자 야구 게임 구현
//        BaseballGame baseballGame = new BaseballGame();
//        baseballGame.start();
        ComputerNumber computerNumber = new ComputerNumber();
//        while (true) {
//            //스트라이크, 볼 처리
//            UserNumber inputUserNumber = new UserNumber(InputView.inputUserNumber());
//
//            //만약 다 맞추면 반복문 종료
//
//
//        }
        //1 or 2 입력 통해서 다시 게임 진행할지 종료할지 선택
        OutputView.outputSuccessMessage();
        OutputView.outputRestartMessage();
        String inputUserRestartNumber = InputView.inputUserRestartNumber();
        if(!inputUserRestartNumber.equals("1")  && !inputUserRestartNumber.equals("2")) {
            throw new IllegalArgumentException("잘못된 입력입니다");
        }
        if(inputUserRestartNumber.equals("1")){
            InputView.inputUserNumber();
            ComputerNumber newComputerNumber = new ComputerNumber();
            while (true) {
                //스트라이크, 볼 처리
                UserNumber inputUserNumber = new UserNumber(InputView.inputUserNumber());

                //만약 다 맞추면 반복문 종료


            }

        }
        if(inputUserRestartNumber.equals("2")){
            return ;
        }
    }
}
