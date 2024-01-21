package baseball;

import baseball.view.InputView;
import baseball.view.OutputView;
import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        while (true) {
            ComputerNum com = new ComputerNum();
            while (true) {
                List<Integer> player = getNumbers();
                int ball = 0;
                int strike = 0;

                strike = countStrike(com, player, strike);
                ball = countBall(com, player, ball);

                if (strike == 3) {
                    printResultIfGameFinish();
                    break;
                } else {
                    printResultIfGameNotFinish(strike, ball);
                }


            }
            // 예외처리 하기
            restart();
        }
    }

    public static List<Integer> getNumbers() {
        InputView input = new InputView();
        OutputView output = new OutputView();

        List<Integer> numbers = new ArrayList<>();
        output.printGetNumber();

        int num = input.typeGetNumber();
        while (num > 0) {
            numbers.add(num % 10);
            num /= 10;
        }
        return numbers;
    }

    public static int countStrike(ComputerNum com, List<Integer> player, int strike) {
        if (player.get(0) == com.get(0)) strike++;
        if (player.get(1) == com.get(1)) strike++;
        if (player.get(2) == com.get(2)) strike++;

        return strike;
    }

    public static int countBall(ComputerNum com, List<Integer> player, int ball) {
        if ((player.get(0) == com.get(1)) || (player.get(0) == com.get(2))) ball++;
        if ((player.get(1) == com.get(0)) || (player.get(1) == com.get(2))) ball++;
        if ((player.get(2) == com.get(0)) || (player.get(2) == com.get(1))) ball++;

        return ball;
    }

    public static void printResultIfGameFinish() {
        OutputView output = new OutputView();
        output.printResultIfGameFinish();
    }

    public static void printResultIfGameNotFinish(int strike, int ball) {
        OutputView output = new OutputView();
        output.printResultIfGameNotFinish(strike, ball);
    }

    public static void restart() {
        InputView input = new InputView();
        OutputView output = new OutputView();

        output.printRestart();
        int restart = input.typeRestartNumber();
        if (restart == 2) {
            System.exit(0);
        }
    }
}