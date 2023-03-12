import static org.junit.Assert.*;

public class calculatorTest {

    @org.junit.Test
    public void add() {
        calculator calc = new calculator();
        int actual = calc.add(34,34);
        int expected = 68;
        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void subtract() {
        calculator calc = new calculator();
        int actual = calc.subtract(34,34);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void multiply() {
        calculator calc = new calculator();
        int actual = calc.multiply(5,5);
        int expected = 25;
        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void divide() {
        calculator calc = new calculator();
        int actual = calc.divide(5,5);
        int expected = 1;
        assertEquals(actual, expected);
    }
}