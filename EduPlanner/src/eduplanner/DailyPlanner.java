/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eduplanner;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

public class DailyPlanner extends JFrame {
    JPanel mainPanel= new JPanel();
    schoolTimetableButton mySchoolTT= new schoolTimetableButton();
    JButton notes= new JButton("Notes");
    JButton teacherContacts= new JButton("Staff Contacts");
  
    
    DailyPlanner(){
        setLayout(new GridLayout(2,0));
        
    add(new topPanel());
    
    mySchoolTT.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
    remove(mainPanel);
    setSize(700,325);
    setLayout(new GridLayout(3,0));
    final JPanel centerPanel= new JPanel(new GridLayout(2,0));
    JPanel titlePanel = new JPanel();
    titlePanel.setBackground(Color.WHITE);
    JLabel titleLabel= new JLabel("School Timetable");
    titleLabel.setFont(new Font("calibri",Font.ITALIC,24));
    
    titlePanel.add(titleLabel);
    centerPanel.add(titlePanel);
    JPanel tablePanel = new JPanel(new GridLayout(3,0));
   
    Object[] columnNames= {"Monday","Tuesday","Wednesday","Thursday","Friday"};
    Object[][] myData= {{"F.Math/Lit/Art", "Chem/Gov","Biology/Econs","Biology/Econs","Physics/CRK"},{"Art"}};
    
    JTable table= new JTable(myData, columnNames);
    JTableHeader header= table.getTableHeader();
    header.setBackground(Color.WHITE);
    header.setBorder(javax.swing.BorderFactory.createEmptyBorder());
     tablePanel.add(header,BorderLayout.PAGE_START);
     tablePanel.add(table);
     centerPanel.add(tablePanel);
     
    add(centerPanel);
    final JButton removeButton= new JButton("<Back");
    removeButton.setBorder(null);
    removeButton.setBackground(new Color(223,223,223));
    removeButton.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
    remove(centerPanel);
    remove(removeButton);
    setLayout(new GridLayout(2,0));
    setSize(700,300);
    add(mainPanel);
    
    }});
    add(removeButton);
    
    }});
            
    notes.setBackground(new Color(220,220,220));
    notes.setBorder(null);
    notes.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
    JFrame frame= new Main();
    frame.setSize(500,300);
    frame.setVisible(true);
    
      
    
    
    }
    });
    
    mainPanel.setLayout(new GridLayout(6,0));
    mainPanel.add(new notificationsPanel());
    mainPanel.add(mySchoolTT);
    JButton personalStudyTimetableButton = new JButton("Personal Study Timetable");
    personalStudyTimetableButton.setBackground(new Color(223,223,223));
    personalStudyTimetableButton.setBorder(null);
    mainPanel.add(personalStudyTimetableButton);
    mainPanel.add(notes);
    
    
    
    JButton calcdic= new JButton("Calculator/Dictionary");
    calcdic.setBackground(new Color(223,223,223));
    calcdic.setBorder(null);
    mainPanel.add(calcdic);
    teacherContacts.setBackground(new Color(230,230,230));
    teacherContacts.setBorder(null);
    mainPanel.add(teacherContacts);
    
    add(mainPanel);
    
    
    
    
    
    }
    
    
    
}