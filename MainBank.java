package by.kiparo.bank;

public class MainBank {

    public static void main(String[] args) {
        Atm atm = new Atm(20, 3, 7);
        Atm.printAtmCash();
        Atm.addMoney(Atm.entersum());        //пополнение
        Atm.withdrawMoney(Atm.entersum());   //выдача
    }
}
