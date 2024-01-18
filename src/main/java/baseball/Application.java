package baseball;
import baseball.view.InputView;
import java.util.*;

public class Application {
    public static void main(String[] args) {
        //TODO: 숫자 야구 게임 구현

    }

    public static void validateInput(String userInput) {
        if (userInput.length() != 3) {
                throw new IllegalArgumentException("[ERROR] 입력값은 3자리 숫자여야 합니다");
        }
    }
}
