import java.util.ArrayList;
import java.util.List;

public class Building implements Describe {
    private String buildingname;
    private List<Room> rooms = new ArrayList<>();

    public Building(String buildingname) {
        this.buildingname = buildingname;
    }

    public String getBuildingname() {
        return buildingname;
    }

    public void setBuildingname(String buildingname) {
        this.buildingname = buildingname;
    }

    public Building(List<Room> rooms) {
        this.rooms = rooms;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    @Override
    public void describe() {
        System.out.println(getBuildingname());
        for (Room room : rooms) {
            System.out.println(room.getRoomName() + " Освещённость = " + (room.getTotalLightOfLamps() + (room.getWindowQuantity() * room.WINDOWLIGHT)) + "(" + room.getWindowQuantity() + " окна по 700 лк" + ")" + " лампочки:");
            room.lightDescribe();
            System.out.println("Площадь = " + room.getRoomSquare() + " м^2 (занято " + room.getOccupiedSquare() + " м^2, гарантированно свободно " + room.getFreeSquare() + " м^2 или " + room.space() + " % площади)");
            room.subjectDescribe();
        }
    }
}