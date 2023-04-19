/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package javaapplication1;

import org.junit.Test;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class Test1Test
{
    
    public Test1Test() 
    {
    }

    @Test
    public void testgetmystring()
    {
        String ExpectedString = "This is my text";
        
        Scanner scan = new Scanner (System.in);
        
        String name;
        System.out.print("enter your name");
        name = scan.next();
        System.out.print("\n\n" + name + "\n\n");
    }
    
}
