/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mp3;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Sandro
 */
public class UserAccount {

    // Here I create some variables that will be used in some steps
    public static String userName;
    public static String password;
    public static String email;
    public static int sentinela = 0;
    
    void verifyUserName(String username) {
        
        // this will verify the fields for username
        if (username.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter your username.");
        }
        else {
            // if everything is ok, keep going...
            sentinela = 1;
            UserAccount.userName = username;
        }
    }
    
    void verifyPassword(String password) {
       
        // Here I verify the password using regular expression (I love Internet!)
       String input = password;
       Pattern p = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})");
       Matcher m = p.matcher(input);
        
            if (m.find()) {
                // If everything is Ok, keep going...
                UserAccount.password = password;
                sentinela = 3;
                }
            else {
                // if something is wrong, let's try one more time
                if (sentinela == 1) {
                JOptionPane.showMessageDialog(null, "Please enter a valid password that has\n"
                                                + "at least one capital letter, one number, \n"
                                                + "one special character, and must have \n"
                                                + "minimun six characters total.");
                } 
            }
      }
    
    void verifyEmail(String email) {
        
        // Here we verify the input for e-mail (again, I love Internet :)
        String input = email;
        // The next pattern will verify if the user is entering a website instead of an e-mail
        Pattern p = Pattern.compile("^www\\.");
        Matcher m = p.matcher(input);
            if (m.find()) {
                JOptionPane.showMessageDialog(null, "E-mail is not correct, don't start with 'www.'");
            }
        else {
                // Here we verify the for the right e-mail address
                p = Pattern.compile("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
                m = p.matcher(input);
                if (m.find()){
                // if the e-mail is correct, keep going...
                UserAccount.email = email;
                sentinela = 5;
            }
        else {
                // if the e-mail is not correct, keep trying...
                JOptionPane.showMessageDialog(null, "E-mail is not correct, please try again.");
                sentinela = 4;
        }
    }
  }
}
