import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Atm atm = new Atm(20, 3, 7);
        System.out.println("Available money: " + "byn100: " + atm.getByn100() + "  byn50: " + atm.getByn50() + "  byn20: " + atm.getByn20());

        if (atm.addMoney(entersumReplenish()) != true) {
            System.out.println("Wrong nominal!!! Pleas, enter the correct ammount");
        }
            atm.withdrawMoney(entersumWithdraw());
    }

    public static int entersumReplenish() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount to replenish your bank account");
        int sum = sc.nextInt();
        return sum;
    }

    public static int entersumWithdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount to withdraw");
        int sum = sc.nextInt();
        return sum;
    }
}
