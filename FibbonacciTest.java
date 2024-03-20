import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibbonacciTest {

    @Test
    void factorial() {
        int input = 6;
        int actual = Fibbonacci.factorial(input);
        int expected = 13;
        Assert.assertEquals(expected,actual);
    }
}