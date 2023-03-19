import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsLizardSpock {
    private static final String ROCK = "Rock";
    private static final String PAPER = "Paper";
    private static final String SCISSORS = "Scissors";
    private static final String LIZARD = "Lizard";
    private static final String SPOCK = "Spock";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose [r]ock, [p]aper, [s]cissors, [l]izard or [S]pock: ");
        String playerMove = scanner.next();

        if (playerMove.equals("r") || playerMove.equals("rock")){
            playerMove = "Rock";
        } else if (playerMove.equals("p") || playerMove.equals("paper")){
            playerMove = "Paper";
        } else if (playerMove.equals("s") || playerMove.equals("scissors")){
            playerMove = "Scissors";
        } else if (playerMove.equals("l") || playerMove.equals("lizard")){
            playerMove = "Lizard";
        } else if (playerMove.equals("S") || playerMove.equals("Spock")){
            playerMove = "Spock";
        } else {
            System.out.println("Invalid Input. Try Again...");
            return;
        }
        Random random = new Random();
        int computerRandomNum = random.nextInt(6);
        String computerMove = "";
        switch (computerRandomNum){
            case 1:
                computerMove = "Rock";
                break;
            case 2:
                computerMove = "Paper";
                break;
            case 3:
                computerMove = "Scissors";
                break;
            case 4:
                computerMove = "Lizard";
                break;
            case 5:
                computerMove = "Spock";
                break;
        }
        System.out.printf("The computer chose %s.%n", computerMove);
        if ((playerMove.equals("Rock") && computerMove.equals("Scissors")) || (playerMove.equals("Paper") &&
                computerMove.equals("Rock")) || (playerMove.equals("Scissors") && computerMove.equals("Paper")) ||
                (playerMove.equals("Rock") && computerMove.equals("Lizard")) || (playerMove.equals("Lizard") &&
                computerMove.equals("Spock")) || (playerMove.equals("Spock") && computerMove.equals("Scissors")) ||
                (playerMove.equals("Scissors") && computerMove.equals("Lizard")) || (playerMove.equals("Lizard") &&
                computerMove.equals("Paper")) || (playerMove.equals("Paper") && computerMove.equals("Spock")) ||
                (playerMove.equals("Spock") && computerMove.equals("Rock"))){
            System.out.println("You win.");
        } else if (playerMove.equals(computerMove)){
            System.out.println("This game was a draw");
        } else {
            System.out.println("You lose.");
        }
    }

}
