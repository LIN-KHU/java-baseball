package baseball.view;

import baseball.message.MessageConst;
import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static baseball.message.MessageConst.*;

public class InputView {

    public String readPlayerNumber() {
        List<Integer> playerNumberList = new ArrayList<>();
        return Console.readLine();
    }

    public int readRestartNumber() {
        String str = Console.readLine();
        return Integer.parseInt(str);
    }
}
