/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package st10377398_prog5121_poe_part1;

import java.util.Scanner;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lab_services_student
 */
public class ST10377398_PROG5121_POE_Part1Test {
    
    public ST10377398_PROG5121_POE_Part1Test() {
    }

    /**
     * Test of main method, of class ST10377398_PROG5121_POE_Part1.
     */
    @Test
    public void testMain() {
        System.out.println("\t\t\tRegistration");
       Scanner form = new Scanner(System.in);
      
       boolean form1;
       String username = "" ;
       String password = "";
       
       form1 = true ;
       System.out.print("Please enter a username :" + username);
       username = form.next();
       System.out.print("Please insert password :" + password);
       password = form.next();
       
       if(username.length() == 5 && username.contains("_"))
       {
       System.out.println("Username successfully captured");
       }
       else
       { System.out.print("Username is not correctly formatted,\n please ensure "
               + "that your username contains an undescore and \n is no more than "
               + "5 characters in length.");}
        if (password.length() <= 8) {
            System.out.println("Password successfully captured");}
        
          else if (!password.matches(".*[A-Z].*")) {
            
        }
           else if (!password.matches(".*\\d.*")) {
            
        }
           else if (!password.matches(".*[@#$%^&+=].*")) {
            
        }
          
          else {
            
            System.out.println("""
                               Password is not correctly formatted, please ensure that the password contains at least 8 character,
                                a capital letter,
                                a number and special character""");
           
        }
        if(username.length() == 5 && username.contains("_")){
            if(password.length() <= 8)
            {
                if(!password.matches(".*[A-Z].*")){
                    if(!password.matches(".*\\d.*"))
                    {
                        if(!password.matches(".*[@#$%^&+=].*")){}
                    }
                }
            }
        System.out.println("\n\nWelcome " + "it is great to see you again");
        
    }
    }

    /**
     * Test of checkUserName method, of class ST10377398_PROG5121_POE_Part1.
     */
    @Test
    public void testCheckUserName() {
    }

    /**
     * Test of checkPasswordComplexity method, of class ST10377398_PROG5121_POE_Part1.
     */
    @Test
    public void testCheckPasswordComplexity() {
    }
    
}
