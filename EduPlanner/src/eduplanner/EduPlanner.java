/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eduplanner;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Tofunmi-PC
 */
public class EduPlanner {
    
   
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame= new homePage();
        frame.setSize(500,275);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        // TODO code application logic here
    }
}
class homePage extends JFrame {
   
    
   
   
    
    
    
    class centerPanel extends JPanel{
        int x=-10;
        int y=40;
        public void paintComponent(Graphics g){
            
        super.paintComponent(g);
        
        String s="Welcome to Group B's Educational Planner";
        g.setFont(new Font("calibri",Font.ITALIC, 22));
        g.drawString(s, x,y);
        
     
        }
        centerPanel(){
            
            setBackground(Color.WHITE);
         Timer time = new Timer(100, new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                x+=10;
                if(x>=getWidth()){
                x=-300;
                }
                repaint();
            }
       });
         time.start();
         
        
        }


}
    class bottomPanel extends JPanel{
       JFrame frame;
   
    bottomPanel(){
         
    setLayout(new GridLayout(0,2));
    add(new setupButton());
    myPlannerButton button = new myPlannerButton();
   button.addActionListener(  new ActionListener(){
    public void actionPerformed(ActionEvent e){
    frame= new DailyPlanner();
    frame.setSize(700,300);
    frame.setVisible(true);
    frame.setTitle("ePlanner- The Student Diary");
    add(frame);
    
    
    }
    });
    add(button);
    
    
    }
    
    
    
    }
    homePage(){
        JPanel panel= new JPanel(new GridLayout(2,0));
        setLayout(new GridLayout(2,0));
        setTitle("Home");
        
        
       add(new topPanel());
       panel.add(new centerPanel());
    panel.add(new bottomPanel());
    add(panel);
    
    
    }




}
