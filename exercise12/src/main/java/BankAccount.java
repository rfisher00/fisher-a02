public class BankAccount {
//    private double principleAmt;
//    private double interestRate;
//    private int duration;
//
//    public BankAccount(double principleAmt, double interestRate, int duration) {
//        if(principleAmt > 0.0)
//            this.principleAmt = principleAmt;
//        if(interestRate > 0.0)
//            this.interestRate = interestRate;
//        if(interestRate > 0)
//            this.duration = duration;
//    }

    public static double getInvestment(double p, double r, int t) {
        double result = p*(1+ r/100*t);
        result = result*100 + 0.5;
        result = (int) result;          //rounding to nearest cent
        return result/100.0;
    }
}
