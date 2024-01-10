public class SavingsAccount implements Bank{
    private double balanceAccount;
    private double durationContract;

    public SavingsAccount(double balanceAccount, double durationContract) {
        this.balanceAccount = balanceAccount;
        this.durationContract = durationContract;
    }

    @Override
    public double calculationRate() {
        if (this.balanceAccount < 10000 & this.durationContract < 1){
            return 5.5;
        }else return 4.5;
    }
}
