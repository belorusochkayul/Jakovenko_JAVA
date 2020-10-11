public class Main {

    public static void main(String[] args) {
        AlfaBank alfaBank = new AlfaBank(300, 20, 2, 3);

        printInfo(alfaBank);
        printInterfaceAddBankName(alfaBank);
        printAtmManufacturerName(alfaBank);

        alfaBank.withdrawMoney(alfaBank.enterWithdrawSum());
        if (alfaBank.addMoney(alfaBank.enterReplenishSum()) != true) {
            System.out.println("Wrong nominal!!! Pleas, enter the correct ammount");
        }
        alfaBank.addMoney(alfaBank.enterReplenishSum());
    }

    public static void printInterfaceAddBankName(AddBankName addBankName) {
        System.out.println("ваc обслуживает банк: " + addBankName.getBankName());
    }

    public static void printAtmManufacturerName(AtmManufacturer atmManufacturer) {
        System.out.println("производитель банкомата:  " + atmManufacturer.getAtmManufacturerName());
    }

    public static void printInfo(Bank bank) {
        bank.printAccountInfo();
    }
}