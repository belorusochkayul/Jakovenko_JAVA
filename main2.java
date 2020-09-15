import java.util.Scanner;

public class main2 {

    public static void main(String[] args) {

        int[] first = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int[] second = {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2};
        int[] result = new int[second.length + first.length];
        System.arraycopy(second, 0, result, 0, second.length / 2);
        System.arraycopy(first, 0, result, 10, first.length);
        System.arraycopy(second, 0, result, 20, second.length / 2);

        System.out.println("Source1:");
        printArray(first);
        System.out.println("Source2:");
        printArray(second);
        System.out.println("Result:");
        printArray(result);
    }

    static void printArray(int[] array) {
        for (int i : array)
            System.out.printf("%3d", i);  //увидела такой вариант с printf, решила попробовать
        System.out.println();
    }
}