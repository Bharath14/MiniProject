package calculator;
import calculator.Calculator;
import static org.junit.Assert.*;
import org.junit.Test;
public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Calculator calc = new Calculator();

    @Test
    public void squarerootTruePositive()
    {
        assertEquals ("Square root of an Int - True Positive", 2, calc.SquareRoot(4), DELTA);
        assertEquals ("Square root of an Int - True Positive", 4, calc.SquareRoot(16), DELTA);
    }

    @Test
    public void squarerootFalsePositive()
    {
        assertNotEquals ("Square root of an Int - True Positive", 3, calc.SquareRoot(7), DELTA);
        assertNotEquals ("Square root of an Int - True Positive", 5, calc.SquareRoot(49), DELTA);
    }
}
