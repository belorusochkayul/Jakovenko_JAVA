package by.kiparo.dz1;

public class Main {
    public static void main(String[] arg) {
    System.out.println("    задача_№1");  //первое задание
    String str = "строкадляделенияпримернопополам";
    int length = str.length();
    System.out.println("длина строки=" + length);
    int mid = str.length() / 2;
    String[] parts = {str.substring(0, mid),str.substring(mid)}; //заменила split на substring
    System.out.println(parts[0]);
    System.out.println(parts[1]);
    System.out.println("    задача_№2"); //второе задание
    int x = 12476797;
    int last = x % 10;
    if (last == 7) {
    System.out.print("у вас счастливый номер=");
    System.out.println(last);
     }
     else {
     System.out.println("попробуйте еще раз");
     }
     System.out.println("    задача_№3"); // третье задание
     int money = 45683;
     int y = money % 10;
     int z = money % 100;
     if (z >= 11 && z % 100 <= 14) {
     System.out.println(money + " рублей");
     }
     else {
     switch (y) {
     case 0:
     System.out.println(money + " рублей");
     break;
     case 1:
     System.out.println(money + " рубль");
     break;
     case 2: case 3: case 4:                   // сократила case
     System.out.println(money + " рубля");
     break;
     case 5: case 6: case 7: case 8: case 9:
     System.out.println(money + " рублей");
     break;
     default:
     System.out.println(money + " рублей");
     }
     }
     }
     }