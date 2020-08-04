    package by.kiparo.Cars;

    import java.util.Scanner;

    public class Main {
    public static final int CARS_SIZE = 3;
    public static void main(String[] arg) {
    Cars [] cars = new Cars [CARS_SIZE];
    for (int i = 0; i < cars.length; i++){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите марку авто");
    String brand = scanner.nextLine();
    System.out.println("Введите объем бака автомобиля");
    int tank_volume = scanner.nextInt();
    System.out.println("Выберите верное: коробка автомат - true; механика - false");
    boolean transmission = scanner.nextBoolean();
    Cars car = new Cars(brand,tank_volume,transmission);
    cars [i] = car;
    }
    for (int i = 0; i < cars.length; i++) {
    System.out.println("Car model: " + cars [i]. brand + "  Tank volume: " + cars [i].tank_volume + "  Automаtic transmission: " + cars [i]. transmission);
    }
    System.out.println("Введите марку авто для поиска");
    Scanner scanner = new Scanner(System.in);
    String brand = scanner.nextLine();
    for (int i = 0; i < cars.length; i++) {
    if (cars[i].brand.equals(brand)) {
    System.out.println("Car model: " + cars [i]. brand + "  Tank volume: " + cars [i].tank_volume+ "  Automаtic transmission: "+ cars [i]. transmission);
    break;
    }
    }
    }
    }
