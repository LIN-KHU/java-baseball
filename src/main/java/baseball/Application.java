package baseball;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

public class Application {
    public static void main(String[] args) {
        //computer - 서로 다른 세 자리 랜덤 수 생성(랜덤 수 생성 → 변수에 저장)
        //Input - 사용자 입력, 예외처리, 재시작 처리

        userInput = getInput();
    }

    public static String randomNum = "";
    public static String inputNum;
    public static String userInput;

    public static int getRandom() {
        return Randoms.pickNumberInRange(1, 10);
    }

    public static String getInput() {
        try {
            inputNum = Console.readLine();
        } catch (IllegalArgumentException e) {
            System.exit(0);
        }
        return inputNum;
    }

    public static String genRandomNum() {
        for (int i = 0; i < 3; i++) {
            randomNum = randomNum.concat(Integer.toString(getRandom()));
        }
        if (!checkRandomNum()) {
            return genRandomNum();
        }
        return randomNum;
    }

    public static boolean checkRandomNum() {
        return randomNum.indexOf(0) != randomNum.indexOf(1) && randomNum.indexOf(1) != randomNum.indexOf(2) && randomNum.indexOf(2) != randomNum.indexOf(0);
    }

    public static void ifRestart() {
        if (Console.readLine().equals("1")) {//게임 시작 메소드
        }
    }
}
