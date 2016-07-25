/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eduplanner;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Tofunmi-PC
 */
 public class topPanel extends JPanel{
         ImageIcon topImage = new ImageIcon("logo.gif");
    JLabel topImageLabel = new JLabel(topImage);
        topPanel(){
      setBackground(Color.WHITE);
       
    add(topImageLabel);
     }
 }

