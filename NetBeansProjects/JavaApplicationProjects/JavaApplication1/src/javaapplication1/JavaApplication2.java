/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package javaapplication1;

/**
 *
 * @author lab_services_student
 */
import java.util.Scanner;
public class JavaApplication2
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
    int number1;
    int number2;
    int sum;
    
    System.out.print("Enter a number :");
    number1 = scan.nextInt();
    System.out.print("Enter another number : ");
    number2 = scan.nextInt();
    sum = number1 + number2;
    System.out.print("The sum of the two number is " + sum);
    
    
    }
    
    
    
}
