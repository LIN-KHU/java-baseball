package baseball.model;

import java.util.ArrayList;
import java.util.List;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class ComputerNumber {
    private List<Integer> randomNum;

    public ComputerNumber() {
        this.randomNum = makeRandomNum();
    }

    public List<Integer> makeRandomNum() {
        List<Integer> randomNum = new ArrayList<>();
        while (randomNum.size() < 3) {
            int random = pickNumberInRange(1, 9);
            if (!randomNum.contains(random)) {
                randomNum.add(random);
            }
        }
        return randomNum;
    }

    public List<Integer> getRandomNum() {
        return this.randomNum;
    }
}
