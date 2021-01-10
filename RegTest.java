package kiparo.com;

import org.junit.Assert;
import org.junit.Test;

public class RegTest {

    @Test
    public void IsCarNumberIsBelorussianPrintBY() {
        Reg regular = new Reg();
        String result = regular.IsCarNumberIsBelorussianPrint("1223", true);
        Assert.assertEquals("1223" + "BY", result);
    }

    @Test
    public void IsCarNumberIsBelorussianPrintNotBY() {
        Reg regular = new Reg();
        String result = regular.IsCarNumberIsBelorussianPrint("1223", false);
        Assert.assertEquals("1223" + "NOT BY", result);
    }

    @Test
    public void IsCarNumberIsBelorussianPrintIncorrect1() {
        Reg regular = new Reg();
        String result = regular.IsCarNumberIsBelorussianPrint("1223", false);
        Assert.assertNotEquals("1223" + "BY", result);
    }

    @Test
    public void IsCarNumberIsBelorussianPrintIncorrect2() {
        Reg regular = new Reg();
        String result = regular.IsCarNumberIsBelorussianPrint("1223", true);
        Assert.assertNotEquals("1223" + "NOT BY", result);
    }
}