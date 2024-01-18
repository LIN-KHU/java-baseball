package baseball.view;
import java.util.ArrayList;
import static baseball.Application.countBallAndStrike;
import static baseball.view.InputView.askContinueGame;

public class OutputView {
    public static String printRoundResult() {
        String gameStatus = "3";
        ArrayList<Integer> resultList = countBallAndStrike();
        if (resultList.get(1) == 3) {
            System.out.println(resultList.get(1) + "스트라이크");
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            gameStatus = askContinueGame();
        }
        if (resultList.get(0) == 0 && resultList.get(1) == 0) {
            System.out.println("낫싱");
        }
        if (resultList.get(0) == 0 && resultList.get(1) != 0) {
            System.out.println(resultList.get(1) + "스트라이크");
        }
        if (resultList.get(0) != 0 && resultList.get(1) == 0) {
            System.out.println(resultList.get(1) + "볼");
        }
        if (resultList.get(0) != 0 && resultList.get(1) != 0) {
            System.out.println(resultList.get(0) + "볼 " + resultList.get(1) + "스트라이크");
        }
        return gameStatus;
    }
}
