package by.kiparo.main;

public final class KettleSamsung extends Kettle{
    String samsungModel;
    boolean brandedLighting;

    public KettleSamsung(int power, String color, boolean autoPowerOff, String heatingElementType, int volume, String samsungModel, boolean brandedLighting) {
        super(power, color, autoPowerOff, heatingElementType, volume);
        this.samsungModel = samsungModel;
        this.brandedLighting = brandedLighting;
    }
    @Override
    public void info1() {
        super.info1();
        System.out.println("by Samsung");
    }
}
