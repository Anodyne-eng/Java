import java.util.Scanner;

public class GradingSystem {
  public static void main(String[] args) { 
    Scanner input = new Scanner(System.in);
    int exScore;
    int assess;
    double fees;

    System.out.println("Enter your exam score: ");
    exScore = input.nextInt();
   
    System.out.println("\nEnter assessment score: ");
    assess = input.nextInt();
  
    System.out.println("\nEnter amount of fees paid: ");
    fees = input.nextDouble();

    int totalScore = exScore + assess;

   boolean passReq1 = (exScore >= 25 && assess >= 15);
   boolean passReq2 = (totalScore == 39);
  
   System.out.println("Exam: " + (exScore >= 25 ? "Passed" : "Failed"));
   System.out.println("Assessment: " + (assess >= 15 ? "Passed" : "Failed"));

   if (passReq2 && fees == 100) {
      System.out.println("\nStatus: Issued with a certificate. You are condoned");
        
    } else if(passReq1 && fees == 100) {
     System.out.println("\nStatus: Issued with a certificate. Congratulations!");     
    
    } else if(exScore < 25 && assess < 15) {
      System.out.println("\nStatus: Repeated!");
    
    }  else {
      System.out.println("\nStatus: Failed!");
    }
   
    input.close();

  }
}