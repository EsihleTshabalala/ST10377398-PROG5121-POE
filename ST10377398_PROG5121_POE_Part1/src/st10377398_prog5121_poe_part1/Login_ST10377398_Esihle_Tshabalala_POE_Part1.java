/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package st10377398_prog5121_poe_part1;

/**
 *
 * @author lab_services_student
 */
public class Login_ST10377398_Esihle_Tshabalala_POE_Part1 {
     public boolean checkUserName(String username) {
         boolean validUsername = checkUserName("myusername");
         
         if ( username.length() == 5 && username.contains("_"))
         {
        return false;
    }
         
    
    return true;

     
     }
    public boolean checkPasswordComplexity(String password)
    {
        boolean vaildPassword = checkPasswordComplexity("mypassword");
        if(password.length() <= 8)
            {
                if(!password.matches(".*[A-Z].*")){
                    if(!password.matches(".*\\d.*"))
                    {
                        if(!password.matches(".*[@#$%^&+=].*")){}
                    }
                }}
        return false;
        
    }
    public boolean registerUser(String username, String password) {
        if (!checkUsername(username) || !checkPasswordComplexity(password)) {
            return false;
        }
        // Store user credentials
        userCredentials.put(username, password);
        return true;
    }

    private boolean checkUsername(String username) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static class userCredentials {

        private static void put(String username, String password) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public userCredentials() {
        }
    }
    
}
