package rpsgame;

public enum Move {
    ROCK, PAPER, SCISSORS;
    public int isSameMove(Move secondMove) {
        if (this == secondMove) {
            return 0;
        }
        switch (this) {
            case ROCK:
                return (secondMove == SCISSORS ? 1 : -1);
            case PAPER:
                return (secondMove == ROCK ? 1 : -1);
            case SCISSORS:
                return (secondMove == PAPER ? 1 : -1);
        }
        return 0;
    }
}
