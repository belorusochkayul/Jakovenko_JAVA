package by.kiparo.array;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner massive = new Scanner(System.in);
    int array[] = new int[10];
    System.out.println("Введите 10 целочиленных элементов массива:");
    for (int i = 0; i<array.length; i++){
        array[i] = massive.nextInt();
    }
    System.out.print("Элементы введенного вами массива");
    for (int i=0; i<array.length; i++) {
        System.out.print(" "+array[i]);
    }
System.out.println();
int max = array[0];
int min = array[0];
for (int i=0; i<array.length; i++) {
    if (array[i] >= max) {
        max = array[i];
    }
    if (array[i] <= min) {
        min = array[i];
    }
}
System.out.println("max value=" + max + "  min value="+ min);
        for (int i=0; i<array.length; i++) {
            if (array[i] == max) {
                 array[i]=99;
            }
            if (array[i] == min) {
                array[i]=0;
            }
        }
        System.out.println("Элементы нового массива");
        for (int i=0; i<array.length; i++) {
            System.out.print(" "+array[i]);
        }

    }
}
package by.kiparo.main;

public class Main {
    public static void main (String [] args){

        ElectricalAppliance electricalAppliance = new ElectricalAppliance(45, "white",true );
        VacuumCleaner vacuumCleaner = new VacuumCleaner(90, "red",true,40,25,true);
        VacuumCleanerXiaomi vacuumCleanerXiaomi = new VacuumCleanerXiaomi(67,"black",false,46,78,true,"P-Light",true);
        VacuumCleanerXiaomiRobot vacuumCleanerXiaomiRobot = new VacuumCleanerXiaomiRobot(45,"blue",true,30,40,true,"Summer",false,400,true,2);
        Kettle kettle = new Kettle(56,"white",false,"spiral",5);
        KettleSamsung kettleSamsung = new KettleSamsung(100,"green", true, "doubleSpiral",6,"Easy",true);
        HairDryer hairDryer = new HairDryer(90,"black", true, 5,true);
        HairDryerBosh hairDryerBosh = new HairDryerBosh(45, "purple",false,8,true,4,true);
        Mobile mobile = new Mobile(60, "metallic", true,5,"A72",80,30);
        MobileHuawei mobileHuawei = new MobileHuawei(50,"yellow",true,45,"GG78", 90,32,true,"Pro20",2);

        electricalAppliance.info();
        kettleSamsung.info1();
        vacuumCleanerXiaomi.info1();

        System.out.println("Сolors of my technique: " + "  kettle - " + kettleSamsung.color + "  hairDryer - " + hairDryerBosh.color + "  vacuumCleaner - " + vacuumCleanerXiaomi.color + "  mobile - " + mobileHuawei.color);
    }

}
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
