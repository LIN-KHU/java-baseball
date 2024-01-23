package baseball.controller;

import baseball.model.RandomNum;

public class BaseballGame {

    public void start(){
        RandomNum randomNum = new RandomNum();
        System.out.println(randomNum.getRandomNum());
    }
}
