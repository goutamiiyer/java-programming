package rpsgame;

import java.util.Random;

public class Computer {
    public Move getMove() {
        Move[] setOfMoves = Move.values();
        Random random = new Random();
        int i = random.nextInt(setOfMoves.length);
        return setOfMoves[i];
    }
}
