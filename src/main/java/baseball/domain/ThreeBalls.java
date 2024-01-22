package baseball.domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeBalls {

    public static final int NUMBER_MAX_LENGTH = 3;
    private List<Integer> numberList;

    public ThreeBalls(List<Integer> numberList) {
        validateContainsZeroOrNot(numberList);
        validateThreeDigitOrNot(numberList);
        validateUniqueOrNot(numberList);
        this.numberList = numberList;
    }

    private void validateContainsZeroOrNot(List<Integer> numberList) {
        if (numberList.contains(0)) {
            throw new IllegalArgumentException("0은 입력하지 마세요.");
        }
    }

    private void validateThreeDigitOrNot(List<Integer> numberList) {
        if (!(numberList.size() == NUMBER_MAX_LENGTH)) {
            throw new IllegalArgumentException("3자리 수를 입력하세요.");
        }
    }

    private void validateUniqueOrNot(List<Integer> numberList) {
        Set<Integer> numberSet = new HashSet<Integer>(numberList);
        if (!(numberSet.size() == numberList.size())) {
            throw new IllegalArgumentException("각 자리수가 서로 다른 수로 이루어진 수를 입력하세요.");
        }
    }


    public List<Integer> getNumberList() {
        return numberList;
    }

}
