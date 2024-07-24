package code.breaker;

import java.util.Scanner;

public class GameUtils {
    public static final int CODE_LENGTH = 4;
    public static final int MAX_TURNS = 12;

    public void showInstructions() {
        System.out.println("4-digit Code has been set. Digits in range 1 to 8. You have 12 turns to break it.");
    }

    public String getAnswerInput(Scanner scanner) {
        while (true) {
            System.out.print("Input 4-digit code: ");
            String answer = scanner.nextLine();
            if (answer.length() == CODE_LENGTH && answer.chars().allMatch(Character::isDigit)) {
                return answer;
            } else {
                System.out.println("Please enter exactly 4 digits.");
            }
        }
    }
}
