package baseball.view;

import baseball.Application;
import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public static String getUserInput() {

        System.out.println("숫자를 입력해주세요 :");
        String userInput = Console.readLine();

        try{
            validateInput(userInput);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return getUserInput();
        }

        return userInput;
    }

    public static void RestartOrEnd() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String userInput = Console.readLine();

        switch(userInput) {
            case "1":
                int[] newgenerateAneswer = Application.generateAnswer();
                Application.playGames(newgenerateAneswer, 0);
                break;

            case "2":
                System.out.println("게임을 종료합니다.");
                break;

            default:
                throw new IllegalArgumentException("유효한 숫자를 입력해주세요.");
        }
    }

    private static void validateInput(String userInput) {
        if(!isValidInput(userInput)) {
            throw new IllegalArgumentException("유효한 숫자를 입력해주세요.");
        }
    }

    private static boolean isValidInput(String userInput) {
        try {
            Integer.parseInt(userInput);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    
}
