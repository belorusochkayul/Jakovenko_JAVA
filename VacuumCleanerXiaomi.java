package by.kiparo.main;

public class VacuumCleanerXiaomi extends VacuumCleaner {
    String modelXiaomi;
    boolean xiaomiBrandGuarantee;

    public VacuumCleanerXiaomi(int power, String color, boolean autoPowerOff, int noiseLevel, int suctionPower, boolean wetCleaning, String modelXiaomi, boolean xiaomiBrandGuarantee) {
        super(power, color, autoPowerOff, noiseLevel, suctionPower, wetCleaning);
        this.modelXiaomi = modelXiaomi;
        this.xiaomiBrandGuarantee = xiaomiBrandGuarantee;
    }
    @Override
    public void info1() {
        super.info1();
        System.out.println("by Xiaomi");
    }
}
