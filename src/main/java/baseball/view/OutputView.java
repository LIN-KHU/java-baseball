package baseball.view;

import baseball.message.MessageConst;

import static baseball.message.MessageConst.*;

public class OutputView {

    public void printGetNumMessage() {
        System.out.print(INPUT_MSG);
    }

    public void printNothingMessage() {System.out.println(NOTHING);}

    public void printBallAndStrikeMessage(int ball, int strike) {System.out.println(ball + BALL + " " + strike + STRIKE);}

    public void printBallMessage(int ball) {System.out.println(ball + BALL);}

    public void printStrikeMessage(int strike) {System.out.println(strike + STRIKE);}

    public void printGameSuccessMessage() {System.out.println(SUCCESS_MSG);}
}
