package baseball.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView implements InputInterface  {
    @Override
    public String getUserInput() {
        System.out.println("숫자를 입력해주세요 :");
        String userInput = Console.readLine();

        if (!isValidInput(userInput)) {
            throw new IllegalArgumentException("");
        }

        return userInput;
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
