import java.util.Random;
import java.util.Scanner;

public class DieRollar {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;

        while (playAgain) {
            int throwNumber = 1;
            int die1, die2, die3;

            while (true) {
                die1 = rnd.nextInt(6) + 1;
                die2 = rnd.nextInt(6) + 1;
                die3 = rnd.nextInt(6) + 1;

                System.out.printf("%-10s %-10s %-10s %-10s %-10s\n", "Throw", "Die 1", "Die 2", "Die 3", "Sum");
                System.out.printf("%-10s %-10s %-10s %-10s %-10s\n", "-----", "----", "----", "----", "---");
                System.out.printf("%-10d %-10d %-10d %-10d %-10d\n", throwNumber, die1, die2, die3, die1 + die2 + die3);

                if (die1 == die2 && die2 == die3) {
                    System.out.println("Triple! You won!");
                    break;
                }

                throwNumber++;
            }

            System.out.print("Do you want to play again? (y/n): ");
            String response = scanner.nextLine();
            playAgain = response.equalsIgnoreCase("y");
        }
    }
}