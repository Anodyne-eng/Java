import java.util.Scanner;
public class Main {
   /*The Logic
    Define varaibles
    Use a do-while loop to iterate and process choices
    • Inside the loop, display these options:
    1. 1. Withdraw $100
    2. 2. Deposit $100
    3. 0. Exit & Print Receipt
    • If Option 1: Subtract 100 from balance and increment transactionCount.
    • If Option 2: Add 100 to balance and increment transactionCount.
    • Validation: If the user tries to withdraw but balance is less than 100, print "Insufficient Funds!" and do not increment the                   
    transaction count.
    • Termination: The loop continues as long as userAction != 0. */
  public static void main (String[] args) {
    int userInput;
    double balance = 10000.00;
    int transactionCount = 0;
    Scanner input = new Scanner(System.in);
  
    do { 
       System.out.println("\n---ATM Menu---");
       System.out.println("1. Check Balance");  
       System.out.println("2. Withdraw $100");
       System.out.println("3. Deposit $100");
       System.out.println("0. Exit & Print Receipt");
       System.out.println("Enter your choice: ");
       userInput = input.nextInt();

       if (userInput == 1) {
          System.out.println("You have " + balance + " in your account");
       } else if (userInput == 2) {
           if (balance >= 100) {
              balance -= 100;
              transactionCount++;
              System.out.println("Processing transaction....");
              System.out.println("Witdrawal successful. Current balance: $" + balance);
          } else {
            System.out.println("Processing transaction....");
            System.out.println("Insufficient Funds!");
          }     
       }

       if (userInput == 3) {
          System.out.println("Processing transaction...");
          balance += 100;
          transactionCount++;
          System.out.println("Deposit successful. Current balance: $" + balance);
       }
       
    } while (userInput != 0);

   System.out.println("\n=== Receipt ===");
   System.out.println("Final balance: $" + balance);
   System.out.println("Total Transaction: " + transactionCount);

   input.close();
  }
} 