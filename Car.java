    package by.kiparo.Cars;

    public class Car {

    String brand;
    int tankVolume;
    boolean transmission;

    public Car(String brand, int tankVolume, boolean transmission){

    this.tankVolume = tankVolume;
    this.brand = brand.toUpperCase();
    this.transmission = transmission;
    }
    }