import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank(300, 10, 5, 20);
        AlfaBank alfaBank = new AlfaBank(bank);
        printInfo(bank);
        printInterfaceAddBankName(alfaBank);
        printAtmManufacturerName(alfaBank);
        if (alfaBank.addMoney(entersum()) != true) {
            System.out.println("Wrong nominal!!! Pleas, enter the correct ammount");
        }
        alfaBank.withdrawMoney(alfaBank.enterWithdrawSum());
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