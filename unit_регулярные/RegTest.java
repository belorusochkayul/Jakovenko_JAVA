package kiparo.com;

import org.junit.Assert;
import org.junit.Test;

public class RegTest {

    @Test
    public void test() {
        Reg regular = new Reg();
        String result = regular.regCheck("\\d{4}\\s[A-Z]{2}[-][1-7]", "1234 PC-6");
        Assert.assertEquals("1234PC6", result);
    }

    @Test
    public void testIncorrect() {
        Reg regular = new Reg();
        String result = regular.regCheck("\\d{4}\\s[A-Z]{2}[-][1-7]", "1234 PC-6");
        Assert.assertNotEquals("1234 PC 6", result);
    }
}