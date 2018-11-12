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
public class Cloth
{
    private String size;
    private String material;
    
    String getSize(){return this.size;}
    String getMaterial(){return this.material;}    

    public Cloth(String size, String material)
    {
        this.size = size;
        this.material = material;
    }

    @Override
    public String toString()
    {
        return "Cloth{" + "size=" + size + ", material=" + material + '}';
    }
}
