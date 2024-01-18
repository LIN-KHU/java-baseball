package baseball;


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
        if (attempts > 0) {
            System.out.println("숫자를 입력해주세요: ");
        }

        String userinput = InputView.getUserInput();
        char[] userInputArray = userinput.toCharArray();

        int strikes = 0;
        int balls = 0;

        for(int i =0; i< generateAnswer.length; i++) {
            int userDigit = Character.getNumericValue(userInputArray[i]); //

            if(userDigit == generateAnswer[i]) {
                strikes++;
            } else if (containsDigit(generateAnswer, userDigit)) {
                balls++;
            }
        }

        OutputView.printResult(strikes, balls, generateAnswer, attempts);
    }

    private static boolean containsDigit(int[] generateAnswer, int userDigit) {
        for (int i =0; i< generateAnswer.length; i++) {
            if (generateAnswer[i] == userDigit) {
                return true;
            }
        }
        return false;
    }

}

    

    

