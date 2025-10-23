package exercise1;
// Praveen Tripathi

import javax.swing.*;

public class Health extends Insurance {

    // Calling and passing arguments in super class constructor
    public Health(String insuranceType, double monthlyCost) {
        super(insuranceType, monthlyCost);
    }

    // super class abstract method "setInsuranceCost()"
    @Override
    public double setInsuranceCost()
    {
        double monthlyPremium = super.getMonthlyCost() * 12;
        return monthlyPremium;
    }

    // super class abstract method "displayInfo()"
    @Override
    void display() {
        JOptionPane.showMessageDialog(null, "\n\tInsurance Details:" +
                "\n\tInsurance type:  " +this.getInsuranceType().toLowerCase()+
                "\n\tMonthly Fees: " + super.getMonthlyCost() + "\n\tAnnual Fees:  "
                + setInsuranceCost() );
    }


}

