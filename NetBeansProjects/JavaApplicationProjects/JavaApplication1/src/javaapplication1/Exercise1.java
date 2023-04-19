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
public class Exercise1 {
    public static void main(String[] args)
    { 
        Scanner scan = new Scanner(System.in);
        int number1;
        int number2;
        int product;
        int sum;
        int difference;
       
        
        System.out.print("Enter nuber here please");
        number1= scan.nextInt();
         System.out.print("Enter another nuber here please");
            number2= scan.nextInt();
            product= number1 * number2;
            sum = number1 + number2;
            difference= number1 - number2;
            
       
        
        if(product>=200)
        {
        System.out.print("The sum is" +sum);       
        }
        if(product<200)
        {    
        System.out.print("The difference is" + difference );
        }
        
        
    }
    
    
}
