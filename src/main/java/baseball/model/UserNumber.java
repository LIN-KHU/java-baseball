package baseball.model;

public class UserNumber {
    private String userNum;

    public UserNumber(String userNum){
        isNumber(userNum);
        is3DigitNumber(userNum);
        this.userNum = userNum;
    }

    public String getUserNum(){
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
        if(userNumber.length() != 3) {
            throw new IllegalArgumentException("3자리 숫자로 입력해주세요");
        }
    }
}
