package kipaaro.com;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Введите размер масива:");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] mas = new int[size];
        int i = 0;

        for (int element : mas) {
            System.out.println("Введите " + (i + 1) + "-й элемент :");
            mas[i] = scanner.nextInt();
            i++;
        }
        System.out.print("Сформированный вами массив: ");

        for (int element : mas) {
            System.out.print(element + "");
        }
        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;

            for (int j = 0; j < mas.length - 1; j++) {
                if (mas[j] > mas[j + 1]) {
                    isSorted = false;
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