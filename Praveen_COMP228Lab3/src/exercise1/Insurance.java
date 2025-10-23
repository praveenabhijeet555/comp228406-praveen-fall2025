package exercise1;

public abstract class Insurance {

    private final String insuranceType;   // instance variable of type String to describe the type of insurance
    private final double monthlyCost;     // instance variable of type double to hold the monthly cost

    // get methods for both variables
    public String getInsuranceType()
    {
        return insuranceType;
    }
    public double getMonthlyCost()
    {
        return monthlyCost;
    }

    // Constructor with both variables
       public Insurance(String insuranceType, double monthlyCost)
    {
        this.insuranceType = insuranceType;
        this.monthlyCost = monthlyCost;
    }

    abstract double setInsuranceCost();   // abstract method
    abstract void display();              // abstract method

}
