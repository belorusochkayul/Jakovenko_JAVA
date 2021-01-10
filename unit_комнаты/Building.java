package kiparo.by;

import java.util.ArrayList;
import java.util.List;

public class Building {
    private String buildingName;
    private List<Room> rooms = new ArrayList<>();

    public Building(String buildingName, List<Room> rooms) {
        this.buildingName = buildingName;
        this.rooms = rooms;
    }

    public Building(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void describe() {
        System.out.println(getBuildingName());
        for (Room room : rooms) {
            room.printDescribe();
        }
    }
} 