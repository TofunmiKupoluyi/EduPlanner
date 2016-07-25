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
public class notificationsPanel extends JButton{
    String message= new String("Click here to setup your notifications");
    JLabel notificationsLabel= new JLabel(message);
    int x=0;
    int y=18;
    File file = new File("Assignments.txt");
    PrintWriter printer;
    Scanner scanner;
    
         public void paintComponent(Graphics g){
    super.paintComponent(g);
    g.setFont(new Font("calibri",Font.ITALIC, 13));
    g.drawString(message, x, y);
    
    
    }
    
   
    class stringMovement implements ActionListener{
    public void actionPerformed(ActionEvent e){
    x+=30;
    if(x>getWidth()){
    x=-10;
    
    }
    repaint();
    }
    
    }
    notificationsPanel(){
    setBackground(new Color(223,223,223)); 
    Timer timer= new Timer (500, new stringMovement());
    timer.start();
    addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
    JFrame frame = new JFrame();
    frame.setSize(500,300);
    frame.setVisible(true);
    frame.add(new topPanel());
    frame.setLayout(new GridLayout(3,0));
    JButton addButton= new JButton("Add...");
    addButton.setBackground(new Color(230,230,230));
    addButton.setBorder(null);
    

    
    
    
    
    JPanel panel= new JPanel( new GridLayout(2,2,5,5));
    
    JLabel assignmentsDescriptionTitle = new JLabel("Assignment Description: ");
    assignmentsDescriptionTitle.setFont(new Font("calibri",Font.ITALIC,14));
    final JTextField assignmentsDescription= new JTextField();
    assignmentsDescription.setBackground(new Color(223,223,223));
    assignmentsDescription.setBorder(null);
    JLabel dueDateTitle= new JLabel("Due date: ");
    dueDateTitle.setFont(new Font("calibri",Font.ITALIC,14));
    final JTextField dueDate= new JTextField();
    dueDate.setBackground(new Color(223,223,223));
    dueDate.setBorder(null);
  
              panel.add(assignmentsDescriptionTitle);
    panel.add(assignmentsDescription);
    panel.add(dueDateTitle);
    panel.add(dueDate);
    frame.add(panel);
    
    
   
    
        addButton.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
    try{
    printer = new PrintWriter(file);
    scanner= new Scanner(file);
   
    printer.println("Assignments:"+assignmentsDescription.getText()+"-"+dueDate.getText()+"-respectively");
    printer.close();
    message= scanner.next();
    }
    
    catch(Exception ex){
    
    }
    
            
    }
    
    
    });
        frame.add(addButton);
        
       
  
    
  
        
    
    
    }});
            }
}

            
            

