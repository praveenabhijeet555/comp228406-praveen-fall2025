package exercise3;

public abstract class Mortgage implements MortgageConstants {
    private final int mortgageNumber;
    private final String customerName;
    public double mortgageAmount;
    public double interestRate;
    public int term;

    // Constructor
    public Mortgage(int mortgageNumber, String customerName, double mortgageAmount, double interestRate, int term) {
        this.mortgageNumber = mortgageNumber;
        this.customerName = customerName;
        this.mortgageAmount = mortgageAmount;
        this.interestRate = interestRate;
        this.term = term;
    }

    // Check max mortgage amount ($300,0000)
    public void setMortgageAmount(double mortgageAmount) {
        if (this.mortgageAmount > MortgageConstants.maxAmount) {
            this.mortgageAmount = MortgageConstants.maxAmount;
        }
        else {
            this.mortgageAmount = mortgageAmount;
        }
    }

    // Set mortgage term not defined in the MortgageConstants interface to short-term
    public void setTerm(int term) {
        if (this.term == MortgageConstants.short_term
                || this.term == MortgageConstants.medium_term
                || this.term == MortgageConstants.long_term) {
            this.term = term;
        }
        else {
            this.term = MortgageConstants.short_term;
        }
    }

    // Display Mortgage information
    public String getMortgageInfo() {
        return "Name of Bank----" + MortgageConstants.bankName
                + "\nMortgage number-" + this.mortgageNumber
                + "\nCustomer name---" + this.customerName
                + "\nMortgage amt----$" + this.mortgageAmount
                + "\nInterest rate---" + interestRate + " %"
                + "\nTerm------------" + this.term + " years";
    }

}
