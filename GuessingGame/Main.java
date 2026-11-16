import java.util.Scanner;
import java.util.Random;

public class Main {
  public static void main (String[] args) {
    Scanner reader = new Scanner(System.in);
    Random rand = new Random();
    
    int secretNumber = rand.nextInt(1, 101);

    System.out.println("Guess the secrete integer (hint: the integer is between 1 and 100 inclusive): ");
    int guess = 0;

    while (guess != secretNumber) {
           guess = reader.nextInt();
       
          if (guess == secretNumber) {
             System.out.println("Boom! You got it.");
             break;
           }

           int diff = Math.abs(guess - secretNumber);
          
          // Proximity  hints from closest to farthest
          if (diff <= 5) {
             System.out.println("You're burning up! Very close. Try again!");          
           } else if (diff <= 15) {
             System.out.println("Warm! Getting close."); 
           } else if (diff <= 30) {
            System.out.println("Chilly! A bit far.");
          } else {
           System.out.println("Freezing! Way off.");
         }
         
        System.out.println(guess < secretNumber ? "Hint: Go higher\n" : "Hint: Go lower\n");

     }

    reader.close();
  }
}