
// Rectangle subclass that inherits from shape
public class Rectangle extends Shape
{
    // 1. Attributes
    private double length;
    private double width;

    // 2. Parameterized constructor
    public Rectangle (double length, double width)
    {
        super ("Rectangle");
        this.length=length;
        this.width=width;
    }

    // 3. Implementing the abstracted methods
    @Override
    public double getArea()
    {
        double recArea=0.0;
        recArea= this.length * this.width;
        return recArea;
    }
    public double getLength()
    {
        return this.length;
    }
    public double getWidth()
    {
        return this.width;
    }
    @Override
    public double getPerimeter()
    {
        double recPerimeter=0.0;
        recPerimeter= (this.length + this.width ) * 2;
        return recPerimeter;
    }
}
