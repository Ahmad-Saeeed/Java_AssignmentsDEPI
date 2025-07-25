/***********************************************************
 *
 *          Teacher class
 *
 ***********************************************************/

public class Teacher extends Person
{
    //1. protected attributes to be not directly accessible but inherited at the same time
    protected  String teacherId;
    protected  String subject;

    //2. parameterized constructor
    public Teacher (String name, int age,String teacherId, String subject)
    {
        //2.1 inheriting same parameterized constructor
        super(name, age);
        //2.2 specific constructor
        this.teacherId=teacherId;
        this.subject=subject;
    }

    //3. Methods

    //3.1 Setters + the inherited ones
    public void setTeacherId (String teacherId)
    {
        this.teacherId=teacherId;
    }

    public void setTeachingSubject (String subject)
    {
        this.subject = subject;
    }

    //3.2.1 overridden Action methods
    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("Teacher ID: "+this.teacherId+", and teaches "+this.subject);
    }
    @Override
    public void celebratingBirthday()
    {
        super.celebratingBirthday();
        System.out.println("We are celebrating Teacher: "+this.name+ " who has ID: "+this.teacherId+", and teaches "+this.subject);
    }
    //3.2.2 specific class method
    public void teach()
    {
        System.out.println(this.name+" with the ID: "+this.teacherId+" is now Teaching ("+this.subject+").");
    }




}