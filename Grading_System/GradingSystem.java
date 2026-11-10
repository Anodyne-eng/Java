import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Get inputs from the user
        System.out.print("Enter exam score: ");
        double examScore = scanner.nextDouble();

        System.out.print("Enter assessment score: ");
        double assessmentScore = scanner.nextDouble();

        System.out.print("Enter total fees paid (out of 100): ");
        double feesPaid = scanner.nextDouble();

        scanner.close();

        // Calculate total grade
        double totalGrade = examScore + assessmentScore;

        // 2. Check individual component passes (Requirement 1 & 5)
        boolean passedExam = examScore >= 25;
        boolean passedAssessment = assessmentScore >= 15;

        System.out.println("\n--- Results Breakdown ---");
        if (passedExam) {
            System.out.println("Exam: PASSED (" + examScore + ")");
        } else {
            System.out.println("Exam: FAILED (" + examScore + ")");
        }

        if (passedAssessment) {
            System.out.println("Assessment: PASSED (" + assessmentScore + ")");
        } else {
            System.out.println("Assessment: FAILED (" + assessmentScore + ")");
        }

        System.out.println("Total Grade: " + totalGrade);

        // 3. Evaluate main requirements and outcomes
        boolean meetsReq1 = passedExam && passedAssessment;
        boolean meetsReq2 = (totalGrade == 39); // Condoned condition
        boolean feesInFull = (feesPaid >= 100);

        System.out.println("\n--- Final Status ---");

        if (meetsReq1 && feesInFull) {
            System.out.println("Status: Issued with a certificate! (Satisfies Req. 1 and paid fees in full).");
        } 
        else if (meetsReq2 && feesInFull) {
            System.out.println("Status: Issued with a certificate! (Student is condoned with 39 and paid fees in full).");
        } 
        else if (!meetsReq1 && !meetsReq2) {
            // Check if failed both components
            if (!passedExam && !passedAssessment) {
                System.out.println("Status: Failed both components. Student is REPEATED.");
            } else {
                System.out.println("Status: FAILED (Did not meet Req. 1 and/or Req. 2).");
            }
        } 
        else {
            System.out.println("Status: FAILED / Incomplete requirements or unpaid fees.");
        }
    }
}