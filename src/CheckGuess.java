import java.util.Set;

public class CheckGuess {
    LottoDraw lottoDraw = new LottoDraw();

    InputValidation inputValidate = new InputValidation();


    public void checkIfCorrectGuess(Set<Integer> lottoNum, int[] userNum) {
        int correctGuesses = 0;
        for (int i = 0; i < Main.NUMBERS_DRAWN; i++) {
            if (lottoNum.contains(userNum[i])) {
                System.out.println("The number " + userNum[i] + " was a correct guess!");
                correctGuesses++;
            }
        }
        System.out.println("The number of correct guesses was: " + correctGuesses);
    }
}
