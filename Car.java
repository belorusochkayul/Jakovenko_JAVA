
public class Car {

    private String brand;
    private int tankVolume;
    private boolean transmission;

    public Car(String brand, int tankVolume, boolean transmission) {

        this.tankVolume = tankVolume;
        this.brand = brand.toUpperCase();
        this.transmission = transmission;
    }

    public String getBrand() {
        return brand;
    }

    public int getTankVolume() {
        return tankVolume;
    }

    public boolean isTransmission() {
        return transmission;
    }
}