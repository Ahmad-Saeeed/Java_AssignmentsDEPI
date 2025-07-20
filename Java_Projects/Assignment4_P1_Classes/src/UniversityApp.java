/*****************************************************
 *
 *              UniversityApp class
 *
 ******************************************************/

import java.util.Scanner;

 class UniversityApp
{
    public static void main (String[] args)
    {
        //1. Creating 2 students using constructor
        Student student1 = new Student("Ahmed",1998,"Engineering");
        Student student2 = new Student("Elliot",404,"Computer Science");

        //2. Displaying their info.
        student1.displayStudentInfo();
        student2.displayStudentInfo();

        //3. updating Gpa
        student1.updateGpa(3.8);

    }
}
