package myFame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.BorderFactory;
import javax.swing.border.EtchedBorder;
public class MicroWave_Gui extends JFrame {
	JButton btn[];
	JPanel panel, panel2, panel1, panel3;
	JLabel l1, l2;
	JTextField tf;
	GridBagLayout gb;
	GridBagConstraints gbc;
	String str[]={"Stop","Start","0","1", "2", "3", "4", "5", "6", "7", "8", "9"};
	public MicroWave_Gui(String title)
	{
		super(title);
	    /*tf 1 time to displayed here*/
	    tf = new JTextField("Time to be displayed here");
	    tf.setBounds(160, 0, 240, 30);
	    tf.setBorder(BorderFactory.createBevelBorder(EtchedBorder.RAISED));
	    add(tf);
	    panel2 = new JPanel();
	    panel2.setBounds(160, 30, 240, 270);
	    panel2.setBackground(Color.white);
	    panel2.setBorder(BorderFactory.createBevelBorder(EtchedBorder.RAISED));
	    add(panel2);
		panel2.setLayout(new GridLayout(4,4));
	    btn = new JButton[str.length];
	  
	    for (int i=str.length - 1; i>=0;i--)
	    {	
	    	btn[i]=new JButton(str[i]);
	        panel2.add(btn[i]);
	    }
	    
	    /*add panel3 */
	    panel3 = new JPanel();
	    panel3.setBounds(5, 135, 150, 30);
	    panel3.setBackground(Color.gray);
	    //panel3.setBorder(BorderFactory.createBevelBorder(EtchedBorder.RAISED));
	    add(panel3);
	    l1 = new JLabel();
	    l1.setText("Food to be placed here");
	    l1.setFont(new Font("Times Roman", Font.PLAIN, 13));
	    panel3.add(l1);
		/*add  panel*/
		
		panel = new JPanel();
	    panel.setBounds(0, 0, 160, 300);
	    panel.setBackground(Color.gray);
	    add(panel);
	    panel.setBorder(BorderFactory.createBevelBorder(EtchedBorder.RAISED));
	  
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MicroWave_Gui MW = new MicroWave_Gui("The Front View of a Microwave Oven");
		MW.setSize(400,300);
		MW.setLayout(null);
		MW.show();
	}

}
