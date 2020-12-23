package rpsgame;

import java.util.Scanner;

public class User {
    private Scanner userInput;
    public User() {
        userInput = new Scanner(System.in);
    }
    public Move getMove() {
        System.out.print("R - ROCK, P - PAPER, S - SCISSORS - which one? ");
        String userChoice = userInput.nextLine();
        userChoice = userChoice.toUpperCase();
        if (userChoice == "R" || userChoice == "P" || userChoice == "S") {
            switch (userChoice) {
                case "R":
                    return Move.ROCK;
                case "P":
                    return Move.PAPER;
                case "S":
                    return Move.SCISSORS;
            }
        }
        return getMove();
    }
}
