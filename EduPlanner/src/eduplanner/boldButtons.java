/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eduplanner;


import java.awt.*;
import javax.swing.JButton;

/**
 *
 * @author Tofunmi-PC
 */
public class boldButtons extends JButton {
    String l;
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        
        
        
    }
    boldButtons(String text){
         setFont(new Font("Arial",Font.BOLD,20));
        setText(text);
        setBorder(null);
       
        
    
    setBackground(new Color(224,224,224));
    
    }
}
