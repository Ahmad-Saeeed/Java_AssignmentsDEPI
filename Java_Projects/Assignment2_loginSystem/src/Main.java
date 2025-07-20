import java.util.Scanner;

/************************************************************************************************************
*       Java program of a secure login System authentication of a User to evaluate grade
************************************************************************************************************ */


public class Main
{
    public static void main(String[] args)
    {
        //1. define the Saved user credentials and declare needed variables
        final String savedEmail= "mohamed@intrast.com", savedPassword="mohamed123";
        String userInputEmail="", userInputPassword="",userInputName="";
        int userLoginAttempts=0,userInputAge, userInputGrade;
        final int userInputCode;
        boolean notValidGrade= true, emptyEmail=false;
        char calculatedLetterGrade='0';

        Scanner inptData = new Scanner(System.in);

        //2. check if it's an authorized User
        System.out.println("Welcome, Please input the following data");
        do
        {
            do
            {
            System.out.printf ("User Name: ");
            userInputEmail= inptData.nextLine();

            if ((userInputEmail.trim().isEmpty()))
            {
                emptyEmail=true;
                System.out.println("Empty field!");
            }
            else
            {
                emptyEmail=false;
            }

            }while(emptyEmail==true);

            System.out.printf("Password: ");
            userInputPassword= inptData.nextLine();
            if (!(userInputPassword.matches(savedPassword)) || !(userInputEmail.matches(savedEmail)))
            {
                if(userLoginAttempts<2) // to make sure it won't print try again in the 3rd attempt
                {
                    System.out.println("Incorrect User name or password!, Please try again.");
                }
                userLoginAttempts ++;
            }
            else
            {
                System.out.println("Welcome, Mohammed");  // it can be adjustable if the name is variable, not const.
                break;
            }

        }while(userLoginAttempts<3);

        if (userLoginAttempts<3)
        {
            //3. Proceed to get data

            System.out.println("Please Enter the required following data.");
            System.out.printf("Your Code: ");
            userInputCode = inptData.nextInt();
            inptData.nextLine();                    //consume new line
            System.out.printf("Full name: ");
            userInputName = inptData.nextLine();
            System.out.printf("Your Age: ");
            userInputAge=inptData.nextInt();
            inptData.nextLine();

            // Validating the input grade if it's within range
            do
            {
                System.out.printf("Your Grade: ");
                userInputGrade = inptData.nextInt();
                inptData.nextLine();
                if (! ((userInputGrade>=0) && (userInputGrade <=100)) )
                {
                    notValidGrade=true;
                    System.out.println("Please enter a Valid grade\nGrade range is 0-100");
                }
                else
                {
                    notValidGrade=false;
                }
            }while (notValidGrade);

            //Calculate the final grade letter
            if ( (userInputGrade >89 ) && (userInputGrade <=100) )
            {
                calculatedLetterGrade='A';
            }
            else if ( (userInputGrade >79 ) && (userInputGrade <=89))
            {
                calculatedLetterGrade='B';
            }
            else if ( (userInputGrade >69 ) && (userInputGrade <=79))
            {
                calculatedLetterGrade='C';
            }
            else if ( (userInputGrade >59) && (userInputGrade <=69))
            {
                calculatedLetterGrade='D';
            }
            else
            {
                calculatedLetterGrade='F';
            }

            //4. Displaying the final result
            System.out.println("\nThank you, Here's the result");
            System.out.println("************************************************");
            System.out.println("Full name: "+userInputName);
            System.out.println("Your Code: "+userInputCode);
            System.out.println("Age: "+userInputAge);
            System.out.println("Final Grade: "+calculatedLetterGrade);
            System.out.println("************************************************");
        }
        else
        {
            System.out.println("***********************\n      Account is Locked!      \n*************************");
        }


    }

}
