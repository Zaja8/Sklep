/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author jzajac
 */
public class Product
{
    private int id;
    private String productName;
    private float price;
    private float weight;
    private String color;
    private int productCount;
    
    public int getId(){return this.id;}
    public String getProductName(){return this.productName;}
    public float getPrice(){return this.price;}
    public float getWeight(){return this.weight;}
    public String getColor(){return this.color;}
    public int getProductCount(){return this.productCount;}
    
    public void setPrice(float price){this.price = price;}
    public void setProductCount(int productCount){this.productCount = productCount;}  

    public Product(int id, String productName, float price, float weight, String color, int productCount)
    {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.weight = weight;
        this.color = color;
        this.productCount = productCount;
    }

    @Override
    public String toString()
    {
        return "Product{" + "id=" + id + ", productName=" + productName + ", price=" + price + ", weight=" + weight + ", color=" + color + ", productCount=" + productCount + '}';
    } 
}
