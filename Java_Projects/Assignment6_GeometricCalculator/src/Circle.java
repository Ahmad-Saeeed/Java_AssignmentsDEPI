

// Circle subclass that inherits from shape
public class Circle extends Shape
{
    // 1. Attributes
    private double radius;

    // 2. Parameterized constructor
    public Circle(double radius)
    {
        super("circle");
        this.radius=radius;     // initializing radius
    }

    public double getRadius()
    {
        return this.radius;
    }

    // 3. implementing abstracted methods
    @Override
    public double getArea()
    {
        double circleArea =0.0;
        circleArea=(Math.PI * this.radius *this.radius) ;
        return circleArea;
    }

    @Override
    public double getPerimeter()
    {
        double circlePerimeter=0.0;
        circlePerimeter= (2 * Math.PI * this.radius);
        return circlePerimeter;
    }
}
