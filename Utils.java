import java.util.Scanner;

public class Utils {

    public static int[] fillArray() {
        Scanner ar = new Scanner(System.in);
        System.out.println("Введите длину массива:");
        int size = ar.nextInt();
        int array[] = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = ar.nextInt();
        }
        return (array);
    }

    public static int[] printArray(int array[]) {
        System.out.print("Сформировнный вами массив:  ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
        return (array);
    }

    public static float[] fillArrayFloat() {
        Scanner ar = new Scanner(System.in);
        System.out.println("Введите длину массива:");
        int size = ar.nextInt();
        float array[] = new float[size];
        System.out.println("Введите дробные элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = ar.nextFloat();
        }
        return (array);
    }

    public static float[] printArrayFloat(float array[]) {
        System.out.print("Сформированный вами массив:  ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
        return (array);
    }

    public static void invertedArray(int array[]) {
        System.out.println();
        System.out.print("Инвертированный массив:");
        for (int i = 0; i < array.length / 2; i++) {
            int j = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = j;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
    }
}