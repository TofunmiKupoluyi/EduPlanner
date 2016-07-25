/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eduplanner;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Tofunmi-PC
 */
public class setupButton extends JButton{
    JFrame setupFrame = new setupPage();
    
    setupButton(){
    setBackground(new Color(223,223,223));
    setText("Setup");
    setBorder(null);
    addActionListener(new setupAction());
    }
    
    class setupAction implements ActionListener {
        public void actionPerformed(ActionEvent e){
            try{
        setupFrame.setSize(500,275);
        setupFrame.setVisible(true);
        add(setupFrame);
            }
            catch(Exception ex){ System.out.println("Setup Window has been opened");
            }
        }
    
    
    
    }
}
