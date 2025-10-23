package exercise2;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;  // To get valid status input

        String inputPrompt = "Please enter status of tester\nIs tester full-time? \n'y' for yes or 'n' for no: ";

        while (!validInput) {
            System.out.println(inputPrompt);
            String status_of_emp = scanner.nextLine();

            // Check if entered valid entry
            if (!status_of_emp.equalsIgnoreCase("y") && !status_of_emp.equalsIgnoreCase("n")) {
                System.out.println("Wrong input. Try again");
            }

            else {
                System.out.println("Please enter your name: ");
                String name = scanner.nextLine();

                // For full-time employee
                if (status_of_emp.equalsIgnoreCase("y")) {
                    FullTimeGameTester fullTime = new FullTimeGameTester(name, true);
                    fullTime.calculateSalary();
                    validInput = true;
                }

                // For part-time employee
                else if (status_of_emp.equalsIgnoreCase("n")) {
                    System.out.println("Please enter number of hours worked: ");
                    String hours_input = scanner.nextLine();
                    int hours = Integer.parseInt(hours_input);
                    PartTimeGameTester partTime = new PartTimeGameTester(name, false, hours);
                    partTime.calculateSalary();
                    validInput = true;
                }
            }

        }
    }
}

