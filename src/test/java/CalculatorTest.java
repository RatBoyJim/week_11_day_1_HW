import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void setUp(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    public void canSubtract(){
        assertEquals(5, calculator.subtract(10, 5));
    }

    @Test
    public void canMultiply(){
        assertEquals(20, calculator.multiply(5, 4));
    }

    @Test
    public void canDivide(){
        assertEquals(4, calculator.divide(20.00, 5.00), 0.01);
    }


}
