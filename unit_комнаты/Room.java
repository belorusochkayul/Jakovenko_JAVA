package kiparo.by;

import java.util.ArrayList;
import java.util.List;

public class Room implements Describe {
    private static final int MINLIGHT = 300;
    private static final int MAXLIGHT = 4000;
    public static final int PERCENT = 70;
    private static final int WINDOWLIGHT = 700;

    private String roomName;
    private int roomSquare;
    private int windowQuantity;
    private List<Light> lamps = new ArrayList<>();
    private List<Subject> subjects = new ArrayList<>();

    public Room(String roomName, int roomSquare, int windowQuantity) {
        this.roomName = roomName;
        this.roomSquare = roomSquare;
        this.windowQuantity = windowQuantity;
    }

    public Room(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public int getWindowQuantity() {
        return windowQuantity;
    }

    public void setWindowQuantity(int windowQuantity) {
        this.windowQuantity = windowQuantity;
    }

    public int getRoomSquare() {
        return roomSquare;
    }

    public String getRoomName() {
        return roomName;
    }

    public List<Light> getLamps() {
        return lamps;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    // освещение
    public int getTotalLightOfLamps() {
        List<Light> lamps = getLamps();
        int totalLight = 0;
        for (Light light : lamps) {
            totalLight += light.getLampLight();
        }
        return totalLight;
    }

    public boolean isIlluminanceUpperLimitCorrect(int lampLight) {
        int totalLight = getTotalLightOfLamps() + lampLight;
        int illuminationResult = totalLight + (getWindowQuantity() * WINDOWLIGHT);
        if (illuminationResult < MAXLIGHT) {
            return true;
        }
        return false;
    }
    public boolean isIlluminanceLowLimitCorrect(int lampLight) {
        int totalLight = getTotalLightOfLamps() + lampLight;
        int illuminationResult = totalLight + (getWindowQuantity() * WINDOWLIGHT);
        if (illuminationResult > MINLIGHT) {
            return true;
        }
        return false;
    }

    public void addLight(Light lamp) throws IlluminanceTooMuchException,IlluminanceTooLowException {
        if (isIlluminanceUpperLimitCorrect(lamp.getLampLight()) == true) {
            lamps.add(lamp);
        } else {
            throw new IlluminanceTooMuchException() ;
        }
        if (isIlluminanceLowLimitCorrect(lamp.getLampLight()) == true) {
            lamps.add(lamp);
        } else {
            throw new IlluminanceTooLowException();
        }
    }
    // предметы
    public int getOccupiedSquare() {
        int totalSquare = 0;
        for (Subject value : subjects) {
            totalSquare += value.getSubjectSquare();
        }
        return totalSquare;
    }

    public int getFreeSquare() {
        int notFree = getOccupiedSquare();
        int freeSquare = 0;
        int roomSquare = getRoomSquare();
        freeSquare = roomSquare - notFree;
        return freeSquare;
    }

    public static boolean isCarNumber(String number) {
        return true;
    }

    public int space() {
        int notFree = getOccupiedSquare();
        int roomSquare = getRoomSquare();
        int space = 0;
        try {
            space = (100 - ((100 * notFree) / roomSquare));
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль, площадь не может быть = 0");
        }
        return space;
    }

    public boolean isSpaceCorrect(int square) {
        int totalSquare = getOccupiedSquare() + square;
        int roomSquare = getRoomSquare();

        try {
            int result = (100 * totalSquare) / roomSquare;
            if (result < PERCENT) {
                return true;
            }
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }
        return false;
    }

    public void addSubject(Subject subject) throws SpaceUsageTooMuchException {
        if (isSpaceCorrect(subject.getSubjectSquare()) == true) {
            subjects.add(subject);
        } else {
            try {
                throw new SpaceUsageTooMuchException();
            } catch (SpaceUsageTooMuchException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void printDescribe() {
        System.out.println(getRoomName() + " Освещённость = " + (getTotalLightOfLamps() + (getWindowQuantity() * WINDOWLIGHT)) + "(" + getWindowQuantity() + " окна по 700 лк" + ")" + " лампочки:");
        for (Light light : lamps) {
            light.printDescribe();
        }
        System.out.println("Площадь = " + getRoomSquare() + " м^2 (занято " + getOccupiedSquare() + " м^2, гарантированно свободно " + getFreeSquare() + " м^2 или " + space() + " % площади)");
        for (Subject subject : subjects) {
            subject.printDescribe();
        }
    }
}