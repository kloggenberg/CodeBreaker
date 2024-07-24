package code.breaker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CodeGenerator {
    private static final int MIN_DIGIT = 1;
    private static final int MAX_DIGIT = 8;

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

    public static int getMinDigit() {
        return MIN_DIGIT;
    }

    public static int getMaxDigit() {
        return MAX_DIGIT;
    }
}
