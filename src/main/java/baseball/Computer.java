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
        return randomNum.charAt(0) != randomNum.charAt(1) &&
                randomNum.charAt(1) != randomNum.charAt(2) &&
                randomNum.charAt(2) != randomNum.charAt(0);
    }



}