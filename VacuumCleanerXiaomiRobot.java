package by.kiparo.main;

public final class VacuumCleanerXiaomiRobot extends VacuumCleanerXiaomi{
    int cleaningArea;
    boolean wiFiСonnection;
    int autonomousTime;

    public VacuumCleanerXiaomiRobot(int power, String color, boolean autoPowerOff, int noiseLevel, int suctionPower, boolean wetCleaning, String modelXiaomi, boolean xiaomiBrandGuarantee, int cleaningArea, boolean wiFiСonnection, int autonomousTime) {
        super(power, color, autoPowerOff, noiseLevel, suctionPower, wetCleaning, modelXiaomi, xiaomiBrandGuarantee);
        this.cleaningArea = cleaningArea;
        this.wiFiСonnection = wiFiСonnection;
        this.autonomousTime = autonomousTime;
    }
}
