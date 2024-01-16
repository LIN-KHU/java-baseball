package baseball;

import camp.nextstep.edu.missionutils.Randoms;

public class Computer {
    public static String randomNum = "";

    public static String genRandomNum() {
        for (int i = 0; i < 3; i++) {
            randomNum = randomNum.concat(Integer.toString(getRandom()));
        }
        if (checkRandomNum()) {
            return genRandomNum();
        }
        return randomNum;
    }

    public static int getRandom() {
        return Randoms.pickNumberInRange(1, 10);
    }
    public static boolean checkRandomNum() {
        return randomNum.indexOf(0) != randomNum.indexOf(1) && randomNum.indexOf(1) != randomNum.indexOf(2) && randomNum.indexOf(2) != randomNum.indexOf(0);
    }


}
