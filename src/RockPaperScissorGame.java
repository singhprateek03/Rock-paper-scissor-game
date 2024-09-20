import java.util.Scanner;
import java.util.Random;

public class RockPaperScissorGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // User is giving the input.
        System.out.print("It's Your turn, \nPlease choose your choice : ");
        Random rand = new Random();
        int i = 1;
        while(i <= 3){
            int Your_Turn,Computer_Turn;
            Your_Turn = sc.nextInt(3);

            //Computer is giving the input.
            Computer_Turn = rand.nextInt(3);

            System.out.print("You choosed : ");
            switch(Your_Turn) {
                case 0:
                    System.out.println("Rock");
                    break;
                case 1:
                    System.out.println("Paper");
                    break;
                case 2:
                    System.out.println("Scissor");
                    break;
            }
            System.out.print("Computer choosed : ");
            if(Computer_Turn == 0) {
                System.out.println("Rock");
            } else if(Computer_Turn == 1){
                System.out.println("Paper");
            } else if(Computer_Turn == 2){
                System.out.println("Scissor");
            }

            System.out.print("Here is the winner : ");
            if(Your_Turn == 0 && Computer_Turn == 1) {
                System.out.println("Oops! The computer won. Better luck next time");
            } else if(Your_Turn == 1 && Computer_Turn == 2) {
                System.out.println("Oops! The computer won. Better luck next time");
            } else if(Your_Turn == 2 && Computer_Turn == 0) {
                System.out.println("Oops! The computer won. Better luck next time");
            } else if(Your_Turn == 1 && Computer_Turn == 0) {
                System.out.println("Congratulations! You won!");
            } else if(Your_Turn == 2 && Computer_Turn == 1) {
                System.out.print("Congratulations! You won!");
            } else if(Your_Turn == 0 && Computer_Turn == 2) {
                System.out.print("Congratulations! You won!");
            } else if(Your_Turn == 0 && Computer_Turn == 0 || Your_Turn == 1 && Computer_Turn == 1 || Your_Turn == 2 && Computer_Turn == 2) {
                System.out.print("Sorry, the match is drawn. Please play again.");
            }
            i++;
        }
    }
}