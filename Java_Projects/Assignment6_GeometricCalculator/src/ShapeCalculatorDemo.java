
/************************************************************************************************************
 *
 *              Main Application of Geometric Calculator
 *
 * ***********************************************************************************************************/

public class ShapeCalculatorDemo
{
    public static void main(String[] args)
    {
        // just for output readability
        System.out.println("\n------------------ Geometric shape Calculator Demo ------------------");
        System.out.println("------------Calculating Area & Perimeter for various shapes --------------\n");
        /*__________________________________________________________________________________________________*/

        // 1. Creating instance of subclasses
            Shape circleInstance = new Circle(5);
            Shape rectangleInstance = new Rectangle(4,6);

        // 2. Array of the objects
        //Measurable[]arrayOfShapes={circleInstance,rectangleInstance}; // this will not access getName();
        Shape [] arrayOfShapes = {circleInstance,rectangleInstance};



        // 3. Using enhanced for
        for(Shape shapeItem : arrayOfShapes)  // iterate using an item from type Shape through the Shape array that called arrayOfShapes
        {
            System.out.printf(" -> Shape:%s\n",shapeItem.getName());
            System.out.printf("      Area: %.2f\n",shapeItem.getArea()); // printing the number with only 2 digits after .
            System.out.printf("      Perimeter: %.2f\n\n",shapeItem.getPerimeter());
        }

        System.out.println("--------- Specific Shape Details ------------");
        System.out.printf("Shape1 is a %s with radius = %.1f\n",circleInstance.getName(),((Circle) circleInstance).getRadius());// i casted circleInstance to a circle class so it can resolve getRadius
        System.out.printf("Shape2 is a %s with Length = %.1f , Width = %.1f\n",rectangleInstance.getName(),((Rectangle)rectangleInstance).getLength(),((Rectangle)rectangleInstance).getWidth());
        System.out.println("\n--------------  End of Demo -----------------");
    }

}
