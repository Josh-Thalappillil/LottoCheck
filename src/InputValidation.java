import java.util.Scanner;

public class InputValidation {

    public int[] getUserNumbers() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter three numbers between 1 and 24.");
            System.out.println("Your guesses are:");
        int[] userNumbers = new int[Main.NUMBERS_DRAWN]; //store users input

        for (int i = 0; i < Main.NUMBERS_DRAWN; i++) {
            if (!scan.hasNextInt()) {
                System.out.println("Error! Please enter a number between 1 and 24");
                System.exit(0);
            }
            userNumbers[i] = scan.nextInt();
            if (userNumbers[i] < 1 || userNumbers[i] > 24) {
                System.out.println("Error! You must choose a number between 1 and 24.");
                System.exit(0);
            }
        }
        return userNumbers;
    }
}
