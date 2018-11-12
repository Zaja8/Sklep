/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import javax.print.DocFlavor;

/**
 *
 * @author jzajac
 */
public class User
{
    private int id;
    private String login;
    private String password;
    
    public int getId(){return this.id;}
    public String getLogin(){return this.login;}
    public String getPassword(){return this.password;}
    
    public User(int id, String login, String password)
    {
        this.id = id;
        this.login = login;
        this.password = password;
    }
    
    @Override
    public String toString()
    {
        return  "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                "}";
    }
}
