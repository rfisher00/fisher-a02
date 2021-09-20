import java.lang.Math;

public class BankAccount {
    private double principleAmt;
    private double interestRate;
    private int duration;
    private int numCompounded;

    public BankAccount(double principleAmt, double interestRate, int duration, int numCompounded) {
        if(principleAmt > 0.0)
            this.principleAmt = principleAmt;
        if(interestRate > 0.0)
            this.interestRate = interestRate;
        if(interestRate > 0)
            this.duration = duration;
        if(numCompounded > 0)
            this.numCompounded = numCompounded;
    }

    public double getInvestment(double p, double r, int t, int n) {
        double result = p*Math.pow((r/(n*100)+1), (n*t));
        result = result*100 + 0.5;
        result = (int) result;          //rounding to nearest cent
        return result/100.0;
    }
}
