package by.kiparo.main;

public class Mobile extends ElectricalAppliance{
    int batteryCapacity;
    String CPU;
    int diagonal;
    int thickness;

    public Mobile(int power, String color, boolean autoPowerOff, int batteryCapacity, String CPU, int diagonal, int thickness) {
        super(power, color, autoPowerOff);
        this.batteryCapacity = batteryCapacity;
        this.CPU = CPU;
        this.diagonal = diagonal;
        this.thickness = thickness;
    }
}
