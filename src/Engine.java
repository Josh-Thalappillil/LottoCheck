import java.util.Set;

public class Engine {
    InputValidation validate = new InputValidation();
    LottoDraw getLotto = new LottoDraw();
    CheckGuess getUserGuess = new CheckGuess();
    public void RunLotto(){
        int[] userNumbers = validate.getUserNumbers();
        Set<Integer> lottoNumbers = getLotto.getLottoNumbers();
        getUserGuess.checkIfCorrectGuess(lottoNumbers, userNumbers);
    }
}
