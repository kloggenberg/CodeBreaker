package code.breaker;

import java.util.List;

/**
 * Handles and displays game results for the Code Breaker game.
 * <p>
 * This class provides methods to show the results of a player's guess,
 * evaluate the correctness of the guess, and display the final code once the game is over.
 * </p>
 */
public class GameResults {

    /**
     * Displays the results of a player's guess.
     * <p>
     * This method prints the number of digits that were guessed correctly and are in the correct position,
     * as well as the number of digits that were guessed correctly but are not in the correct position.
     * </p>
     *
     * @param correctDigitsAndPosition The number of digits that are correct and in the correct position.
     * @param correctDigitsOnly The number of digits that are correct but not in the correct position.
     */
    public void showResults(int correctDigitsAndPosition, int correctDigitsOnly) {
        System.out.println("Number of correct digits in correct place: " + correctDigitsAndPosition);
        System.out.println("Number of correct digits not in correct place: " + correctDigitsOnly);
    }

    /**
     * Evaluates a player's guess against the code.
     * <p>
     * This method compares each digit of the player's guess to the corresponding digit in the code.
     * It counts how many digits are correct and in the correct position, and how many are correct but in the wrong position.
     * </p>
     *
     * @param code The code that needs to be guessed.
     * @param answer The player's guess as a string of digits.
     * @return An array of two integers:
     *         - The first element is the number of correct digits in the correct position.
     *         - The second element is the number of correct digits not in the correct position.
     */
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

    /**
     * Displays the final code once the game is over.
     * <p>
     * This method prints the code to the console, showing the code that the player was trying to guess.
     * </p>
     *
     * @param code The code that was used in the game.
     */
    public void showCode(List<Integer> code) {
        System.out.println("The code was: " + code);
    }
}
