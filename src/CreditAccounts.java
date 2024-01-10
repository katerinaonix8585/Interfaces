public class CreditAccounts implements Bank{
    private double summaCredit;
    private double durationCredit;

    public CreditAccounts(double summaCredit, double durationCredit) {
        this.summaCredit = summaCredit;
        this.durationCredit = durationCredit;
    }

    @Override
    public double calculationRate() {
        if (this.summaCredit < 10000 & this.durationCredit < 1){
            return 5.5;
        }else return 4.5;
    }
}
