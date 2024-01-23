package baseball.model;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class RandomNum {
    private int randomNum;

    public RandomNum() {
        this.randomNum = pickNumberInRange(100, 999);
    }

    public int getRandomNum(){
        return this.randomNum;
    }
}
