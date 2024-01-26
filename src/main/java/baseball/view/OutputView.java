package baseball.view;

import baseball.Application;
import camp.nextstep.edu.missionutils.Console;

public class OutputView implements OutputInterface{

    @Override
    public void printResult(int strikes, int balls, int[] generateAnswer, int attempts) {

        if (balls > 0) {
            System.out.println(balls + "볼 ");
        }

        if (strikes > 0) {
            System.out.println(strikes + "스트라이크");
        }

        if (strikes==0 && balls ==0) {
            System.out.println("낫싱");
        }

        if (strikes == generateAnswer.length) {
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            RestartOrEnd();
        } else {
            attempts++;
            Application.playGames(generateAnswer, attempts);
        }

    }

    @Override
    public void RestartOrEnd() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String userInput = Console.readLine();

        switch(userInput) {
            case "1":
                int[] NewGenerateAnswer = Application.generateAnswer();
                Application.playGames(NewGenerateAnswer, 0);
                break;

            case "2":
                System.out.println("게임을 종료합니다.");
                break;

            default:
                throw new IllegalArgumentException("");
        }
    }


}
