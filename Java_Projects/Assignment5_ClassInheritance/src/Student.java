/***********************************************************
 *
 *          Student class
 *
 ***********************************************************/

public class Student extends Person
{
    //1. protected attributes to be not directly accessible but inherited at the same time
    protected String studentId;
    protected char   grade;

    //2. parameterized constructor
    public Student (String name, int age,String studentId, char studentGrade)
    {
        //2.1 inheriting same parameterized constructor
        super(name, age);
        //2.2 specific constructor
        this.studentId=studentId;
        this.grade=studentGrade;
    }

    //3. Methods

    //3.1 Setters + the inherited ones
    public void setStudentId (String studentId)
    {
        this.studentId=studentId;
    }

    public void setStudentGrade (char studentGrade)
    {
        this.grade=studentGrade;
    }

    //3.2.1 overridden Action methods
    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("Student ID: "+this.studentId+", Grade "+this.grade);
    }
    @Override
    public void celebratingBirthday()
    {
        super.celebratingBirthday();
        System.out.println(this.name+", with ID: "+this.studentId+", have a grade "+this.grade);
    }
    //3.2.2 specific class method
    public void study()
    {
        System.out.printf("The student: %s with the ID: %s is now studying\n",this.name,this.studentId);
    }




}