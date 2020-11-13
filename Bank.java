public abstract class Bank {
    private int sum;
    private int byn100;
    private int byn50;
    private int byn20;

    public abstract void printAccountInfo();

    public Bank(int sum, int byn100, int byn50, int byn20) {
        this.sum = sum;
        this.byn100 = byn100;
        this.byn50 = byn50;
        this.byn20 = byn20;
    }

    public int getSum() {
        return sum;
    }

    public int getByn100() {
        return byn100;
    }

    public int getByn50() {
        return byn50;
    }

    public int getByn20() {
        return byn20;
    }
}