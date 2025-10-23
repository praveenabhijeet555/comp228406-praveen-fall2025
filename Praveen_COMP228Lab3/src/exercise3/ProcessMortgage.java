package exercise3;
// Praveen Tripathi

import javax.swing.*;

public class ProcessMortgage {
    public static void main(String[] args) {

        int num_of_mortgages = 3;
        String mortgageTypeInput ="Mortgage type. \nEnter 'b' for business mortgage or\nEnter 'b' for personal mortgage\nEnter type: ";
        Mortgage[] mortgageArray = new Mortgage[num_of_mortgages];  //Store the created Mortgage objects in the array
        String[] mortgageTypeArray = new String[num_of_mortgages];  //Store the created type of Mortgages in the array
        String[] mortgageSerial = {"st", "nd", "rd"};

        // User input for all relevant information
        for (int i = 0; i < num_of_mortgages; ) {
            double primeRate = Double.parseDouble(JOptionPane.showInputDialog(null, (i+1) + mortgageSerial[i] +"-Mortgage " +
                    "\nEnter current prime rate"));
            String mortgageType = JOptionPane.showInputDialog(null, mortgageTypeInput);

            // Check valid mortgage type input
            if (!mortgageType.equalsIgnoreCase("b") && !mortgageType.equalsIgnoreCase("p")) {
                JOptionPane.showMessageDialog(null, "Invalid mortgage type");
                continue;
            }

            // User input for all relevant information for the mortgage
            int mortgageNum = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter mortgage number"));
            String customerName = JOptionPane.showInputDialog(null, "Enter customer name");
            double mortgageAmt = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter mortgage amount"));
            int termDuration = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter mortgage term"));

            // Inserting mortgage data
            if (mortgageType.equalsIgnoreCase("b")) {
                mortgageArray[i] = new BusinessMortgage(mortgageNum, customerName, mortgageAmt, primeRate, termDuration);
                mortgageTypeArray[i] = "Mortgage Type: Business";
            }
            else if (mortgageType.equalsIgnoreCase("p")) {
                mortgageArray[i] = new PersonalMortgage(mortgageNum, customerName, mortgageAmt, primeRate, termDuration);
                mortgageTypeArray[i] = "Mortgage Type: Personal";
            }
            i++;
        }

        // Display all mortgages
        for (int i = 0; i < num_of_mortgages; i++) {
            String msg = (i+1) + mortgageSerial[i] +"-Mortgage\n" + mortgageTypeArray[i] + "\n\n" + mortgageArray[i].getMortgageInfo();
            JOptionPane.showMessageDialog(null, msg);
        }

    }
}
