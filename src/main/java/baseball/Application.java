package baseball;

import baseball.domain.GameManager;

public class Application {
    public static void main(String[] args) {
        //TODO: 숫자 야구 게임 구현
        GameManager manager = new GameManager();
        manager.gameStart();
    }
}
