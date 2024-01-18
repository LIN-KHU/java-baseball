package baseball;

import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        //TODO: 숫자 야구 게임 구현

        List<Integer> answer = makeAnswer();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            while (true) {
                List<Integer> player = getNumbers();
                int ball = 0;
                int strike = 0;
                List<Integer> com = makeAnswer();

                if (player.get(0) == com.get(0)) strike++;
                if (player.get(1) == com.get(1)) strike++;
                if (player.get(2) == com.get(2)) strike++;

                if (player.get(0) == com.get(1) || player.get(0) == com.get(2)) ball++;
                if (player.get(1) == com.get(0) || player.get(1) == com.get(2)) ball++;
                if (player.get(2) == com.get(0) || player.get(2) == com.get(1)) ball++;

                if (strike == 3) {
                    System.out.println("3스트라이크");
                    System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
                    break;
                } else {
                    if (strike == 0 && ball == 0) {
                        System.out.println("낫싱");
                    } else if (strike != 0 && ball == 0) {
                        System.out.printf("%d스트라이크\n", strike);
                    } else if (strike == 0 && ball != 0) {
                        System.out.printf("%d볼\n", ball);
                    } else {
                        System.out.printf("%d볼 %d스트라이크", ball, strike);
                    }
                }


            }
            // 예외처리 하기
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            boolean restart = scanner.nextBoolean();
            if(!restart){
                System.exit(0);
            }
        }

    }

    // 예외처리 하기
    // 1. 숫자이외의 입력
    // 2. 3자리 이상 숫자의 입력
    // 3. 각 자리의 숫자가 0이 아니고, 서로 같지 않아야 함
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
            if (!(first == second || second == third || third == first)) {
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

