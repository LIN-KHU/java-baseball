package baseball.model;

import java.util.List;

/**
 * 여기서 strike, ball 계산완료할것
 */
public class UserNumber {
    private String userNum;

    public UserNumber(String userNum) {
        isNumber(userNum);
        is3DigitNumber(userNum);
        this.userNum = userNum;
    }

    public String getUserNum() {
        return this.userNum;
    }

    public void isNumber(String userNumber) {
        try {
            int toNumber = Integer.parseInt(userNumber);
        } catch (NumberFormatException e) {
            System.out.println("숫자로 입력해주세요");
        }
    }

    public void is3DigitNumber(String userNumber) {
        if (userNumber.length() != 3) {
            throw new IllegalArgumentException("3자리 숫자로 입력해주세요");
        }
    }

    /**
     * 숫자는 같지만 자릿수가 다른경우
     */
    public void countBall(List<Integer> computerNumber, Result result) {
        for (int i = 0; i < computerNumber.size(); i++) {
            for (int j = 0; j < 3; j++) {
                if (i != j && computerNumber.get(i) == Character.getNumericValue(this.userNum.charAt(j))) {
                    result.updateBall();
                }
            }
        }
    }

    public void countStrike(List<Integer> computerNumber, Result result) {
        for (int i = 0; i < computerNumber.size(); i++) {
            if(computerNumber.get(i) == Character.getNumericValue(this.userNum.charAt(i))){
                result.updateStrike();
            }
        }
    }


}
