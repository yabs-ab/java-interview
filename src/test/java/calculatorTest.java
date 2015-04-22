import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class calculatorTest extends TestCase {

    @Test
    public void testMultiply() {
        int val = calculator.main(new String[] {"157", "*", "2"});
        assertEquals(val, 314);
    }

    @Test
    public void testAdd() {
        int val = calculator.main(new String[] {"112", "+", "47"});
        assertEquals(val, 159);
    }

    @Test
    public void testDivision() {
        int val = calculator.main(new String[] {"795", "/", "3"});
        assertEquals(val, 265);
    }

    @Test
    public void testSubtract() {
        int val = calculator.main(new String[] {"521", "-", "162"});
        assertEquals(val, 359);
    }
}