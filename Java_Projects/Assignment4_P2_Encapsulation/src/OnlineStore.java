/**********************************************************************
 *
 *             Online Store
 *
 ********************************************************************/

import java.util.Scanner;

public class OnlineStore
{
    public static void main(String[] args)
    {
        Product p1= new Product("p123","Back bag",250,true);

        // 1. printing initial details
        System.out.printf("\n_____________Initial Details __________________\n");
        System.out.println("Product Name:"              +p1.getProductName());
        System.out.println("Product ID: "               +p1.getProductId());
        System.out.println("Product Price: "            +p1.getPrice());
        System.out.println("Product Status in Stock: "  +p1.isInsStock());

        //2. Setting price twice
            System.out.printf("\n_____________updating the price after discount __________________\n");
            p1.setPrice(230);
            System.out.printf("\n_____________updating the price with -ve number__________________\n");
            p1.setPrice(-200);

        //3. updating Stock status
        System.out.printf("\n_____________Product Status in stock before and after order __________________\n");
        p1.setInStock(false);







    }
}
