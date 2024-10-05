public class Account {
    private double diff;

    public void debit(double balance, double withdraw) {
        diff = balance - withdraw;
    }

    public double getDiff() {
        return diff;
    }
}
