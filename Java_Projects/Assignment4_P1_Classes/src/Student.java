/******************************************************************
 *
 *                           Student Class
 *
 ******************************************************************/
public class Student
{
    //Attributes
    String name;
    int   id;
    String major;
    double gpa;

    //Default constructor
    public Student()
    {
        this.gpa=0.0;
    }
    //parametrized constructor
    public Student (String name, int studentId, String major)//doesnt need gpa as a parameter as per requirements, it only initiates that 3 parameters.
    {
        this.name= name;
        this.id=studentId;
        this.major=major;
        this.gpa=0.0;
    }

    //Methods
    /*No need to use this.anything  in the print function*/
    public void displayStudentInfo()
    {
        System.out.println("Student Name: "+name+"\nStudent ID: "+id+"\nStudent Major: "+major+"\nStudent default GPA: "+gpa);
        System.out.printf("___________________________________________________\n");
    }

    public void updateGpa(double newGpa)
    {
        System.out.println("Current GPA: "+gpa);
        this.gpa=newGpa;
        System.out.println("Updated GPA: "+gpa);
    }

}
