
import java.util.Scanner;

/************************************************************************************************************
 *       Java program of a secure login System authentication of a User to evaluate grade
 *                                          Using Methods
 ************************************************************************************************************ */

public class LoginMethods
{
    //1. define the Saved user credentials and declare needed variables
    static final String savedEmail = "mohamed@intrast.com", savedPassword = "mohamed123";
    static String userInputEmail = "", userInputPassword = "", userInputName = "";
    static int userLoginAttempts = 0, userInputAge, userInputGrade;
    static int userInputCode;
    static char calculatedLetterGrade = '0';

    static Scanner inptData = new Scanner(System.in);


    public static void main(String[] args)
    {
        System.out.println("Welcome, Please input the following data");
        do
        {
            LogingWindow();

        }while (( authenticating(userInputEmail,userInputPassword)==false) && (userLoginAttempts<=2));


       if ( authenticating(userInputEmail,userInputPassword) == true)
        {
            gettingStudentData();
            calculatedLetterGrade= calculatingStudentGrade(userInputGrade);
            printingCollectedData();

        }
        else
        {
            //Locking Account Message
            System.out.println("***********************\n Account is Locked!\n*************************");
        }

    }

    /*********************************************************************
     *
     *                      Used Methods definitions
     *
     *********************************************************************/

    public static void LogingWindow ()
    {
        do
            {
                System.out.printf("User Name: ");
                userInputEmail = inptData.nextLine();

            } while (validatingInputString() == false);

            System.out.printf("Password: ");
            userInputPassword = inptData.nextLine();

    }

    public static boolean validatingInputString ()
    {
        boolean validString=false;

        if ((userInputEmail.trim().isEmpty()))                      //validating input string is not empty
        {
              System.out.println("Empty field!");
        }

        else if (!userInputEmail.matches("[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.com$"))   // validating that input string is real account@domain
        {
            System.out.println("Invalid User Account!");
        }

        else
        {
            validString=true;
        }

        return validString;
    }

    public static boolean authenticating (String userAcc, String userPassword)
    {
        boolean validLogin = false;

        if (!(userAcc.matches(savedEmail)) || (!userPassword.matches(savedPassword)) )
        {
            if (userLoginAttempts<2)
            {
                System.out.println("Incorrect User name or password!, Please try again.");
                validLogin = false;
            }
            userLoginAttempts++;
        }
        else
        {
            validLogin =true;

        }

        return validLogin;
    }

    public static void gettingStudentData()
    {
        System.out.println("Please Enter the required following data.");
        System.out.printf("Your Code: ");
        userInputCode = inptData.nextInt();
        inptData.nextLine();                    //consume new line
        System.out.printf("Full name: ");
        userInputName = inptData.nextLine();
        System.out.printf("Your Age: ");
        userInputAge=inptData.nextInt();
        inptData.nextLine();
        do
        {
            System.out.printf("Your Grade: ");
            userInputGrade = inptData.nextInt();
            inptData.nextLine();
        }while(validatingGradeRange(userInputGrade)==false);

    }

    public static boolean validatingGradeRange (int userGrade)
    {
    boolean validGrade= false;

    if (! ((userGrade>=0) && (userGrade <=100)) )
    {
        validGrade=false;
        System.out.println("Please enter a Valid grade\nGrade range is 0-100");
    }
    else
    {
        validGrade=true;
    }

    return validGrade;
}

    public static char calculatingStudentGrade (int userInputGrade)
    {
        char  calculatedGrade='0';
        //Calculate the final  grade letter
        if ( (userInputGrade >89 ) && (userInputGrade <=100) )
        {
            calculatedGrade='A';
        }
        else if ( (userInputGrade >79 ) && (userInputGrade <=89))
        {
            calculatedGrade='B';
        }
        else if ( (userInputGrade >69 ) && (userInputGrade <=79))
        {
            calculatedGrade='C';
        }
        else if ( (userInputGrade >59) && (userInputGrade <=69))
        {
            calculatedGrade='D';
        }
        else
        {
            calculatedGrade='F';
        }


        return calculatedGrade;
    }

    public static void  printingCollectedData()
    {
        System.out.println("\nThank you, Here's the result");
        System.out.println("************************************************");
        System.out.println("Full name: "+userInputName);
        System.out.println("Your Code: "+userInputCode);
        System.out.println("Age: "+userInputAge);
        System.out.println("Final Grade: "+calculatedLetterGrade);
        System.out.println("************************************************");
    }

}
