package baseball.view;

import java.util.List;

public class OutputView {
    public static void printInputUserNumberMessage() {
        System.out.print("숫자를 입력해주세요 : ");
    }

    public static void printBallAndStrikeMessage(List<Integer> list) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(nothingStr(list));
        stringBuilder.append(ballStr(list));
        if (stringBuilder.length() > 0) {
            stringBuilder.append(" ");
        }
        stringBuilder.append(strikeStr(list));
        System.out.println(stringBuilder.toString());
    }

    private static String nothingStr(List<Integer> list) {
        if ((list.get(0) == 0) && (list.get(1) == 0)) {
            return "낫싱";
        }
        return "";
    }

    private static String ballStr(List<Integer> list) {
        if (list.get(0) > 0) {
            return list.get(0) + "볼";
        }
        return "";
    }

    private static String strikeStr(List<Integer> list) {
        if (list.get(1) > 0) {
            return list.get(1) + "스트라이크";
        }
        return "";
    }

    public static void printThreeStrikeAndGameEnd(List<Integer> list){
        if (list.get(1) == 3) {
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        }
    }

    public static void printRestartOrNotMessage() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }
}
