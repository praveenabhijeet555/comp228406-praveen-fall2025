package exercise3;
//Student Name: Praveen Tripathi
//Student ID: 819983180

public class OverloadMethod {

    public static int product(int a, int b) {
        return a * b;
    }

    public static int product(int a, int b, int c) {
        return a * b * c;
    }

    public static int product(int a, int b, int c, int d) {
        return a * b * c * d;
    }

    public static void main(String[] args) {

        System.out.println("First overload method: " + OverloadMethod.product(2,3));

        System.out.println("Second overload method: " + OverloadMethod.product(2, 3, 4));

        System.out.println("Third overload method: " + OverloadMethod.product(2, 3,4, 5));
    }
}

