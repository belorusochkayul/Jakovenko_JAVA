package kiparo.com;

import java.util.Scanner;

public class MainUnits {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое слово:");
        String word1 = scan.next();
        System.out.println("Введите второе слово:");
        String word2 = scan.next();
        Annogramma annogramma = new Annogramma();
        boolean rez = annogramma.checkAnagram(word1, word2);

        if (rez) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }
}