    package by.kiparo.Cars;

    import java.util.Scanner;

    public class Main {

    public static final int CARSSIZE = 3;
    public static void main(String[] arg) {

    Car[] cars = new Car[CARSSIZE];
    for (int i = 0; i < cars.length; i++) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите марку авто");
    String brand = scanner.nextLine();
    System.out.println("Введите объем бака автомобиля");
    int tankVolume = scanner.nextInt();
    System.out.println("Выберите верное: коробка автомат - true; механика - false");
    boolean transmission = scanner.nextBoolean();
    Car car = new Car(brand, tankVolume, transmission);
    cars[i] = car;
    }
    for (int i = 0; i < cars.length; i++) {
    System.out.println("Car model: " + cars[i].brand + "  Tank volume: " + cars[i].tankVolume + "  Automаtic transmission: " + cars[i].transmission);
    }
    System.out.println("Введите марку авто для поиска");
    Scanner scanner = new Scanner(System.in);
    String brand = scanner.nextLine();

    for (int i = 0; i < cars.length; i++) {
    if (cars[i].brand.equals(brand.toUpperCase())) {
    System.out.println("Car model: " + cars[i].brand + "  Tank volume: " + cars[i].tankVolume + "  Automаtic transmission: " + cars[i].transmission);
    break;
    }
    }
    }
    }
