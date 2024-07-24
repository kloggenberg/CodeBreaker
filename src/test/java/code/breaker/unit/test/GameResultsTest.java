package code.breaker.unit.test;

import code.breaker.GameResults;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class GameResultsTest {

    @Test
    public void testTakeTurn() {
        GameResults gameResults = new GameResults();
        List<Integer> code = Arrays.asList(1, 2, 3, 4);
        String guess = "1234";

        int[] result = gameResults.takeTurn(code, guess);
        assertArrayEquals(new int[]{4, 0}, result);

        guess = "1243";
        result = gameResults.takeTurn(code, guess);
        assertArrayEquals(new int[]{2, 2}, result);

        guess = "5678";
        result = gameResults.takeTurn(code, guess);
        assertArrayEquals(new int[]{0, 0}, result);
    }
}
