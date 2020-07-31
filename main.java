package by.kiparo.cd;

public class main { //набольшую букву "Main" не заменила, выдает ошибку, наверное, изначально назвала не так файл?
public static void main(String[] arg) {

    System.out.println("    задача_№1");  //первое задание

    String str = "разделитьстроку";
    int length=str.length();
    System.out.print("длина строки=");
    System.out.println(length);
    String[]output = str.split("(?<=ь)",2);
    System.out.println(output[0]);
    System.out.println(output[1]);

    System.out.println("    задача_№2"); //второе задание

    int x = 12476797;
    int last= x%10;
if (last==7) {
    System.out.print("у вас счастливый номер=");
    System.out.println(last);
                             }
else
{
    System.out.println("попробуйте еще раз");
                                              }

    System.out.println("    задача_№3"); // третье задание

    int money=45683;
    int y=money%10;
    int z=money%100;
    if (z>=11&&z%100<=14)
    {
        System.out.println(money+ " рублей");
    }
    else
    {
        switch (y)
        {
            case 0:
                System.out.println(money+ " рублей");
                break;
            case 1:
                System.out.println(money+ " рубль");
                break;
            case 2:
                System.out.println(money+ " рубля");
                break;
            case 3:
                System.out.println(money+ " рубля");
                break;
            case 4:
                System.out.println(money+ " рубля");
                break;
            case 5:
                System.out.println(money+ " рублей");
                break;
            case 6:
                System.out.println(money+ " рублей");
                break;
            case 7:
                System.out.println(money+ " рублей");
                break;
            case 8:
                System.out.println(money+ " рублей");
                break;
            case 9:
                System.out.println(money+ " рублей");
                break;
            default:
                System.out.println(money+ " рублей");
        }
    }

                                                   }

                                                }

