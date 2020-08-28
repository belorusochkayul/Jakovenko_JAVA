package by.kiparo.main;

public class ElectricalAppliance {
    int power;
    String color;
    boolean autoPowerOff;

    public ElectricalAppliance(int power, String color, boolean autoPowerOff) {
        this.power = power;
        this.color = color;
        this.autoPowerOff = autoPowerOff;
    }

    public final void info() {
        System.out.println("Observe safety");
    }
    public void info1() {
        System.out.println("All rights reserved");
    }
}