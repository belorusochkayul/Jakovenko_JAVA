import java.util.Scanner;

public class AlfaBank extends Bank implements AddBankName, AtmManufacturer, AddMoney, EnterSumReplenish, EnterSumWithdraw, WithdrawMoney {
    @Override
    public void printAccountInfo() {
        System.out.println("Available money: " + "byn100: " + getByn100() + "  byn50: " + getByn50() + "  byn20: " + getByn20());
    }

    public AlfaBank(int sum, int byn100, int byn50, int byn20) {
        super(sum, byn100, byn50, byn20);
    }

    @Override
    public String getBankName() {
        return "AlfaBank";
    }

    @Override
    public String getAtmManufacturerName() {
        return "Diebold Incorporated";
    }

    @Override
    public int enterReplenishSum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount to replenish your bank account");
        int sum = sc.nextInt();
        return sum;
    }

    @Override
    public int enterWithdrawSum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount to withdraw");
        int sum = sc.nextInt();
        return sum;
    }

    @Override
    public boolean withdrawMoney(int sum) {
        int wholePartDivid100, wholePartDivid50, wholePartDivid20;
        boolean atmAnswer;

        if (getByn100() * 100 + getByn50() * 50 + getByn20() * 20 >= sum && sum % 10 == 0) {
            atmAnswer = true;
            System.out.println(atmAnswer + "  Requested amount of money:  " + sum);
            System.out.println("To issue from the account:");
            wholePartDivid100 = sum / 100;
            System.out.println("Number of 100byn:  " + wholePartDivid100);

            sum = sum - wholePartDivid100 * 100;
            wholePartDivid50 = sum / 50;
            System.out.println("Number of 50byn:  " + wholePartDivid50);

            sum = sum - wholePartDivid50 * 50;
            wholePartDivid20 = sum / 20;
            System.out.println("Number of 20byn:  " + wholePartDivid20);

        } else {
            atmAnswer = false;
            System.out.println(atmAnswer + "  Not enough money enter the correct sum");
        }
        return atmAnswer;
    }

    @Override
    public boolean addMoney(int sum) {
        boolean atmAnswer;
        int wholePartDivid100, wholePartDivid50, wholePartDivid20;
        int quantityByn100, quantityByn50, quantityByn20;

        if (sum % 10 == 0) {
            atmAnswer = true;
            System.out.println(atmAnswer);
            wholePartDivid100 = sum / 100;
            quantityByn100 = getByn100() + wholePartDivid100;
            System.out.println("Number of 100byn:  " + wholePartDivid100);

            sum = sum - wholePartDivid100 * 100;
            wholePartDivid50 = sum / 50;
            quantityByn50 = getByn50() + wholePartDivid50;
            System.out.println("Number of 50byn:  " + wholePartDivid50);

            sum = sum - wholePartDivid50 * 50;
            wholePartDivid20 = sum / 20;
            quantityByn20 = getByn20() + wholePartDivid20;
            System.out.println("Number of 20byn:  " + wholePartDivid20);
            System.out.println("Now on your account:  " + "Number of 100byn: " + quantityByn100 + "  Number of 50byn: " + quantityByn50 + "  Number of 20byn: " + quantityByn20);

        } else {
            atmAnswer = false;
            System.out.println(atmAnswer);
        }
        return atmAnswer;
    }
}
