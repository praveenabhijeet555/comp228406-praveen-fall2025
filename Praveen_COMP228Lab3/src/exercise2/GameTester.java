package exercise2;

public abstract class GameTester {

    protected String testerName;
    protected Boolean isFullTime;


    // Abstract class constructor to pass arguments
    public GameTester(String testerName, boolean isFullTime) {
        this.testerName = testerName;
        this.isFullTime = isFullTime;
    }

    // Abstract method to determine the salary
    abstract void calculateSalary();
}
