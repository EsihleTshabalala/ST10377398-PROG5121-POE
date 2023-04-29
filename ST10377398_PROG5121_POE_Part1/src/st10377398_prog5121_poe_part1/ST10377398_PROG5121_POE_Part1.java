/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package st10377398_prog5121_poe_part1;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author lab_services_student
 */
public class ST10377398_PROG5121_POE_Part1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("\t\t\tRegistration");
       Scanner form = new Scanner(System.in);
      
       boolean form1;
       String username = "" ;
       String password = "";
       
       form1 = true ;
       System.out.print("Please enter a username :\t" + username);
       username = form.next();
       System.out.print("Please insert password :\t" + password);
       password = form.next();
       
       if(username.length() == 5 && username.contains("_"))
       {
       System.out.println("Username successfully captured");
       }
       else
       { System.out.print("Username is not correctly formatted, please ensure "
               + "that your username contains an undescore and is no more than "
               + "5 characters in length.");}
        if (password.length() <= 8) {
            System.out.println(" \n Password successfully captured");}
        
          else if (!password.matches(".*[A-Z].*")) {
            
        }
           else if (!password.matches(".*\\d.*")) {
            
        }
           else if (!password.matches(".*[@#$%^&+=].*")) {
            
        }
          
          else {
            
            System.out.println(" Password is not correctly formatted, "
                    + "please ensure that the password contains at least 8 character, a capital letter "
                    + "a number and special character");
           
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
        System.out.println("\n\nWelcome " + username + " it is great to see you again");
        
    }
        else 
        {System.out.println("\nUsername or password incorrect, please try again");}
    }
    
    
            }
    
    

