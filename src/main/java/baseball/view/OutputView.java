package baseball.view;

import baseball.Application;

public class OutputView {

    public static void printResult(int strikes, int balls, int[] generateAnswer, int attempts) {

        if (strikes >0) {
            System.out.println("스트라이크" + strikes + "개 ");
        }
        
        if (balls > 0) {
            System.out.println("볼" + balls + "개 ");
        }

        if (strikes ==0 && balls ==0) {
            System.out.println("낫딩 ");
        }

        if (strikes == generateAnswer.length) {
            System.out.println("3개의 숫자를 모두 맞쳤습니다! 게임 종료");
            InputView.RestartOrEnd();

        } else {
            Application.playGames(generateAnswer, attempts);
        }

    }

}
