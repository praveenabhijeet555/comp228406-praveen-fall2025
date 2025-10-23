package exercise3;

public class PersonalMortgage extends Mortgage{

    // Constructor sets the interest rate to 2% over the current prime rate
    public PersonalMortgage(int mortgageNumber, String customerName, double mortgageAmount, double interestRate, int term) {
        super(mortgageNumber, customerName, mortgageAmount, interestRate, term);
        this.interestRate = interestRate + 2.0;
        setMortgageAmount(mortgageAmount);
        setTerm(term);
    }

}
