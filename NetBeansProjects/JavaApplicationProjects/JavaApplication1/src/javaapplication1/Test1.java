/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;
import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class Test1 
{
    String myText = " This is my text" ;
    public String getMyString()
    {
        
         Scanner scan = new Scanner (System.in);
        
        String name;
        System.out.print("enter your name");
        name = scan.next();
        System.out.print("\n\n" + name + "\n\n");
    
     } 
}
