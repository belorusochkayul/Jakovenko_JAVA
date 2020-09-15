import java.util.Scanner;

public class Main {

    private static final int CARSSIZE = 3;
    int cars[];

    public static void main(String[] arg) {
        Car[] cars = Main.vvodInfo();
        printInfo(cars);
        Car[] searchcars = vvodSearch(cars);
        printInfo(searchcars);
    }

    public static Car[] vvodInfo() {
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
        return cars;
    }

    public static void printInfo(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            System.out.println("Car model: " + cars[i].getBrand() + "  Tank volume: " + cars[i].getTankVolume() + "  Automаtic transmission: " + cars[i].isTransmission());
        }
    }
    public static Car[] vvodSearch(Car[] cars) {
        System.out.println("Введите марку авто для поиска");
        Scanner scanner = new Scanner(System.in);
        String brand = scanner.nextLine();
        Car[] carsFilter = new Car[cars.length];
        int j = 0;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getBrand().equals(brand.toUpperCase())) {
                carsFilter[j] = cars[i];
                j++;
            }
        }
        Car[] carsResult = new Car[j];
        System.arraycopy(carsFilter, 0, carsResult, 0, j);
        return carsResult;
    }
}