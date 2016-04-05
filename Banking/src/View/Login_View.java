/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Kango_000
 */

public class Login_View 
{
    private JFrame frame;
   // private JLabel usernameLabel;
   // private JTextField usernameTextField;
   // private JLabel passwordLabel;
   // private JPasswordField passwordTextField;
   // private JButton loginButton;
    
    public static void main (String [] args){
       Login_View frame = new Login_View();
       frame.setVisibel(true);
    } 
    
    public Login_View(){
        makeFrame();
    }
    
    private void makeFrame(){
        frame = new JFrame("Log in");
        Container contentPane = frame.getContentPane();
        frame.setVisible(true);
    }

    private void setVisibel(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
                  
    
}

