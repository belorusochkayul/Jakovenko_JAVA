     package by.kiparo.Main2;

     import java.util.Scanner;

     public class Main2 {
     public static void main(String[] args) {

     Scanner massive = new Scanner(System.in);
     float array[] = new float[10];
     System.out.println("Введите 10 дробных элементов массива<=10:");

     for (int i = 0; i < array.length; i++) {
     array[i] = massive.nextFloat();
     }
     int array1[] = new int[10];
     System.out.print("Элементы введенного вами массива");

     for (int i = 0; i < array.length; i++) {
     System.out.print(" " + array[i]);
     array1[i] = Math.round(array[i]);}
     int[] x = new int[10];

     for (int i = 0; i < array1.length; i++) {
     x[array1[i]]++;
     }
     System.out.println(" элемент\tкол-во:");

     for (int j = 0; j < x.length; j++) {
     System.out.println(j + "\t     " + x[j]);
     }
     }
     }