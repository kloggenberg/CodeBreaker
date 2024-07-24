package code.breaker.unit.test;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.assertEquals;

import code.breaker.GameUtils;

public class GameUtilsTest {

    @Test
    public void testGetAnswerInput() {
        String input = "1234\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(in);
        GameUtils gameUtils = new GameUtils();

        String answer = gameUtils.getAnswerInput(scanner);
        assertEquals("1234", answer);
    }

    @Test
    public void testGetAnswerInput_InvalidInput() {
        String input = "12\n1234\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(in);
        GameUtils gameUtils = new GameUtils();

        String answer = gameUtils.getAnswerInput(scanner);
        assertEquals("1234", answer);
    }
}
