package laddergame;

import laddergame.controller.GameController;
import laddergame.domain.ladder.RandomLineMaker;

public class Application {

    public static void main(String[] args) {
        final GameController gameController = new GameController(new RandomLineMaker());
        gameController.process();
    }
}