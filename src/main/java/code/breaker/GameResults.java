package code.breaker;

import java.util.List;

public class GameResults {

    public void showResults(int correctDigitsAndPosition, int correctDigitsOnly) {
        System.out.println("Number of correct digits in correct place: " + correctDigitsAndPosition);
        System.out.println("Number of correct digits not in correct place: " + correctDigitsOnly);
    }

    public int[] takeTurn(List<Integer> code, String answer) {
        int correctDigitsAndPosition = 0;
        int correctDigitsOnly = 0;

        for (int i = 0; i < GameUtils.CODE_LENGTH; i++) {
            int guessedDigit = Character.getNumericValue(answer.charAt(i));
            if (code.get(i) == guessedDigit) {
                correctDigitsAndPosition++;
            } else if (code.contains(guessedDigit)) {
                correctDigitsOnly++;
            }
        }

        return new int[]{correctDigitsAndPosition, correctDigitsOnly};
    }

    public void showCode(List<Integer> code) {
        System.out.println("The code was: " + code);
    }
}
