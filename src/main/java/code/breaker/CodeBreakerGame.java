package code.breaker;

import java.util.List;
import java.util.Scanner;

/**
 * Main class for running the Code Breaker game.
 * <p>
 * This class is responsible for initializing the game, handling the game loop,
 * and interacting with the user. It generates a code, takes user guesses,
 * and provides feedback until the user either guesses the code correctly or
 * exhausts the maximum number of turns.
 * </p>
 */
public class CodeBreakerGame {

    /**
     * The entry point of the Code Breaker game.
     * <p>
     * Initializes the code generator, game utilities, and game results handler.
     * It then enters a loop where the user is prompted to enter guesses, and
     * feedback is provided based on the guesses. The loop continues until the
     * code is correctly guessed or the maximum number of turns is reached.
     * </p>
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        CodeGenerator codeGenerator = new CodeGenerator();
        GameUtils gameUtils = new GameUtils();
        GameResults gameResults = new GameResults();

        List<Integer> code = codeGenerator.createCode();
        gameUtils.showInstructions();

        boolean correct = false;
        int turns = 0;
        Scanner scanner = new Scanner(System.in);

        while (!correct && turns < GameUtils.MAX_TURNS) {
            String answer = gameUtils.getAnswerInput(scanner);
            int[] result = gameResults.takeTurn(code, answer);
            int correctDigitsAndPosition = result[0];
            int correctDigitsOnly = result[1];
            gameResults.showResults(correctDigitsAndPosition, correctDigitsOnly);
            turns++;

            if (correctDigitsAndPosition == GameUtils.CODE_LENGTH) {
                System.out.println("Congratulations! You are a codebreaker!");
                correct = true;
            } else {
                System.out.println("Turns left: " + (GameUtils.MAX_TURNS - turns));
            }
        }

        gameResults.showCode(code);
        scanner.close();
    }
}
