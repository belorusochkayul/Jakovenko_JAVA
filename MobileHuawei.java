package by.kiparo.main;

public final class MobileHuawei extends Mobile{
    boolean huaweiSupport;
    String modeHuawei;
    int additionalMemory;

    public MobileHuawei(int power, String color, boolean autoPowerOff, int batteryCapacity, String CPU, int diagonal, int thickness, boolean huaweisupport, String modeHuawei, int additionalMemory) {
        super(power, color, autoPowerOff, batteryCapacity, CPU, diagonal, thickness);
        huaweiSupport = huaweisupport;
        this.modeHuawei = modeHuawei;
        this.additionalMemory = additionalMemory;
    }
    @Override
    public void info1() {
        super.info1();
        System.out.println("by Huawei");
    }
}
