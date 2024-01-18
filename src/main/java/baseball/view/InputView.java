package baseball.view;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InputView {

    public List<Integer> readPlayerNumber() {

        List<Integer> playerNumberList = new ArrayList<>();

        String getPlayerNumber = Console.readLine();
        /**
         *  예외 1. 숫자가 아닌 다른 타입이 들어간 경우
         * 예외 2. 중복된 숫자가 들어간 경우
         * 예외 3. 세 자리 숫자가 아닌 경우
         * */

        String[] splitNumber = getPlayerNumber.split("");

        for (int i = 0; i < 3; i++) {
            int playerNumber = Integer.parseInt(splitNumber[i]);
            playerNumberList.add(playerNumber);
        }

        return playerNumberList;
    }

    public int readRestartNumber() {
        String str = Console.readLine();
        return Integer.parseInt(str);
    }
}
