/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eduplanner;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JButton;

/**
 *
 * @author Tofunmi-PC
 */
public class italicButtons extends JButton {
    
    italicButtons(String text){
        
         setFont(new Font("Times New Roman",Font.ITALIC,24));
        setText("I");
        setBorder(null);
    
    setBackground(new Color(224,224,224));
    
    }
}

    

