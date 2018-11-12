/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sklep;

/**
 *
 * @author jzajac
 */
public class Sklep
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        user Adam = new user();
        System.out.println(Adam.getLogin());
    }
    
}

class user
{
    private int id;
    private String login;
    private String password;
    
    int getId(){return this.id;}
    String getLogin(){return this.login;}
    String getPassword(){return this.password;}
}

class Product
{
    private int id;
    private String productName;
    private float price;
    private float weight;
    private String color;
    private int productCount;
    
    int getId(){return this.id;}
    String getProductName(){return this.productName;}
    float getPrice(){return this.price;}
    float getWeight(){return this.weight;}
    String getColor(){return this.color;}
    int getProductCount(){return this.productCount;}
    
    void setPrice(float price){this.price = price;}
    void setProductCount(int productCount){this.productCount = productCount;}
}

class Boots extends Product
{
    private int size;
    private boolean isNaturalLeather;
    
    int getSize(){return this.size;}
    boolean getIsNaturalLeather(){return this.isNaturalLeather;}
}

class Cloth extends Product
{
    private String size;
    private String material;
    
    String getSize(){return this.size;}
    String getMaterial(){return this.material;}
}