package code.breaker;

import java.util.List;
import java.util.Scanner;

public class CodeBreakerGame {
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
