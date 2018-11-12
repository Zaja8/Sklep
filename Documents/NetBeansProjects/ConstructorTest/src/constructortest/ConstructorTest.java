/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructortest;

import java.util.*;

/**
 *
 * @author Dell Latitude E7450
 */
public class ConstructorTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Employee[] staff = new Employee[3];
        
        staff[0] = new Employee("Hubert", 40000);
        staff[1] = new Employee(60000);
        staff[2] = new Employee();
        
        for(Employee e:staff)
            System.out.println("name= " + e.getName() + ", id = " + e.getId() + ", sallary = " + e.getSalary());
    }  
}

class Employee
{
    private static int nextId;
    
    private int id;
    private String name = "Employee name"; // inicjalizacja zmiennej skłądowej obiektu
    private double salary;
    
    // Statyczny blok inicjujący
    static
    {
        Random generator = new Random();
        nextId = generator.nextInt(10000);
    }
    
    // Blok inicjujący obiektów
    {
        id = nextId;
        nextId++;
    }
    
    // Trzy konstruktory przeciążone
    public Employee(String n, double s)
    {
        name = n;
        salary = s;
    }
    
    public Employee(double s)
    {
        this("Employee #" + nextId, s);
    }
    
    public Employee()
    {
        
    }
    
    public String getName()
    {
        return name;
    }
    
    public double getSalary()
    {
        return salary;
    }
    
    public int getId()
    {
        return id;
    }
}