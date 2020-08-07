package by.kiparo.main;

public class Kettle extends ElectricalAppliance{
    String heatingElementType;
    int volume;

    public Kettle(int power, String color, boolean autoPowerOff, String heatingElementType, int volume) {
        super(power, color, autoPowerOff);
        this.heatingElementType = heatingElementType;
        this.volume = volume;
    }
}
