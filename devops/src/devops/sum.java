package devops;
import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Read the number of elements from the user
	        System.out.print("Enter the number of elements: ");
	        int n = scanner.nextInt();

	        // Read the numbers from the user and calculate the sum
	        int sum = 0;
	        for (int i = 0; i < n; i++) {
	            System.out.print("Enter number " + (i + 1) + ": ");
	            int number = scanner.nextInt();
	            sum += number;
	        }

	        // Display the sum
	        System.out.println("Sum of the numbers: " + sum);

	        // Close the scanner
	        scanner.close();
	  }
}
