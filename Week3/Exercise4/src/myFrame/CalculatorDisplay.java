package myFrame;
import java.awt.*; 
import javax.swing.*; 
import java.awt.event.*; 
public class CalculatorDisplay extends JFrame implements ActionListener{
	JTextField tf1, tf2;
	JPanel pa, Pa, Pa1;
	JLabel l1, l2, l3 ;
	JButton btn1, btn2, btn3, btn4;
	float fresult;
	public CalculatorDisplay()
	{
		this.setSize(300,200);
		pa = new JPanel();
		pa.setBounds(0, 0, 300, 100);
		Pa = new JPanel();
		Pa.setBounds(0, 100, 300, 50);
		Pa.setLayout(new GridLayout(1,4));
		Pa1 = new JPanel();
		Pa1.setBounds(60,160,240,30);
		tf1 = new JTextField("");
		tf1.setBounds(50, 0, 250, 50);
		tf2 = new JTextField("");
		tf2.setBounds(50, 50, 250, 50);
		l1 = new JLabel("x=");
		l1.setBounds(10, 10, 30, 30);
		l2 = new JLabel("y=");
		l2.setBounds(10, 60, 30, 30);
		
		btn1 = new JButton("+");
		btn2 = new JButton("-");
		btn3 = new JButton("*");
		btn4 = new JButton("/");
		l3 = new JLabel("");

		Pa.add(btn1);
		Pa.add(btn2);
		Pa.add(btn3);
		Pa.add(btn4);
		Pa1.add(l3);
		this.add(Pa1);
		this.add(l2);
		this.add(l1);
		this.add(tf1);
		this.add(tf2);
		this.add(Pa);
		this.add(pa);
		
		
	    btn1.addActionListener(this);          
        btn2.addActionListener(this);
        btn3.addActionListener(this);          
        btn4.addActionListener(this);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorDisplay f = new CalculatorDisplay(); 
        //f.setBounds(100, 100, 300, 200); 
        f.setTitle("RadioButtons"); 
  
        // Setting Visible status of frame as true. 
        f.setVisible(true); 

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getSource() == btn1)
		{	
			fresult = Float.parseFloat(tf1.getText()) +  Float.parseFloat(tf2.getText());
			l3.setText("x + y = " + fresult);
		}
		else if(ae.getSource() == btn2)
		{	
			fresult = Float.parseFloat(tf1.getText()) -  Float.parseFloat(tf2.getText());
			l3.setText("x - y = " + fresult);
		}else if(ae.getSource() == btn3)
		{	
			fresult = Float.parseFloat(tf1.getText()) *  Float.parseFloat(tf2.getText());
			l3.setText("x * y = " + fresult);
		}
		else
		{	
			fresult = Float.parseFloat(tf1.getText()) /  Float.parseFloat(tf2.getText());
			l3.setText("x / y = " + fresult);
		}
	}

}