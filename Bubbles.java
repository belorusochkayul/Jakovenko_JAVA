package by.kiparo.Main5;

import java.util.Scanner;

public class Bubbles {
    public static void main(String[] args) {
        System.out.println("Введите размер масива:");
        Scanner vvod = new Scanner(System.in);
        int size = vvod.nextInt();
        int[] mas = new int[size];
        int i = 0;
        for (int element : mas) {
            System.out.println("Введите " + (i + 1) + "-й элемент :");
            mas[i] = vvod.nextInt();
            i++;
        }
        System.out.print("Сформированный вами массив: ");
        for (int element : mas) {
            System.out.print(element + "");
        }
        Boolean Sorted = false;
        int buf;
        while (!Sorted) {
            Sorted = true;
            for (int j = 0; j < mas.length - 1; j++) {
                if (mas[j] > mas[j + 1]) {
                    Sorted = false;
                    buf = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = buf;
                }
            }
        }
        System.out.print("  Отсортированный массив: ");
        for (int element : mas) {
        System.out.print(+element + "");
        }

     }
}