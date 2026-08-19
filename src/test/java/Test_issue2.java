import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorPathTest {

    @Test
    void testLoopNotExecuted() {
        Calculator calculator = new Calculator();

        int result = calculator.sumEvenNumbers(0);

        assertEquals(0, result);
    }

    @Test
    void testIfConditionTrue() {
        Calculator calculator = new Calculator();

        int result = calculator.sumEvenNumbers(2);

        assertEquals(2, result);
    }

    @Test
    void testIfConditionFalse() {
        Calculator calculator = new Calculator();

        int result = calculator.sumEvenNumbers(1);

        assertEquals(0, result);
    }

    @Test
    void testMultipleIterations() {
        Calculator calculator = new Calculator();

        int result = calculator.sumEvenNumbers(5);

        assertEquals(6, result);
    }
}
