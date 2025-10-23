package exercise2;

public class FullTimeGameTester extends GameTester{
    private int salary ;

    // Creating constructor by calling super
    public FullTimeGameTester(String testerName, boolean isFullTime) {
        super(testerName, true);
    }

    // Implementing abstract method of super
    @Override
    void calculateSalary() {
        String status = " ";
        if (isFullTime) {
            salary = 3000 ;
            status = "Full time";
        }
        System.out.println("Tester Status: " + status
                + "\nTester name: " + testerName.toUpperCase()
                + "\nTester Salary: $" + salary + " per month");
    }

}

