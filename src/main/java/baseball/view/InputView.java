package baseball.view;
import camp.nextstep.edu.missionutils.Console;
public class InputView {
    private static final int userMinNumber = 100;
    private static final int userMaxNumber = 999;
    public int readUserNumber() {
        String str =  Console.readLine();
        int number = 0;
        try {
            number = checkUserNumberError(str);
        } catch (IllegalArgumentException e) {
            System.exit(1);
        }
        return number;
    }

    public int readExitNumber() {
        String str = Console.readLine();
        int number = 0;
        try {
            number = checkExitNumberError(str);
        } catch (IllegalArgumentException e) {
            System.exit(1);
        }
        return number;
    }

    private int checkUserNumberError(String str) {
        try{
            int number = Integer.parseInt(str);
            if (number < userMinNumber || number > userMaxNumber) {
                throw new IllegalArgumentException();
            }
            return number;
        }
        catch (NumberFormatException ex){
            throw new IllegalArgumentException();
        }
    }

    private int checkExitNumberError(String str) {
        try{
            int number = Integer.parseInt(str);
            if (number != 1 && number != 2) {
                throw new IllegalArgumentException();
            }
            return number;
        }
        catch (NumberFormatException ex){
            throw new IllegalArgumentException();
        }
    }
}