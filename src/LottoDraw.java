import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LottoDraw {
    Set<Integer> lottoNumbers = new HashSet<>();
    public Set<Integer> getLottoNumbers() {

        Random rand = new Random();

        while (lottoNumbers.size() < Main.NUMBERS_DRAWN) {
            lottoNumbers.add(rand.nextInt(1, 25));
        }
        System.out.println("Winning Numbers: " + lottoNumbers);
        return lottoNumbers;
    }
}
