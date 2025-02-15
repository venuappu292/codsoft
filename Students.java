import java.util.Scanner;

public class Students {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking student details
        System.out.print("Enter student's name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        // Declare an array to store the marks for each subject
        double[] marks = new double[numSubjects];
        double totalMarks = 0.0;
        
        // Get the marks for each subject
        System.out.println("Enter marks for each subject:");
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextDouble();
            totalMarks += marks[i];
        }

        // Calculate percentage
        double percentage = (totalMarks / (numSubjects * 100)) * 100;

        // Determine grade based on percentage
        String grade;
        if (percentage >= 90) {
            grade = "O";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Display the results
        System.out.println("\nStudent Name: " + studentName);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close(); // Close the scanner
    }
}
