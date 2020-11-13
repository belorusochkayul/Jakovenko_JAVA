import java.util.Scanner;

public class IdeaBank extends Bank implements BankName, AtmManufacturer, EnterSumWithdraw, WithdrawMoney {

    private final static String NameBank = "IdeaBank";
    public IdeaBank(int sum, int byn100, int byn50, int byn20) {
        super(sum, byn100, byn50, byn20);
    }

    @Override
    public void printAccountInfo() {
        System.out.println("Available money: " + "byn100: " + getByn100() + "  byn50: " + getByn50() + "  byn20: " + getByn20());
    }

    @Override
    public String getBankName() {
        return NameBank;
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
    public String getAtmManufacturerName() {
        return "NCR";
    }
}
