import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double number1 = inputDoubleNumber();
        double number2 = inputDoubleNumber();
        System.out.println("Выберите требуемую операцию: 1-умножение ; 2-деление; 3-вычитание; 4-сложение;5-квадратный корень");
        calc(number1, number2);
    }

    public static void calc(double number1, double number2) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        switch (value) {
            case 1: {
                multiplication(number1, number2);
                break;
            }
            case 2: {
                division(number1, number2);
                break;
            }
            case 3: {
                subtraction(number1, number2);
                break;
            }
            case 4: {
                addition(number1, number2);
                break;
            }
            case 5: {
                squareRoot(number1, number2);
                break;
            }
            default: {
                System.out.println("Операция не распознана. Повторите ввод.");
                break;
            }

        }
    }

    public static double multiplication(double number1, double number2) {
        double result = number1 * number2;
        System.out.println("Реультат умножения введенных чисел: " + result);
        return result;
    }

    public static double division(double number1, double number2) {
        double result = number1 / number2;
        System.out.println("Реультат деления введенных чисел: " + result);
        return result;
    }

    public static double subtraction(double number1, double number2) {
        double result = number1 - number2;
        System.out.println("Реультат вычитания введенных чисел: " + result);
        return result;
    }

    public static double addition(double number1, double number2) {
        double result = number1 + number2;
        System.out.println("Реультат сложения введенных чисел: " + result);
        return result;
    }

    public static void squareRoot(double number1, double number2) {
        double result1 = Math.sqrt(number1);
        double result2 = Math.sqrt(number2);
        System.out.println("Реультат вычисления квадратного корня: " + "для первого числа " + result1 + "  для второго числа " + result2);
    }

    public static double inputDoubleNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        double number;
        if (scanner.hasNextDouble()) {
            number = scanner.nextDouble();
        } else {
            System.out.println("Некорректный ввод числа. Попробуйте еще раз: ");
            scanner.nextDouble();
            number = inputDoubleNumber();
        }
        return number;
    }
}