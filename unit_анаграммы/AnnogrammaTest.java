package kiparo.com;
import org.junit.Assert;
import org.junit.Test;

public class AnnogrammaTest {

    @Test
    public void test() {
        Annogramma annogramma = new Annogramma();
        boolean result = annogramma.checkAnagram("rim", "mir");
        Assert.assertTrue(result);
    }

    @Test
    public void testIncorrect() {
        Annogramma annogramma = new Annogramma();
        boolean result = annogramma.checkAnagram("kit", "kat");
        Assert.assertFalse(result);
    }
}