package baseball.view;
import camp.nextstep.edu.missionutils.Console;
public class InputView {
    private static final int userMinNumber = 100;
    private static final int userMaxNumber = 999;
    public int readUserNumber() {
        String userNumber = Console.readLine();
        checkNumeric(userNumber);
        checkUserNumberError(userNumber);
        return Integer.parseInt(userNumber);
    }

    public int readExitNumber() {
        String exitNumber = Console.readLine();
        checkNumeric(exitNumber);
        checkExitNumberError(exitNumber);
        return Integer.parseInt(exitNumber);
    }

    private void checkNumeric(String str) {
        try{
            Integer.parseInt(str);
        }
        catch (IllegalArgumentException ex){
            System.exit(1);
        }
    }
    private void checkUserNumberError(String str) {
        try{
            int number = Integer.parseInt(str);
            if (number < userMinNumber || number > userMaxNumber) {
                throw new IllegalArgumentException();
            }
        }
        catch (IllegalArgumentException ex){
            System.exit(1);
        }
    }

    private void checkExitNumberError(String str) {
        try{
            int number = Integer.parseInt(str);
            if (number != 1 && number != 2) {
                throw new IllegalArgumentException();
            }
        }
        catch (IllegalArgumentException ex){
            System.exit(1);
        }
    }
}