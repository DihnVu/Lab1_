import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorStatementTest {

    @Test
    void testSumEvenNumbers() {
        Calculator calculator = new Calculator();

        int result = calculator.sumEvenNumbers(5);

        assertEquals(6, result);
    }
}
