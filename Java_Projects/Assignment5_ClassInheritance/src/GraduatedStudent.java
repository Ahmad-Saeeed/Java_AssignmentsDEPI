/***********************************************************
 *
 *          GraduatedStudent class
 *
 ***********************************************************/

public class GraduatedStudent extends Student
{
    //1. protected attributes to be not directly accessible but inherited at the same time
    protected  int graduationYear ;

    //2. parameterized constructor
    public GraduatedStudent(String name, int age, String studentId, char grade, int graduationYear)
    {
        super(name,age,studentId,grade);
        this.graduationYear= graduationYear;
    }

    //3. Methods

    //3.1 Setters + the inherited ones
    public void setGraduationYear(int graduationYear)
    {
        this.graduationYear=graduationYear;
    }

    //3.2.1 overridden Action methods

    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.printf ("%s is a graduate student had ID: %s with grade: %c\n",this.name,this.studentId,this.grade);
    }

    //3.2.2 specific class method

    public void declareGraduationYear()
    {
        System.out.printf ("%s is the graduated Student %s, who graduated in %d with age of %d\n",this.studentId,this.name,this.graduationYear,this.age);
    }


}