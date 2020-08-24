package by.kiparo.array4;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        System.out.println("Введите размер масива:");
        Scanner vvod = new Scanner(System.in);
        int size = vvod.nextInt();
        int[] mas4 = new int[size];
        int i = 0;
        for (int element : mas4) {
            System.out.println("Введите " + (i + 1) + "-й элемент :");
            mas4[i] = vvod.nextInt();
            i++;
        }
        System.out.print("Сформированный вами массив: ");
        for (int element : mas4) {
            System.out.print(element + "");
        }
        boolean result = true;
        for (int j = 1; j < mas4.length; j++) {
            if (mas4[j] <= mas4[j - 1]) {
            result = false;
            break;
            }
        }
        if (result) {
            System.out.println("  -это-строго возрастающая последовательность");
        }
        else {
            System.out.println("  -это- НЕ строго возрастающая последовательность");
        }
    }
}
