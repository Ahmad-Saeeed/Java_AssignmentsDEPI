/***********************************************************
 *
 *          underGradStudet class
 *
 ***********************************************************/

public class UnderGradStudent extends Student
{
    //1. protected attributes to be not directly accessible but inherited at the same time
    protected  String major ;
    protected   int year;

    //2. parameterized constructor
    public UnderGradStudent (String name, int age,String studentId, char grade, String major, int year)
    {
        //2.1 inheriting same parameterized constructor
        super(name, age,studentId,grade);
        //2.2 specific constructor
        this.major=major;
        this.year=year;
    }


    //3. Methods

    //3.1 Setters + the inherited ones
    public void setUnderGradStudentMajor (String major)
    {
        this.major=major;
    }

    public void setUnderGradStudentYear (int year)
    {
        this.year = year;
    }

    //3.2.1 overridden Action methods
    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.printf("Info about:( %s ) is an undergrad student has the major %s in %d\n",this.name,this.major,this.year);
    }

    //3.2.2 specific class method
    public void declaringMajor()
    {
        System.out.printf("%s who has ID: %s selected the major of : %s\n ",this.name,this.studentId,this.major);
    }




}