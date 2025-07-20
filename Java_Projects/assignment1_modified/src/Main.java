import java.util.Scanner;

/*******************************************************************************************************************
*          Java program that calculate the total and average grade of students with a final evaluation
********************************************************************************************************************/

/*
*        V.02   Modification done
*
* 1. adding new String to hold last output message
* 2. instead of repeating the whole output in each switch case, print it only once
* 3. Could change the limits i.e the if conditions range, but it's fine for me
*

*
* */



public class Main
{
    public static void main(String[] args)
    {
        // 1. declaring Variables
        String studentName;
        int subject1, subject2, subject3, total;
        float avg;
        char grade = '0';
        String outputMsg="";

        // 2. creating Scanner object
        Scanner inputData = new Scanner(System.in);

        // 3. Accepting data from user
        do {
            System.out.printf("Enter Student Name: ");
            studentName = inputData.nextLine();

            /**********  this is newly added to validate the user input name & the limited marks range ***********/
            if (!(studentName.matches("[a-zA-z ]+"))) //acceptance range is a-z, A-Z and space (the + means atleast 1 char or more)

            {
                System.out.printf("Invalid name, Please input a valid data\n");
            }
        }while (! (studentName.matches("[a-zA-Z ]+")) );

       do {
           System.out.println("Please input the required following data.\nNote that: marks are out of 100");
           System.out.printf("Enter marks for Subject 1: ");
           subject1 = inputData.nextInt();

           System.out.printf("Enter marks for Subject 2: ");
           subject2 = inputData.nextInt();

           System.out.printf("Enter marks for Subject 3: ");
           subject3 = inputData.nextInt();

          }while( (subject1 >100  || subject2 >100 || subject3 >100 ) || (subject1<0 || subject2 <0|| subject3 <0 ) );

        System.out.printf("\n");   // just for adjusting the output
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
               outputMsg="Excellent Work!";
                break;
            case 'B':
                outputMsg="Great job!";
                break;
            case 'C':
                outputMsg="Good effort!";
                break;
            case 'D':
               outputMsg="You passed, but aim higher.";
                break;
            case 'F':
              outputMsg="You need to improve.";
                break;
            default:
                System.out.println("Invalid Data");
                break;


        }

        // 5. Display the required output
        System.out.println("Student: " + studentName);
        System.out.println("Total marks: " + total);
        System.out.println("Average marks: " + avg);
        System.out.println("Grade: " + grade);
        System.out.println("Message: "+ outputMsg);

    }
}
