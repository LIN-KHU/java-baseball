package baseball.view;
import java.util.ArrayList;

public class OutputView {
    public static void printIntroMessage() {
        System.out.print("숫자를 입력해주세요 : ");
    }

    public static void printResult(Boolean gameEndStatus, ArrayList<Integer> resultList) {
        if (gameEndStatus) {
            printGameResult(resultList);
        }
        if (!gameEndStatus) {
            printRoundResult(resultList);
        }
    }

    public static void printGameResult(ArrayList<Integer> resultList) {
        System.out.println(resultList.get(1) + "스트라이크");
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }

    public static void printRoundResult(ArrayList<Integer> resultList) {
        if ((resultList.get(0) == 0) && (resultList.get(1) == 0)) {
            System.out.println("낫싱");
        }
        if ((resultList.get(0) == 0) && (resultList.get(1) != 0)) {
            System.out.println(resultList.get(1) + "스트라이크");
        }
        if ((resultList.get(0) != 0) && (resultList.get(1) == 0)) {
            System.out.println(resultList.get(1) + "볼");
        }
        if (resultList.get(0) != 0 && resultList.get(1) != 0) {
            System.out.println(resultList.get(0) + "볼 " + resultList.get(1) + "스트라이크");
        }
    }

}
