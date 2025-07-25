/***********************************************************
 *
 *          Person Class (Grand/super class)
 *
 ***********************************************************/

public class Person
{
    //1. protbected attributes to be not directly accessible but inherited at the same time
    protected String name;
    protected int age;

    //2. parameterized constructor
    public Person (String name, int age)
    {
        this.name=name;
        this.age=age;
    }

    //3. Methods

    //3.1 Setters
    public void setName(String name)
    {
        this.name=name;
    }

    public void setAge (int age)
    {
        this.age=age;
    }

    public int getAge()
    {
        return this.age;
    }

    public String getName()
    {
        return this.name;
    }

    //3.2 Action methods
    public void displayInfo()
    {
        System.out.println("Hello, I'm "+this.name+", my age is "+this.age);
    }

    public void celebratingBirthday()
    {
        System.out.println(this.name + " is now, "+this.age+" years old!, Happy birthdaaay! <3.");
    }




}