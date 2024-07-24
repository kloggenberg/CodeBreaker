//package code.breaker.unit.test;
//
//import code.breaker.CodeBreakerGame;
//import code.breaker.CodeGenerator;
//import code.breaker.GameResults;
//import code.breaker.GameUtils;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.Scanner;
//
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.ArgumentMatchers.anyString;
//import static org.mockito.Mockito.*;
//
//public class CodeBreakerGameTest {
//
//    @Mock
//    private CodeGenerator codeGenerator;
//
//    @Mock
//    private GameUtils gameUtils;
//
//    @Mock
//    private GameResults gameResults;
//
//    private List<Integer> code;
//
//    @BeforeEach
//    public void setUp() {
//        MockitoAnnotations.openMocks(this);
//        code = Arrays.asList(1, 2, 3, 4);
//        when(codeGenerator.createCode()).thenReturn(code);
//    }
//
//    @Test
//    public void testGameFlow() {
//        // Mock user inputs
//        Scanner scanner = new Scanner("1234\n");
//        when(gameUtils.getAnswerInput(any(Scanner.class))).thenReturn("1234");
//
//        // Mock game results
//        when(gameResults.takeTurn(anyList(), anyString())).thenReturn(new int[]{4, 0});
//
//        // Capture game output
//        CodeBreakerGame.main(new String[]{});
//
//        // Verify interactions
//        verify(gameUtils, times(1)).showInstructions();
//        verify(gameUtils, times(1)).getAnswerInput(any(Scanner.class));
//        verify(gameResults, times(1)).takeTurn(eq(code), eq("1234"));
//        verify(gameResults, times(1)).showResults(4, 0);
//        verify(gameResults, times(1)).showCode(eq(code));
//    }
//
//    @Test
//    public void testGameWithIncorrectGuesses() {
//        // Mock user inputs
//        Scanner scanner = new Scanner("5678\n1234\n");
//        when(gameUtils.getAnswerInput(any(Scanner.class))).thenReturn("5678", "1234");
//
//        // Mock game results
//        when(gameResults.takeTurn(eq(code), eq("5678"))).thenReturn(new int[]{0, 0});
//        when(gameResults.takeTurn(eq(code), eq("1234"))).thenReturn(new int[]{4, 0});
//
//        // Capture game output
//        CodeBreakerGame.main(new String[]{});
//
//        // Verify interactions
//        verify(gameUtils, times(1)).showInstructions();
//        verify(gameUtils, times(2)).getAnswerInput(any(Scanner.class));
//        verify(gameResults, times(1)).takeTurn(eq(code), eq("5678"));
//        verify(gameResults, times(1)).takeTurn(eq(code), eq("1234"));
//        verify(gameResults, times(2)).showResults(anyInt(), anyInt());
//        verify(gameResults, times(1)).showCode(eq(code));
//    }
//}