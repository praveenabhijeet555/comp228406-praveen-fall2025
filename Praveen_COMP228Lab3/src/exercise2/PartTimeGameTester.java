package exercise2;

public class PartTimeGameTester extends GameTester{
    private int salary;
    private int hours;

    // Creating constructor by calling super
    public PartTimeGameTester(String testerName, boolean isFullTime) {
        super(testerName, false);
    }

    // Constructor for calculating hourly wages
    public PartTimeGameTester(String testerName, boolean isFullTime, int hours) {
        super(testerName, false);
        this.hours = hours;
    }

    // Implementing abstract method of super
    @Override
    void calculateSalary() {
        String status = " ";
        if (!isFullTime) {
            salary = hours * 20;
            status = "Part time";
        }
        System.out.println("Tester Status: " + status
                + "\nTester name: " + testerName.toUpperCase()
                + "\nTester Salary: $" + salary);
    }

}