package kiparo.com;

import kiparo.by.*;
import org.junit.Assert;
import org.junit.Test;

public class RoomTest {

    @Test
    public void IsIlluminanceLowLimitCorrect() {
        Room room = new Room("стол", 300, 0);
        boolean result = room.isIlluminanceLowLimitCorrect(301);
        Assert.assertTrue(result);
    }

    @Test
    public void IncorrectIsIlluminanceLowLimitCorrect() {
        Room room = new Room("стол", 300, 0);
        boolean result = room.isIlluminanceLowLimitCorrect(299);
        Assert.assertFalse(result);
    }

    @Test
    public void IsIlluminanceUpperLimitCorrect() {
        Room room = new Room("стол", 300, 0);
        boolean result = room.isIlluminanceUpperLimitCorrect(3999);
        Assert.assertTrue(result);
    }

    @Test
    public void IncorrectIsIlluminanceUpperLimitCorrect() {
        Room room = new Room("стол", 300, 0);
        boolean result = room.isIlluminanceUpperLimitCorrect(4001);
        Assert.assertFalse(result);
    }

    @Test
    public void IsSpaceCorrect() {
        Room room = new Room("стол", 300, 4);
        boolean result = room.isSpaceCorrect(30);
        Assert.assertTrue(result);
    }

    @Test
    public void IncorrectIsSpaceCorrect() {
        Room room = new Room("стол", 300, 4);
        boolean result = room.isSpaceCorrect(250);
        Assert.assertFalse(result);
    }
// исключения

    @Test
    public void isIlluminanceUpperLimitCorrect() {
        Room room = new Room("стол", 300, 0);
        Light light = new Light(4001);
        Assert.assertThrows(IlluminanceTooMuchException.class, () -> {
            room.addLight(light);
        });
    }

    @Test
    public void isIlluminanceLowLimitCorrect() {
        Room room = new Room("стол", 300, 0);
        Light light = new Light(299);
        Assert.assertThrows(IlluminanceTooLowException.class, () -> {
            room.addLight(light);
        });
    }

    @Test
    public void isSpaceCorrect() {
        Room room = new Room("стол", 1000, 1);
        Subject subject = new Subject("стол", 699);
        Assert.assertThrows(SpaceUsageTooMuchException.class, () -> {
            room.addSubject(subject);
        });
    }
}