/*************************************************************************************************************
 *
 *                   Shape Abstract class
 *
 * ************************************************************************************************************/

// An abstract class that implements Measurable interface
public abstract class Shape implements Measurable
{
    // 1. Class attributes
    protected String name;

    // 2. Class parameterized constructor
    public Shape (String name)
    {
        this.name=name;
    }

    // 3. abstracted methods that MUST be implemented from Measurable interface or declare it abstracted
    @Override
    public abstract double getArea();

    @Override
    public abstract double getPerimeter();

    // 4. Concrete method for shape class

    public String getName()
    {
        return this.name;
    }


}
