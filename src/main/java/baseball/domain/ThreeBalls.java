package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.HashSet;
import java.util.Set;

public class ThreeBall {

    int balls;

    private int createThreeDigitNumberFromRandomNumbers() {
        Set<Integer> numSet = new HashSet<Integer>();
        while (true) {
            int num = generateRandomNumber();
            numSet.add(num);
            if (numSet.size() >= 3) {
                break;
            }
        }
        Integer[] numArray = numSet.toArray(new Integer[0]);
        return numArray[0] * 100 + numArray[1] * 10 + numArray[2];
    }


    private int generateRandomNumber() {
        return Randoms.pickNumberInRange(1, 9);
    }

}
