package RockPaperScissorsGame;

/*https://www.wikihow.com/Make-a-Rock,-Paper,-Scissors-Game-in-Java*/
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    private enum Move {
        ROCK, PAPER, SCISSORS;
        public int getWinner(Move move) {
            if (this == move)
                return 0;
            switch (this) {
                case ROCK:
                    return (move == SCISSORS ? 1 : -1);
                case PAPER:
                    return (move == ROCK ? 1 : -1);
                case SCISSORS:
                    return (move == PAPER ? 1 : -1);
            }
            return 0;
        }
    }
    private class User {
        private Scanner inputScanner;
        public User() {
            inputScanner = new Scanner(System.in);
        }
        public Move getMove() {
            System.out.println("ROCK, PAPER or SCISSORS? Type one : ");
            String userInput = inputScanner.nextLine();
            userInput = userInput.toUpperCase();
            char firstChar = userInput.charAt(0);
            if (firstChar == 'R' || firstChar == 'P' || firstChar == 'S') {
                switch (firstChar) {
                    case 'R':
                        return Move.ROCK;
                    case 'P':
                        return Move.PAPER;
                    case 'S':
                        return Move.SCISSORS;
                }
            }
            return getMove();
        }
        public boolean continuePlaying() {
            System.out.print("Do you want to continue playing? Y or N? ");
            String userInput = inputScanner.nextLine();
            userInput = userInput.toUpperCase();
            if (userInput.charAt(0) == 'Y') {
                return true;
            }
            return false;
        }
    }
    private class Computer {
        public Move getMove() {
            Move[] arrayOfMoves = Move.values();
            Random random = new Random();
            int arrayIndex = random.nextInt(arrayOfMoves.length);
            return arrayOfMoves[arrayIndex];
        }
    }

    private User user;
    private Computer computer;
    private int userPoints;
    private int computerPoints;
    private int gameCount;
    public RockPaperScissors() {
        user = new User();
        computer = new Computer();
        userPoints = 0;
        computerPoints = 0;
        gameCount = 0;
    }
    public void playGame() {
        System.out.println("Let's play");
        Move userMove = user.getMove();
        Move computerMove = computer.getMove();
        int winner = userMove.getWinner(computerMove);
        switch (winner) {
            case 0:
                System.out.println("It's a tie");
                break;
            case 1:
                System.out.println("You won");
                userPoints++;
                break;
            case -1:
                System.out.println("Computer won");
                computerPoints++;
                break;
        }
        gameCount++;
        if (user.continuePlaying()) {
            playGame();
        }
        printGameScores();
    }
    private void printGameScores() {
        System.out.println("User Score: " + userPoints);
        System.out.println("Computer Score: " + computerPoints);
        System.out.println("Ties : " + (gameCount - userPoints - computerPoints));
    }
    public static void main (String[] args) {
        RockPaperScissors rps = new RockPaperScissors();
        rps.playGame();
    }
}
