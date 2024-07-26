package code.breaker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Generates a random code for the Code Breaker game.
 * <p>
 * This class is responsible for creating a code consisting of a specific number
 * of unique digits within a defined range. The digits are randomly selected and
 * ensured to be unique in the generated code.
 * </p>
 */
public class CodeGenerator {
    /** The minimum digit value that can be included in the code. */
    private static final int MIN_DIGIT = 1;

    /** The maximum digit value that can be included in the code. */
    private static final int MAX_DIGIT = 8;

    /**
     * Creates a code with unique random digits.
     * <p>
     * Generates a list of unique digits, each ranging from {@link #MIN_DIGIT}
     * to {@link #MAX_DIGIT}. The length of the code is defined by
     * {@link GameUtils#CODE_LENGTH}. This method ensures that all digits in the
     * code are unique.
     * </p>
     *
     * @return A list of integers representing the generated code.
     */
    public List<Integer> createCode() {
        List<Integer> code = new ArrayList<>();
        Random random = new Random();

        while (code.size() < GameUtils.CODE_LENGTH) {
            int value = random.nextInt(MAX_DIGIT - MIN_DIGIT + 1) + MIN_DIGIT;
            if (!code.contains(value)) {
                code.add(value);
            }
        }

        return code;
    }

    /**
     * Gets the minimum digit value.
     *
     * @return The minimum digit value that can be used in the code.
     */
    public static int getMinDigit() {
        return MIN_DIGIT;
    }

    /**
     * Gets the maximum digit value.
     *
     * @return The maximum digit value that can be used in the code.
     */
    public static int getMaxDigit() {
        return MAX_DIGIT;
    }
}
