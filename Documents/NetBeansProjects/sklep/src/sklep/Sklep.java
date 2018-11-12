/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sklep;

import entity.*;

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
        User Adam = new User(1, "adam", "pass");
        System.out.println(Adam.toString());
    }
    
}
