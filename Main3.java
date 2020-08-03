package by.kiparo.array3;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args){
        Scanner ar = new Scanner(System.in);
        System.out.println("Введите длину массива:");
        int size = ar.nextInt();
        int array[]=new int[size];
        System.out.println("Введите элементы массива:");
        for(int i=0; i<size;i++){
            array[i] = ar.nextInt();
        }
        System.out.print("Сформировнный вами массив:  ");
        for (int i=0; i<size;i++) {
            System.out.print (" "+array[i]);
        }
        System.out.println();
        System.out.print("Инвертированный массив:");
        for (int i=0; i<size/2;i++) {
            int j=array[i]; array[i]=array[size-1-i]; array[size-1-i] = j;
        }
for (int i=0; i<size;i++) {
    System.out.print(" " + array[i]);
}


    }
}
