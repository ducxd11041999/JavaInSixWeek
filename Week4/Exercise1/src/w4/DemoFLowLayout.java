package w4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DemoFLowLayout {
   private JFrame mainFrame;
   private JLabel statusLabel;
   private JPanel controlPanel;
   public DemoFLowLayout(){
      prepareGUI();
   }

   public static void main(String[] args){
	   DemoFLowLayout swingLayoutDemo = new DemoFLowLayout();  
      swingLayoutDemo.showFlowLayoutDemo();       
   }
      
   private void prepareGUI(){
      mainFrame = new JFrame("Vi du Java Swing");
      mainFrame.setSize(600,200);
      mainFrame.setLayout(new GridLayout(2, 1));

      new JLabel("",JLabel.CENTER );
      statusLabel = new JLabel("",JLabel.CENTER);        

      statusLabel.setSize(350,100);
      mainFrame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      });    
      controlPanel = new JPanel();
      controlPanel.setLayout(new FlowLayout());

  
      mainFrame.add(controlPanel);
      mainFrame.add(statusLabel);
      mainFrame.setVisible(true);  
   }

   private void showFlowLayoutDemo(){
          
      JPanel panel = new JPanel();
      //panel.setBackground(Color.darkGray);
      panel.setSize(300,50);
      FlowLayout layout = new FlowLayout();
      //layout.setHgap(10);              
      //layout.setVgap(10);
      panel.setLayout(layout);        
      panel.add(new JButton("Button1"));
      panel.add(new JButton("Button2"));       
      panel.add(new JButton("Button3"));
    
      JPanel panel1 = new JPanel();
      //panel1.setBackground(Color.red);
      panel1.setBounds(350, 0, 300, 80);
      panel1.setSize(300,60);
     // panel1.setLayout(layout);        
      panel1.add(new JButton("Button4"));
      panel1.add(new JButton("Button5"));       
      panel1.add(new JButton("Button6"));
      controlPanel.add(panel);
      controlPanel.add(panel1);
      mainFrame.setVisible(true);  
   }
}