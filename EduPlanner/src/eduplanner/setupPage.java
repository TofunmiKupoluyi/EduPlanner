/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eduplanner;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;


/**
 *
 * @author Tofunmi-PC
 */
public class setupPage extends JFrame{
    public static File setupFile= new File("setupFile.txt");
    PrintWriter printer;
    JTextField nameField= new JTextField();
   JTextField schoolField = new JTextField();
   JButton next= new essentialSetupButton();
    JPanel panel= new JPanel();
    JFrame nextFrame= new studyTimetableSetup();
   
    setupPage(){
        panel.setLayout(new GridLayout(2,0));
      setLayout(new GridLayout(2,0));
    add(new topPanel());
    panel.add(new mainPanel());
    panel.add(new bottomPanel());
    add(panel);
    
    }
    
    class mainPanel extends JPanel{
        public Color myLightGray= new Color(215,215,215);
        Font myFont= new Font("calibri",Font.ITALIC,15);
   JLabel fullName= new JLabel("Name: ");
   JLabel schoolName= new JLabel("School: ");
   
   
    
   mainPanel(){
       setBackground(new Color(230,230,230));
       setLayout(new GridLayout(2,3,5,5));
       fullName.setFont(myFont);
       schoolName.setFont(myFont);
       nameField.setText("                                                       ");
      nameField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
       nameField.setBackground(myLightGray);
       schoolField.setText("                                                    ");
       schoolField.setBackground(myLightGray);
       schoolField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
       
       
       add(fullName);
       add(nameField);
       add(schoolName);
       add(schoolField);    
    
    }
   
    
    
    }
    class bottomPanel extends JPanel{
    bottomPanel(){
        setLayout(new GridLayout(0,1));
        next.addActionListener(new nextButtonAction());
    add(next);
    
    }
    
    }
    class nextButtonAction implements ActionListener {
        public void actionPerformed(ActionEvent e){
            
         try {
             printer= new PrintWriter(setupFile);
            printer.println(nameField.getText());
            printer.println(schoolField.getText());
            printer.close();
        } catch (FileNotFoundException ex) {
            
        }
         try{
         nextFrame.setSize(700,250);
         nextFrame.setVisible(true);
         add(nextFrame);
         }
         catch(Exception ex){
         System.out.println("Timetable is being set up");
         
         }
        
        }
    }
}
