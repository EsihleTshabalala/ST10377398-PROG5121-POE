/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;
import java.util.Scanner;
/**
 *
 * @author lab_services_student
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int age  ;
       
  
        
        System.out.println("Please enter your age: " );
        age = scan.nextInt();
       age = age-1;
        System.out.println("Age is: " + age);
        
        if( age < 20){
            age = age - 1;
            System.out.println(" Age is bigger than 30");
            if( age == 40){
                age = age -1;
                
            }
        }
    }
    
}
