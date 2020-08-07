package by.kiparo.main;

public class VacuumCleaner extends ElectricalAppliance {
    int noiseLevel;
    int SuctionPower;
    boolean wetCleaning;

    public VacuumCleaner(int power, String color, boolean autoPowerOff, int noiseLevel, int suctionPower, boolean wetCleaning) {
        super(power, color, autoPowerOff);
        this.noiseLevel = noiseLevel;
        SuctionPower = suctionPower;
        this.wetCleaning = wetCleaning;
    }

    public void test() {
        System.out.println("Test");
    }

}




