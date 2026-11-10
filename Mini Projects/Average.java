import java.util.Scanner;
public class Average {
  public static void main (String[] args) {
    // Creation of Scanner instance
    Scanner input = new Scanner(System.in);
    // Variable declaration
    int[] numbers = new int[5]; // This creates an array to store five integers
    int sum = 0;
    float average;

    // Loop to read the numbers in the array and calculate the sum on the fly
    for (int i=0; i < numbers.length ; i++) {
        System.out.println("Enter interger " + (i + 1) + ":" );
        numbers[i] = input.nextInt();
        sum += numbers[i];
    }
    
    // Computation of the average
    average = (float) sum / numbers.length;
 
    System.out.println("Sum is " + sum);
    System.out.println("Computed average is " + average);

    input.close();
  }
}