package kiparo.com;

import kiparo.by.Light;
import kiparo.by.Room;
import org.junit.Assert;
import org.junit.Test;

public class RoomTest {

    @Test
    public void testIsIlluminanceCorrect() {   //ошибка
        Room room = new Room("стол", 300, 2);
        Light light = new Light(400);
        boolean result = room.isIlluminanceCorrect(400);
        Assert.assertTrue(result);
    }

    @Test
    public void testIncorrectIsIlluminanceCorrect() {
        Room room = new Room("стол", 300, 10);
        Light light = new Light(400);
        boolean result = room.isIlluminanceCorrect(400);
        Assert.assertFalse(result);
    }

    @Test
    public void testIsSpaceCorrect() {
        Room room = new Room("стол", 300, 4);
        boolean result = room.isSpaceCorrect(30);
        Assert.assertTrue(result);
    }

    @Test
    public void testIncorrectIsSpaceCorrect() {
        Room room = new Room("стол", 300, 4);
        boolean result = room.isSpaceCorrect(250);
        Assert.assertFalse(result);
    }
}