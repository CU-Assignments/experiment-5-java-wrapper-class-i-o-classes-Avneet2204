import java.util.*;

public class SumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter some numbers (separated by spaces):");
        String input = scanner.nextLine(); // Read the whole input line

        String[] numbers = input.split(" ");
        
        int sum = 0; 

        
        for (String num : numbers) {
            sum += Integer.parseInt(num);
        }

      
        System.out.println("Total Sum: " + sum);

        scanner.close(); // Close the scanner
    }
}
