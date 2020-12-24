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