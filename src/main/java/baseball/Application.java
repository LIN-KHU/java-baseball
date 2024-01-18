package baseball;
import baseball.view.InputView;
import java.util.*;
import camp.nextstep.edu.missionutils.Randoms;

public class Application {
    public static void main(String[] args) {
        //TODO: 숫자 야구 게임 구현

    }

    public static void validateInput(String userInput) {
        if (userInput.length() != 3) {
                throw new IllegalArgumentException("[ERROR] 입력값은 3자리 숫자여야 합니다");
        }
    }

    public static String createComputerNumber() {
        String computerNumber = "";
        for (int i = 0; i < 3; i++) {
            Integer randomIntegerTypeNumber = Randoms.pickNumberInRange(1,9);
            String randomStringTypeNumber = String.valueOf(randomIntegerTypeNumber);
            computerNumber = computerNumber + randomStringTypeNumber;
        }
        return computerNumber;
    }

}
