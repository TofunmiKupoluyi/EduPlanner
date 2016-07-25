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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.PrintWriter;
import javax.swing.*;
import javax.swing.border.*;
public class Main extends JFrame{
     JButton file = new JButton("File");
    JButton save = new JButton("Save");
    JButton font = new JButton("Font");
    JButton[] buttons;
    JPanel topPanel;
    TextField field = new TextField();
    JPanel fontPanel= new JPanel();
    JComboBox  fontBox= new JComboBox(new String[]{"Select Font ...","Arial","Times New Roman"});
        
  
    Main(){ 
        
        setLayout(new BorderLayout());
        field.setBackground(new Color(223,223,223));
    
        
          save.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
        try{
        File docFile = new File("docFile.txt");
        PrintWriter printer= new PrintWriter(docFile);
        if(docFile.exists()==true){
           String s= field.getText();
           printer.print(s);
           printer.close();
           field.setCaretPosition(15);
           
        }
                
        
        }
        catch(Exception ex){
    
    }
            }  
          });
  
          
          buttons=new JButton[]{file,save,font};
          topPanel= new topPanel(buttons);
        add(new arrangementPanel(), BorderLayout.NORTH);
        add(field);
        
        
        
      
    }
   
    
   
   
  class topPanel extends JPanel{
topPanel(JButton [] buttons){
    setLayout(new FlowLayout(FlowLayout.LEFT));
    setBackground(Color.LIGHT_GRAY);
    for(int i=0; i<buttons.length;i++){
        buttons[i].setBorderPainted(false);
        buttons[i].setBackground(Color.LIGHT_GRAY);
        add(buttons[i]);
    }
}  
    
}
   class arrangementPanel extends JPanel{
arrangementPanel(){
setLayout(new GridLayout(0,1));
add(topPanel);
   
font.addActionListener(new ActionListener(){
        public void actionPerformed (ActionEvent e){
       
            fontBox.setBackground(new Color(224,224,224));
            fontBox.addActionListener(new fontBoxClick());
          fontBox.setBorder(null);
            JButton boldButton= new boldButtons("B");
            boldButton.addActionListener(new boldClick());
            JButton italicButton= new italicButtons("I");
            italicButton.addActionListener(new italicsClick());
          
          
            fontPanel.setLayout(new FlowLayout(FlowLayout.LEFT,13,5));
             
            fontPanel.add(fontBox);
             fontPanel.add(boldButton);
             fontPanel.add(italicButton);
            fontPanel.setBackground(new Color(224,224,224));
          
    add(fontPanel);
    repaint();
    
    }
       });

}


}
 class boldClick implements ActionListener{
     String font= (String) fontBox.getSelectedItem();
 public void actionPerformed(ActionEvent e){
     
 field.setFont(new Font(font, Font.BOLD,20));
 }
 
 }  
 class fontBoxClick implements ActionListener{
 public void actionPerformed(ActionEvent e){
     Object selectedItem= fontBox.getSelectedItem();
     if(selectedItem== "Times New Roman"){
     field.setFont(new Font("timesnewroman", Font.PLAIN,12));
     
     }
 if (selectedItem=="Arial"){
  field.setFont(new Font("arial", Font.PLAIN,12));
 }
 }
 }  
 class italicsClick implements ActionListener{
  String font= (String) fontBox.getSelectedItem();
 public void actionPerformed(ActionEvent e){
     
 field.setFont(new Font(font, Font.ITALIC,20));
 }
 
 }  
 
 }

