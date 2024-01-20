package baseball;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Application {
    public static void main(String[] args) {
       run();
    }

    // 예외처리 하기
    // 1. 숫자이외의 입력
    // 2. 3자리 이상 숫자의 입력
    // 3. 각 자리의 숫자가 0이 아니고, 서로 같지 않아야 함
    public static List<Integer> getNumbers() {

        List<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력해주세요 : ");
        int num = scanner.nextInt();
        while (num > 0) {
            numbers.add(num % 10);
            num /= 10;
        }
        return numbers;
    }

    public static List<Integer> makeAnswer() {
        int first, second, third;
        while (true) {
            first = Randoms.pickNumberInRange(1, 9);
            second = Randoms.pickNumberInRange(1, 9);
            third = Randoms.pickNumberInRange(1, 9);
            if (!(first == second || second == third || third == first)) {
                break;
            }
        }
        List<Integer> numbers = new ArrayList<>();
        numbers.add(first);
        numbers.add(second);
        numbers.add(third);

        return numbers;
    }

    public static void restart() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        int restart = Integer.parseInt(Console.readLine());
        if (restart == 2) {
            System.exit(0);
        }
    }

    public static void run() {
        while (true) {
            List<Integer> com = makeAnswer();
            while (true) {
                List<Integer> player = getNumbers();
                int ball = 0;
                int strike = 0;

                strike = countStrike(com, player, strike);
                ball = countBall(com, player, ball);

                if (strike == 3) {
                    System.out.println("3스트라이크");
                    System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
                    break;
                } else {
                    printResult(strike, ball);
                }


            }
            // 예외처리 하기
            restart();
        }
    }

    public static int countStrike(List<Integer> com, List<Integer> player, int strike) {
        if (player.get(0) == com.get(0)) strike++;
        if (player.get(1) == com.get(1)) strike++;
        if (player.get(2) == com.get(2)) strike++;

        return strike;
    }

    public static int countBall(List<Integer> com, List<Integer> player, int ball) {
        if ((player.get(0) == com.get(1)) || (player.get(0) == com.get(2))) ball++;
        if ((player.get(1) == com.get(0)) || (player.get(1) == com.get(2))) ball++;
        if ((player.get(2) == com.get(0)) || (player.get(2) == com.get(1))) ball++;

        return ball;
    }

    public static void printResult(int strike, int ball) {
        if (strike == 0 && ball == 0) {
            System.out.println("낫싱");
        } else if (strike != 0 && ball == 0) {
            System.out.printf("%d스트라이크\n", strike);
        } else if (strike == 0 && ball != 0) {
            System.out.printf("%d볼\n", ball);
        } else {
            System.out.printf("%d볼 %d스트라이크\n", ball, strike);
        }
    }
}

