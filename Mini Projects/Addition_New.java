import java.util.Scanner;
public class Addition_New {
  public static void main(String[] args) {
    //create a scanner to obtain inputs from the command window
 
    Scanner input = new Scanner(System.in);
    int num1,num2,num3,num4,num5;
    int sum;
    float average;
    System.out.println("Please enter the first integer");
    num1 = input.nextInt(); // use the nextInt() method of the input object to obtain an integer from the user 

    System.out.println("Enter the second number"); 
    num2 = input.nextInt();

    System.out.println("Enter the third number"); 
    num3 = input.nextInt();
    
    System.out.println("Enter the fourth number"); 
    num4 = input.nextInt();

    System.out.println("Enter the fifth number"); 
    num5 = input.nextInt();

    sum = num1 + num2 + num3 + num4 + num5;
    average = sum / 5.0f;
    System.out.println("The average of the numbers is " + average);
  }

}