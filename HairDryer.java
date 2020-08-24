package by.kiparo.main;

public class HairDryer extends  ElectricalAppliance{
    int numberOfNozzles;
    boolean coldAir;

    public HairDryer(int power, String color, boolean autoPowerOff, int numberOfNozzles, boolean coldAir) {
        super(power, color, autoPowerOff);
        this.numberOfNozzles = numberOfNozzles;
        this.coldAir = coldAir;
    }
}
