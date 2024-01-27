package baseball.model;

import baseball.validate.ValidateUserNumber;

import java.util.List;

/**
 * 여기서 strike, ball 계산완료할것
 */
public class UserNumber {
    private String userNum;

    public UserNumber(String userNum) {
        ValidateUserNumber.isNumber(userNum);
        ValidateUserNumber.is3DigitNumber(userNum);
        this.userNum = userNum;
    }

    public String getUserNum() {
        return this.userNum;
    }

    public void countBall(List<Integer> computerNumber, Result result) {
        for (int i = 0; i < computerNumber.size(); i++) {
            checkBallByUserNumber(i, computerNumber, result);
        }
    }

    public void checkBallByUserNumber(int i, List<Integer> computerNumber, Result result) {
        for (int j = 0; j < this.getUserNum().length(); j++) {
            if (i != j && computerNumber.get(i) == Character.getNumericValue(this.userNum.charAt(j))) {
                result.updateBall();
            }
        }
    }

    public void countStrike(List<Integer> computerNumber, Result result) {
        for (int i = 0; i < computerNumber.size(); i++) {
            if (computerNumber.get(i) == Character.getNumericValue(this.userNum.charAt(i))) {
                result.updateStrike();
            }
        }
    }


}
