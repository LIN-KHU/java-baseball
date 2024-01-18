package baseball;

import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        //TODO: 숫자 야구 게임 구현

        List<Integer> answer = makeAnswer();

        boolean finish = false;
        while (!finish) {
            List<Integer> player = getNumbers();
            int ball = 0;
            int strike = 0;
            for (int i = 0; i < 3; i++) {
                if ()
            }
        }
    }

    public static List<Integer> getNumbers() {

        List<Integer> Numbers = new ArrayList<Integer>(3);
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요 : ");
        int num = scanner.nextInt();
        while (num > 0) {
            Numbers.add(num % 10);
            num /= 10;
        }
        return Numbers;
    }

    public static List<Integer> makeAnswer() {
        Random random = new Random();
        int first, second, third;
        while (true) {
            first = random.nextInt(100) % 9 + 1;
            second = random.nextInt(100) % 9 + 1;
            third = random.nextInt(100) % 9 + 1;
            if(!(first == second || second == third || third == first)){
                break;
            }
        }
        List<Integer> Numbers = new ArrayList<Integer>(3);
        Numbers.add(first);
        Numbers.add(second);
        Numbers.add(third);

        return Numbers;
    }
}

