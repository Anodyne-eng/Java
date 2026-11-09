import java.util.Scanner;
public class EvenOddCounter {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] numbers = new int[5];
    int evenCount = 0;
    int oddCount = 0;

    for (int i=0; i < numbers.length; i++) {
        System.out.println("Enter integer " + (i + 1) + ":" );
        numbers[i] = input.nextInt(); 
   
        if (numbers[i] % 2 == 0) {
           evenCount++;  
        } else {
          oddCount++;
        }

    } 
    
    System.out.println("--- Results ---");
    System.out.println("Even numbers count: " + evenCount);
    System.out.println("Odd numbers count: " + oddCount);
    
    input.close();
  }
}