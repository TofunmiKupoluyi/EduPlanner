/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eduplanner;

/**
 *
 * @author Tofunmi-PC
 */
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.TableColumn;

public class studyTimetableSetup extends JFrame{
    JLabel intro = new JLabel("Please insert the subjects you offer: ");
JPanel panel = new JPanel(new GridLayout(1,0));
    JTextField subjectsField= new JTextField();
    JButton submit= new JButton("Submit");
    File file= new File("Timetable.txt");
    PrintWriter printer;
    Scanner scanner;
    Object [][] data= new Object[1][5];
   Object[] columnNames= {"Monday","Tuesday","Wednesday","Thursday","Friday"};
  
    studyTimetableSetup(){
         
        setLayout(new GridLayout(2,0));
        intro.setFont(new Font("calibri", Font.ITALIC, 15));
        subjectsField.setBackground(new Color(230,230,230));
        subjectsField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        add(new topPanel());
       
        submit.setBackground(new Color(223,223,223));
        submit.setBorder(null);
        submit.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               JPanel mainPanel= new JPanel();
               mainPanel.setLayout(new GridLayout(2,0));
               JPanel labelPanel= new JPanel();
               try{
                   
               Scanner scanner1= new Scanner(setupPage.setupFile);
               JLabel welcomeLabel= new JLabel( scanner1.next()+ "'s Study Timetable");
               welcomeLabel.setFont(new Font("calibri",Font.ITALIC,20));
               labelPanel.setBackground(Color.white);
               labelPanel.add(welcomeLabel);
               mainPanel.add(labelPanel);
                       }
               catch(Exception ex){
               }
               setLayout(new GridLayout(2,0));
               
    setSize(700,240);
    JPanel panel1 = new JPanel();
    panel1.setLayout(new BorderLayout());
    try{
    printer= new PrintWriter(file);
    scanner = new Scanner(file);
    printer.println(subjectsField.getText());
    printer.close();
      for(int x=0;x<1;x++){
      for(int i=0;i<5;i++){
          
      data[x][i]=scanner.next();
          
      System.out.println(data[x][i]);
      
      }
      
      }
      
      
   
  
    JTable table= new JTable(data,columnNames);
   
    table.setBackground(new Color(223,223,223));
    
    table.setRowHeight(30);
    table.setBorder(null);
   
    panel1.add(table.getTableHeader(), BorderLayout.PAGE_START);
    panel1.add(table,BorderLayout.CENTER);
    mainPanel.add(panel1);
    add(mainPanel);
   
    }
    
    catch(Exception ex){
    
    }
    remove(panel);
    
    
    }});
        panel.add(intro);
        panel.add(subjectsField);
        panel.add(submit);
        
        add(panel);
        
 
   
    
    
    }
    
}
