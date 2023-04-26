import javax.lang.model.type.ArrayType;
import java.util.*;

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

    public static int NUMBERS_DRAWN = 3;
    public static void main(String[] args) {
        Engine engine = new Engine();
        engine.RunLotto();
    }
}