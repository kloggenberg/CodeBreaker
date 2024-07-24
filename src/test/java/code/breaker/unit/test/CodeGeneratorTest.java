package code.breaker.unit.test;

import code.breaker.CodeGenerator;
import code.breaker.GameUtils;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CodeGeneratorTest {

    @Test
    public void testCreateCode() {
        CodeGenerator codeGenerator = new CodeGenerator();
        List<Integer> code = codeGenerator.createCode();

        assertEquals(GameUtils.CODE_LENGTH, code.size());
        for (Integer digit : code) {
            assertTrue(digit >= CodeGenerator.getMinDigit() && digit <= CodeGenerator.getMaxDigit());
        }

        long uniqueDigitsCount = code.stream().distinct().count();
        assertEquals(GameUtils.CODE_LENGTH, uniqueDigitsCount);
    }
}
