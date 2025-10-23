package exercise3;

public class BusinessMortgage extends Mortgage {

    // Constructor sets the interest rate to 1% over the current prime rate
    public BusinessMortgage(int mortgageNumber, String customerName, double mortgageAmount, double interestRate, int term) {
        super(mortgageNumber, customerName, mortgageAmount, interestRate, term);
        this.interestRate = interestRate + 1.0;
        setMortgageAmount(mortgageAmount);
        setTerm(term);
    }

}
