import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double number1 = 0;
        double number2 = 0;
        try {
            number1 = inputDoubleNumber();
            number2 = inputDoubleNumber();
        } catch (MyExaptionInputChoice myExaptionInputChoice) {
        }
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

                try {
                    division(number1, number2);
                } catch (MyExaptionDivision myExaptionDivision) {
                    System.out.println(myExaptionDivision.getMessage());
                }
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
                try {
                    squareRoot(number1, number2);
                } catch (MyExceptionRoot myExceptionRoot) {
                    System.out.println(myExceptionRoot.getMessage());
                }
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
        System.out.println("Результат умножения введенных чисел: " + result);
        return result;
    }

    public static double division(double number1, double number2) throws MyExaptionDivision {
        if (number2 == 0) {
            throw new MyExaptionDivision();
        }
        double result = number1 / number2;
        System.out.println("Результат деления введенных чисел: " + result);
        return result;
    }

    public static double subtraction(double number1, double number2) {
        double result = number1 - number2;
        System.out.println("Результат вычитания введенных чисел: " + result);
        return result;
    }

    public static double addition(double number1, double number2) {
        double result = number1 + number2;
        System.out.println("Результат сложения введенных чисел: " + result);
        return result;
    }

    public static void squareRoot(double number1, double number2) throws MyExceptionRoot {
        if (number1 < 0 & number2 < 0) {
            throw new MyExceptionRoot();
        }
        double result1 = Math.sqrt(number1);
        double result2 = Math.sqrt(number2);
        System.out.println("Результат вычисления квадратного корня: " + "для первого числа " + result1 + "  для второго числа " + result2);
    }

    public static double inputDoubleNumber() throws MyExaptionInputChoice {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        double number;
        if (scanner.hasNextDouble()) {
            number = scanner.nextDouble();
        } else {
            System.out.println("Некорректный ввод числа. Попробуйте еще раз: ");
            scanner.nextDouble();
            number = inputDoubleNumber();
            throw new MyExaptionInputChoice();
        }
        return number;
    }
}