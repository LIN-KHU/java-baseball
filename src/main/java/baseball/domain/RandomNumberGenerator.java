package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class RandomNumberGenerator {

    private static final int START = 1;
    private static final int END = 9;

    public static List<Integer> generateUniqueDigitRandomNumberList() {

        List<Integer> randomNumberList = new ArrayList<Integer>();

        do {
            int randomNumber = RandomNumberGenerator.generateRandomNumber();
            if (!randomNumberList.contains(randomNumber)) {
                randomNumberList.add(randomNumber);
            }
        } while (randomNumberList.size() < ThreeBalls.NUMBER_MAX_LENGTH);

        return randomNumberList;
    }

    private static int generateRandomNumber() {
        return Randoms.pickNumberInRange(START, END);
    }

}
