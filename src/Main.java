import javax.lang.model.type.ArrayType;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// Lotto Checker
// Lotto numbers are drawn in the range of between 1 and 24
// A number may be drawn one or more times in any single draw
// This method should receive 3 number picks from a user that represent the numbers chosen by a player.
// The numbers chosen by the player must fall within the range of the field of numbers being drawn.
// Each time the method is called it will generate eight random numbers within the predefined range (1-24).
// The method should return a string that informs the user of the results of the draw including the drawn numbers,
// the numbers chosen by the player, which numbers were correct guesses by the player
// and how many correct guesses occurred in the draw.
// The method should also notify of any error e.g., if the number picked by the user fall outside the prescribed range.
class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter three numbers between 1 and 24.");
        System.out.println("Your guesses are:");
        int[] userNumbers = new int[3]; //store users input

        for (int i = 0; i < 3; i++) {
            userNumbers[i] = scan.nextInt();
            if (userNumbers[i] < 1 || userNumbers[i] > 24) {
                System.out.println("Error! You must choose a number between 1 and 24.");
                return;
            }
        }

        int[] lottoNumbers = new int[3]; //Storing random lotto numbers generated
        String lottoNumbersString = "";
        for (int i = 0; i < 3; i++) {
            lottoNumbers[i] = rand.nextInt(1, 25);
            lottoNumbersString += lottoNumbers[i] + " ";
        }
        System.out.println("Winning Lotto numbers are: " +lottoNumbersString);

        int correctGuesses = 0;

        for (int i = 0; i < 3; i++) {
            if (Arrays.binarySearch(lottoNumbers, userNumbers[i]) >= 0) {
                System.out.println("The number " + userNumbers[i] + " was a correct guess!");
                correctGuesses++;
                }
        }
        System.out.println("The number of correct guesses was: " + correctGuesses);
    }
}