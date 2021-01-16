package kiparo.com;

import kiparo.by.*;
import org.junit.Assert;
import org.junit.Test;

public class RoomTest {

    @Test
    public void isIlluminanceLowLimitCorrect() {
        int roomSquare = 300;
        int windowQuantity = 0;

        Room room = new Room("стол", roomSquare, windowQuantity);
        boolean result = room.isIlluminanceLowLimitCorrect(301);
        Assert.assertTrue(result);
    }

    @Test
    public void incorrectIsIlluminanceLowLimitCorrect() {
        int roomSquare = 300;
        int windowQuantity = 0;

        Room room = new Room("стол", roomSquare, windowQuantity);
        boolean result = room.isIlluminanceLowLimitCorrect(299);
        Assert.assertFalse(result);
    }

    @Test
    public void isIlluminanceUpperLimitCorrect() {
        int roomSquare = 300;
        int windowQuantity = 0;

        Room room = new Room("стол", roomSquare, windowQuantity);
        boolean result = room.isIlluminanceUpperLimitCorrect(3999);
        Assert.assertTrue(result);
    }

    @Test
    public void incorrectIsIlluminanceUpperLimitCorrect() {
        int roomSquare = 300;
        int windowQuantity = 0;

        Room room = new Room("стол", roomSquare, windowQuantity);
        boolean result = room.isIlluminanceUpperLimitCorrect(4001);
        Assert.assertFalse(result);
    }

    @Test
    public void isSpaceCorrect() {
        int roomSquare = 300;
        int windowQuantity = 4;

        Room room = new Room("стол", roomSquare, windowQuantity);
        boolean result = room.isSpaceCorrect(30);
        Assert.assertTrue(result);
    }

    @Test
    public void incorrectIsSpaceCorrect() {
        int roomSquare = 300;
        int windowQuantity = 4;

        Room room = new Room("стол", roomSquare, windowQuantity);
        boolean result = room.isSpaceCorrect(250);
        Assert.assertFalse(result);
    }

// исключения
    @Test
    public void isIlluminanceUpperLimitExceptionCorrect() {
        int roomSquare = 300;
        int windowQuantity = 0;

        Room room = new Room("стол", roomSquare, windowQuantity);
        Light light = new Light(4001);
        Assert.assertThrows(IlluminanceTooMuchException.class, () -> {
            room.addLight(light);
        });
    }

    @Test
    public void isIlluminanceLowLimitExceptionCorrect() {
        int roomSquare = 300;
        int windowQuantity = 0;

        Room room = new Room("стол", roomSquare, windowQuantity);
        Light light = new Light(299);
        Assert.assertThrows(IlluminanceTooLowException.class, () -> {
            room.addLight(light);
        });
    }

    @Test
    public void isSpaceExceptionCorrect() {
        int roomSquare = 300;
        int windowQuantity = 5;

        Room room = new Room("стол", roomSquare, windowQuantity);
        Subject subject = new Subject("стол", 209);
        Assert.assertThrows(SpaceUsageTooMuchException.class, () -> {
            room.addSubject(subject);
        });
    }
}