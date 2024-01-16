package baseball;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

public class Application {
    public static void main(String[] args) {
        //TODO: 숫자 야구 게임 구현

        //computer - 서로 다른 세 자리 랜덤 수 생성(랜덤 수 생성 → 변수에 저장)
    for (int i=0; i <3; i++){
        randomNum = randomNum.concat(Integer.toString(getRandom()));
    }}
    public  static  String randomNum ="";
    public static int getRandom()
    {
        return Randoms.pickNumberInRange(1, 10);
    }

}
