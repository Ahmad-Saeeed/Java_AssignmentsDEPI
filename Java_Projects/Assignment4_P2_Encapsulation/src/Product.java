/**********************************************************************
 *
 *              Product class
 *
 ********************************************************************/

public class Product
{
    //1. Attributes
    private String productId;
    private String productName;
    private double price;
    private boolean insStock;

    //2. constructor
    public Product (String productID, String productName, double productPrice, boolean inStock)
    {
        this.productId=productID;
        this.productName=productName;
        this.price=productPrice;
        this.insStock=inStock;
    }

    //3. Methods
        //3.1 Getters
    public String getProductId()
    {
        return productId;
    }
    public String getProductName()
    {
        return productName;
    }
    public double getPrice()
    {
        return price;
    }
    public boolean isInsStock()
    {
        return insStock;
    }

       //3.2 Setters
    public void setPrice(double newPrice)
    {
        System.out.println("product price: "+price);
        if (newPrice>0)
        {
            this.price=newPrice;
            System.out.println("Updated price: "+price);
        }
        else
        {
            System.out.println("Invalid Price!!");
        }
    }

    public void setInStock(boolean staus)
    {
        System.out.println("Previous Stock status: "+insStock);
        this.insStock=staus;
        System.out.println("Updated Stock status: "+insStock);
    }


}
