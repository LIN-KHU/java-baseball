package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class ComputerNum{
    private final List<Integer> numbers = new ArrayList<>();

    public ComputerNum() {
        int first, second, third;
        while (true) {
            first = Randoms.pickNumberInRange(1, 9);
            second = Randoms.pickNumberInRange(1, 9);
            third = Randoms.pickNumberInRange(1, 9);
            if (!(first == second || second == third || third == first)) {
                break;
            }
        }
        this.numbers.add(first);
        this.numbers.add(second);
        this.numbers.add(third);
    }

    public int get(int i){
        return this.numbers.get(i);
    }
}
