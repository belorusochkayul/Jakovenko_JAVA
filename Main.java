import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Light light1 = new Light(200);
        Light light2 = new Light(150);

        Subject subject1 = new Subject("Стол письменный", 30);
        Subject subject2 = new Subject("Мягкое кресло", 10);

        Room room1 = new Room("комната1", 2000, 3);
        Room room2 = new Room("комната2", 1000, 5);
        List<Room> rooms = new ArrayList<>();

        rooms.add(room1);
        rooms.add(room2);

        try {
            room1.addLight(light1);
            room1.addLight(light2);
            room2.addLight(light1);
        } catch (IlluminanceTooMuchException e) {
            e.printStackTrace();
        }
        try {
            room2.addSubject(subject1);
            room1.addSubject(subject1);
            room1.addSubject(subject2);
        } catch (SpaceUsageTooMuchException e) {
            e.printStackTrace();
        }
        Building building = new Building("Здание 1");
        building.addRoom(room1);
        building.addRoom(room2);
        building.describe();
    }
}