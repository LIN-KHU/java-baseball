package baseball;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomNumberGenerator {
    public int makeThreeDigitNumberMadeOfDifferentNumbers() {
        int firstDigit = Randoms.pickNumberInRange(1,9);
        int secondDigit = makeSecondDigit(firstDigit);
        int thirdDigit = makeThirdDigit(firstDigit, secondDigit);
        return (firstDigit*100 + secondDigit*10 + thirdDigit);
    }

    private int makeSecondDigit(int first) {
        int second = first;
        while (second == first) {
            second = Randoms.pickNumberInRange(1, 9);
        }
        return second;
    }

    private int makeThirdDigit(int first, int second) {
        int third = first;
        while ((third == first) || (third == second)) {
            third = Randoms.pickNumberInRange(1,9);
        }
        return third;
    }
}
