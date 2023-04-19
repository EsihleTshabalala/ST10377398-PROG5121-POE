/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;
/**
 *
 * @author lab_services_student
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        Scanner number3 = new Scanner (System.in);
        
    int number1;
    int number2;
    int sum;
    
    System.out.print("Enter a number :");
    number1 = number3.nextInt();
    System.out.print("Enter another number : ");
    number2 = number3.nextInt();
    sum = number1 + number2;
    System.out.print("The sum of the two number is " + sum + sum);
        
    }
    
}
