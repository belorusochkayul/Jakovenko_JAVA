import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        AlfaBank alfaBank = new AlfaBank(300, 20, 2, 3);

        printInfo(alfaBank);
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