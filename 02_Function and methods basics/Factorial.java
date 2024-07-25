import java.util.Scanner;

public class Factorial {

    // Method to calculate the factorial of a number
    public static void Fact(int num) {
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        }
        
        int fact = 1;
        // Loop to multiply all integers from num down to 1
        for (int i = num; i >= 1; i--) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + num + " is " + fact);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        if (sc.hasNextInt()) {
            int num = sc.nextInt();
            Fact(num);
        } else {
            System.out.println("Invalid input. Please enter an integer.");
        }
    }
}
