import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int subjects, i, marks, total = 0;
        double avg;
        String grade;

        // user se total subjects pooche
        System.out.print("Enter number of subjects: ");
        subjects = sc.nextInt();

        // loop se sabka marks lo aur total banao
        for(i = 1; i <= subjects; i++) {
            while (true) {
                System.out.print("Enter marks for subject " + i + " (0 to 100): ");
                marks = sc.nextInt();

                if (marks >= 0 && marks <= 100) {
                    total = total + marks;
                    break; // valid input mil gaya, loop se niklo
                } else {
                    System.out.println("Invalid marks! Please enter marks between 0 and 100.");
                }
            }
        }

        avg = (double) total / subjects;

        // grade decide kro percentage ke hisab se
        if(avg >= 90) {
            grade = "A+";
        }
        else if(avg >= 80) {
            grade = "A";
        }
        else if(avg >= 70) {
            grade = "B";
        }
        else if(avg >= 60) {
            grade = "C";
        }
        else if(avg >= 50) {
            grade = "D";
        }
        else {
            grade = "F";
        }

        // output dikhaye
        System.out.println("Total Marks: " + total + " out of "+ (subjects * 100));
        System.out.println("Average: " + avg);
        System.out.println("Grade: " + grade);
        
        sc.close();
    }
}