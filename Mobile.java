package by.kiparo.main;

public class Mobile extends ElectricalAppliance{
    int batteryCapacity;
    String cpu;
    int diagonal;
    int thickness;

    public Mobile(int power, String color, boolean autoPowerOff, int batteryCapacity, String CPU, int diagonal, int thickness) {
        super(power, color, autoPowerOff);
        this.batteryCapacity = batteryCapacity;
        this.cpu = cpu;
        this.diagonal = diagonal;
        this.thickness = thickness;
    }
}
