package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class ComputerNumber {
    private final int computerNumber;

   public ComputerNumber() {
       this.computerNumber = createThreeDigitNumberFromRandomNumbers();
   }

   private int createThreeDigitNumberFromRandomNumbers() {
       return generateRandomNumber() * 100 + generateRandomNumber() * 10 + generateRandomNumber();
   }

   private int generateRandomNumber() {
        return Randoms.pickNumberInRange(1, 9);
   }

   public int getComputerNumber() {
       return this.computerNumber;
   }
}
