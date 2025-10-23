package exercise1;

import javax.swing.*;

public class Driver {

    public static void main(String[] args) {
        
        int policy_qty; // Quantity of policies
        String typeOfInsurance;
        double monthly_fees;
        policy_qty = Integer.parseInt(JOptionPane.showInputDialog( "Hom many policies you want: "));
        Insurance[] policies_array = new Insurance[policy_qty];
        JFrame f;

        for (int i = 0; i < policy_qty; ) {

            typeOfInsurance = JOptionPane.showInputDialog(null, "Please select type of insurance \nEnter life or health: ");
            monthly_fees = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter monthly fee: "));

            // Creating list of policies (Life or Health)
            if(typeOfInsurance.equalsIgnoreCase("life")) {
                policies_array[i]=new Life(typeOfInsurance, monthly_fees);
                i++;
            }
            else if(typeOfInsurance.equalsIgnoreCase("health")) {
                policies_array[i] =new Health(typeOfInsurance, monthly_fees);
                i++;
            }
            else {
                JOptionPane.showMessageDialog(null, """
                        invalid insurance type.\s
                        Please try again""");
            }
        }

        // Display policy information
        for (int j = 0; j < policy_qty; j++) {
            policies_array[j].display();
        }


    }
}

