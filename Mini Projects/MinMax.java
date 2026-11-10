import java.util.Scanner;
public class MinMax {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    int[] numbers = new int[6];
    int sum = 0;
    float average;

    for (int i=0; i < numbers.length ; i++) {
    System.out.println("Enter integer " + (i + 1) + ":");
    numbers[i] = input.nextInt();
    sum += numbers[i];
    }
    
    average = (float) sum / numbers.length;

    int max = numbers[0];
    for (int i=1; i < numbers.length; i++) {
        if (numbers[i] > max) {
           max = numbers[i];
        }
    }
   
    int min = numbers[0];
    for (int i=1; i < numbers.length; i++) {
        if (numbers[i] < min) {
           min = numbers[i];
        }
    }

    System.out.println("Sum: " + sum);
    System.out.println("Computed average " + average);
    System.out.println("The maximum number in the array " + max);
    System.out.println("The minimum number in the array: " + min);

    input.close();
  }

}