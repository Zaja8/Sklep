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
public class Boots
{
    private int size;
    private boolean isNaturalLeather;
    
    int getSize(){return this.size;}
    boolean getIsNaturalLeather(){return this.isNaturalLeather;}    

    public Boots(int size, boolean isNaturalLeather)
    {
        this.size = size;
        this.isNaturalLeather = isNaturalLeather;
    }

    @Override
    public String toString()
    {
        return "Boots{" + "size=" + size + ", isNaturalLeather=" + isNaturalLeather + '}';
    }
}
