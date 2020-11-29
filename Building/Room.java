import java.util.ArrayList;
import java.util.List;

public class Room {
    public static final int MINLIGHT = 300;
    public static final int MAXLIGHT = 4000;
    public static final int PERCENT = 70;
    public static final int WINDOWLIGHT = 700;

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

    public int getWindowQuantity() {
        return windowQuantity;
    }

    public void setWindowQuantity(int windowQuantity) {
        this.windowQuantity = windowQuantity;
    }

    public int getRoomSquare() {
        return roomSquare;
    }

    public void setRoomSquare(int roomSquare) {
        this.roomSquare = roomSquare;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public List<Light> getLamps() {
        return lamps;
    }

    public void setLamps(List<Light> lamps) {
        this.lamps = lamps;
    }

    public Room(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
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

    public boolean isIlluminanceTooMuch(int lampLight) {
        int totalLight = getTotalLightOfLamps() + lampLight;
        int illuminationResult = totalLight + (getWindowQuantity() * WINDOWLIGHT);
        if (illuminationResult < MAXLIGHT && illuminationResult > MINLIGHT) {
            return true;
        }
        return false;
    }

    public void addLight(Light lamp) throws IlluminanceTooMuchException {
        if (isIlluminanceTooMuch(lamp.getLampLight()) == true) {
            lamps.add(lamp);
        } else {
            try {
                throw new IlluminanceTooMuchException();
            } catch (IlluminanceTooMuchException e) {
                e.printStackTrace();
            }
        }
    }

    // предметы
    public int getOccupiedSquare() {
        List<Subject> subjects = getSubjects();
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

    public boolean isSpaceTooMuch(int square) {
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
        if (isSpaceTooMuch(subject.getSubjectSquare()) == true) {
            subjects.add(subject);
        } else {
            try {
                throw new SpaceUsageTooMuchException();
            } catch (SpaceUsageTooMuchException e) {
                e.printStackTrace();
            }
        }
    }

    public void subjectDescribe() {
        System.out.println("Мебель:");
        for (Subject value : subjects) {
            System.out.println(value.getSubjectName() + " (площадь " + value.getSubjectSquare() + " м^2" + ")");
        }
    }

    public void lightDescribe() {
        for (Light value : lamps) {
            System.out.println(value.getLampLight() + " лк");
        }
    }
}