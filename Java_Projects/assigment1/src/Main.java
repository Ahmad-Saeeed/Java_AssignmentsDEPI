import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        // 1. declaring Variables
        String studentName;
        int subject1, subject2, subject3, total;
        float avg;
        char grade = '0';

        // 2. creating Scanner object
        Scanner inputData = new Scanner(System.in);

        // 3. Accepting data from user
        System.out.printf("Enter Student Name: ");
        studentName = inputData.nextLine();

        System.out.printf("Enter marks for Subject 1: ");
        subject1 = inputData.nextInt();

        System.out.printf("Enter marks for Subject 2: ");
        subject2 = inputData.nextInt();

        System.out.printf("Enter marks for Subject 3: ");
        subject3 = inputData.nextInt();

        System.out.println("\n");   // just for adjusting the output
        // 4. Calculating Criteria data
        total = subject1 + subject2 + subject3;
        avg = total / 3;

        // 5. Acting on the data
        if ((avg >= 90) && (avg <= 100)) {
            grade = 'A';
        } else if ((avg >= 80) && (avg <= 89)) {
            grade = 'B';
        } else if ((avg >= 70) && (avg <= 79)) {
            grade = 'C';
        } else if ((avg >= 60) && (avg <= 69)) {
            grade = 'D';
        } else if ((avg < 60)) {
            grade = 'F';
        } else {
            System.out.println("Invalid Data");
        }

        switch (grade) {
            case 'A':
                System.out.println("Student: " + studentName);
                System.out.println("Total marks: " + total);
                System.out.println("Average marks: " + avg);
                System.out.println("Grade: " + grade);
                System.out.println("Message: Excellent Work!");
                break;

            case 'B':
                System.out.println("Student: " + studentName);
                System.out.println("Total marks: " + total);
                System.out.println("Average marks: " + avg);
                System.out.println("Grade: " + grade);
                System.out.println("Message: Great job!");
                break;
            case 'C':
                System.out.println("Student: " + studentName);
                System.out.println("Total marks: " + total);
                System.out.println("Average marks: " + avg);
                System.out.println("Grade: " + grade);
                System.out.println("Message: Good effort!");
                break;
            case 'D':
                System.out.println("Student: " + studentName);
                System.out.println("Total marks: " + total);
                System.out.println("Average marks: " + avg);
                System.out.println("Grade: " + grade);
                System.out.println("Message: You passed, but aim higher.");
                break;
            case 'F':
                System.out.println("Student: " + studentName);
                System.out.println("Total marks: " + total);
                System.out.println("Average marks: " + avg);
                System.out.println("Grade: " + grade);
                System.out.println("Message: You need to improve.");
                break;
            default:
                System.out.println("Invalid Data");
                break;


        }/* this switch case can be optimized by using empty string
          and assign in it the message, then print all the data once
          without any repeating of name, total and avg*/

    }
}
