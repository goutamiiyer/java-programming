package rpsgame;

public class RockPaperScissors {
    private User user;
    private Computer computer;

    public RockPaperScissors() {
        user = new User();
        computer = new Computer();
    }
    public void game() {
        System.out.print("Let's play");
        Move userInput = user.getMove();
        Move computerInput = computer.getMove();

        int result = userInput.isSameMove(computerInput);
        switch (result) {
            case 0:
                System.out.println("It's a tie");
                break;
            case 1:
                System.out.println("User won");
                break;
            case -1:
                System.out.println("Computer won");
                break;
        }
    }

    public static void main(String[] args) {
        RockPaperScissors rps = new RockPaperScissors();
        rps.game();
    }
}
