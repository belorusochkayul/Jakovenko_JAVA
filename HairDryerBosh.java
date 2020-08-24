package by.kiparo.main;

public final class HairDryerBosh extends HairDryer {
    int numberBoshMode;
    boolean ionization;

    public HairDryerBosh(int power, String color, boolean autoPowerOff, int numberOfNozzles, boolean coldAir, int numberBoshMode, boolean ionization) {
        super(power, color, autoPowerOff, numberOfNozzles, coldAir);
        this.numberBoshMode = numberBoshMode;
        this.ionization = ionization;
    }
    @Override
    public void info1() {
        super.info1();
        System.out.println("by Bosh");
    }
}
