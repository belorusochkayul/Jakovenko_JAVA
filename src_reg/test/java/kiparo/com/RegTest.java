package kiparo.com;

import org.junit.Assert;
import org.junit.Test;

public class RegTest {

    @Test
    public void isBelarusCarNumber() {
        String carNumber = "1234 KM-7";
        boolean expected = true;
        boolean actual = NumberCheck.isBelarusCarNumber(carNumber);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isBelarusCarNumberNot() {
        String carNumber = "1234 KM-9";
        boolean expected = false;
        boolean actual = NumberCheck.isBelarusCarNumber(carNumber);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void cleanAllSymbolsExceptNumberLetters() {
        String carNumber = "1234 KM-5";
        String expected = "1234KM5";
        String actual = NumberCheck.cleanCarNumberExceptNumberLetters(carNumber);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void formatShouldAddNumberWithBySuffix() {
        String carNumber = "1234 KM-5";
        String expected = carNumber + "BY";
        boolean isBelarusCarNumber = true;
        String actual = NumberCheck.formatCarNumber(carNumber, isBelarusCarNumber);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void formatShouldAddNumberWithNotSuffix() {
        String carNumber = "1234 0O-10";
        String expected = carNumber + "NOT BY";
        boolean isBelarusCarNumber = false;
        String actual = NumberCheck.formatCarNumber(carNumber, isBelarusCarNumber);
        Assert.assertEquals(expected, actual);
    }
}