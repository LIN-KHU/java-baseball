package baseball;

import baseball.view.InputInterface;
import baseball.view.OutputInterface;
import baseball.view.InputView;
import baseball.view.OutputView;
import camp.nextstep.edu.missionutils.Randoms;

public class Application {
    public static void main(String[] args) {

        int[] generateAnswer = generateAnswer();
        playGames(generateAnswer, 0);
    }

    public static int[] generateAnswer() {
        int[] randomNumbers = new int[3];

        randomNumbers[0] = Randoms.pickNumberInRange(1, 9);
        randomNumbers[1] = Randoms.pickNumberInRange(1, 9);
        randomNumbers[2] = Randoms.pickNumberInRange(1, 9);

        return randomNumbers;
    }

    public static void playGames(int[] generateAnswer, int attempts) {

        InputInterface Input = createInput();
        OutputInterface Output = createOutput();

        char[] userInputArray = GetUserInputArray(Input);

        int strikes = 0;
        int balls = 0;

        for(int i =0; i< generateAnswer.length; i++) {
            int userDigit = Character.getNumericValue(userInputArray[i]);

            if(userDigit == generateAnswer[i]) {
                strikes++;
            }
            if (containsDigit(generateAnswer, userDigit)) {
                balls++;
            }
        }

        Output.printResult(strikes, balls, generateAnswer, attempts);
    }

    private static boolean containsDigit(int[] generateAnswer, int userDigit) {
        for (int number : generateAnswer) {
            if (number == userDigit) {
                return true;
            }
        }
        return false;
    }

    private static InputInterface createInput() {
        return new InputView();
    }

    private static OutputInterface createOutput() {
        return new OutputView();
    }

    private static char[] GetUserInputArray(InputInterface Input) {
        String userInput = Input.getUserInput();
        return userInput.toCharArray();
    }

}

    

    

