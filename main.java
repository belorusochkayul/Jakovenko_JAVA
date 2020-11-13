import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select the ATM for further actions: ");
        System.out.println("1: AlfaBank (full functionality), 2:IdeaBank (withdrawal only),  3: TechnoBank (only replenishment)");
        int bankname = sc.nextInt();

        switch (bankname) {
            case 1:
                Bank bank1 = new AlfaBank(300, 10, 20, 5);
                AtmManufacturer atmManufacturer1 = new AlfaBank(300, 10, 20, 5);
                AddMoney addMoney1 = new AlfaBank(300, 10, 20, 5);
                WithdrawMoney withdrawMoney1 = new AlfaBank(300, 10, 20, 5);
                EnterSumWithdraw enterSumWithdraw1 = new AlfaBank(300, 10, 20, 5);
                BankName bankName1 = new AlfaBank(300, 10, 20, 5);

                printInfo(bank1);
                printAtmManufacturerName(atmManufacturer1);
                printInterfaceAddBankName(bankName1);

                if (addMoney1.addMoney(entersum()) != true) {
                    System.out.println("Wrong nominal!!! Pleas, enter the correct ammount");
                }
                withdrawMoney1.withdrawMoney(enterSumWithdraw1.enterWithdrawSum());
                break;

            case 2:
                Bank bank2 = new IdeaBank(300, 10, 20, 5);
                AtmManufacturer atmManufacturer2 = new IdeaBank(300, 10, 20, 5);
                WithdrawMoney withdrawMoney2 = new IdeaBank(300, 10, 20, 5);
                EnterSumWithdraw enterSumWithdraw2 = new IdeaBank(300, 10, 20, 5);
                BankName bankName2 = new IdeaBank(300, 10, 20, 5);

                printInfo(bank2);
                printAtmManufacturerName(atmManufacturer2);
                printInterfaceAddBankName(bankName2);
                withdrawMoney2.withdrawMoney(enterSumWithdraw2.enterWithdrawSum());
                break;

            case 3:
                Bank bank3 = new TechnoBank(300, 10, 20, 5);
                AtmManufacturer atmManufacturer3 = new TechnoBank(300, 10, 20, 5);
                AddMoney addMoney3 = new TechnoBank(300, 10, 20, 5);
                BankName bankName3 = new TechnoBank(300, 10, 20, 5);

                printInfo(bank3);
                printAtmManufacturerName(atmManufacturer3);
                printInterfaceAddBankName(bankName3);

                if (addMoney3.addMoney(entersum()) != true) {
                    System.out.println("Wrong nominal!!! Pleas, enter the correct ammount");
                }
                break;

            default:
                System.out.println("enter the correct number");
        }
    }

    public static void printInterfaceAddBankName(BankName addBankName) {
        System.out.println("ваc обслуживает банк: " + addBankName.getBankName());
    }

    public static void printAtmManufacturerName(AtmManufacturer atmManufacturer) {
        System.out.println("производитель банкомата:  " + atmManufacturer.getAtmManufacturerName());
    }

    public static void printInfo(Bank bank) {
        bank.printAccountInfo();
    }

    public static int entersum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount to replenish your bank account");
        int sum = sc.nextInt();
        return sum;
    }
}