package by.kiparo.Main2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner massive = new Scanner(System.in);
        int array[] = new int[10];
        System.out.println("Введите 10 целочиленных элементов массива<=20:");
        for (int i = 0; i<array.length; i++){
            array[i] = massive.nextInt();
        }
        System.out.print("Элементы введенного вами массива");
        for (int i=0; i<array.length; i++) {
            System.out.print(" "+array[i]);
        }

        int[] x = new int[20];
        for (int i = 0; i < array.length; i++) {
            x [array[i]]++;
        }
        System.out.println(" элемент\tкол-во:");
        for (int i = 0; i < x.length; i++) {
            System.out.println(i + "\t     " + x[i]);
        }
    }
}