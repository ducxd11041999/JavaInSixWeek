package w4;
import java.text.DecimalFormat;
import java.awt.*; 
import javax.swing.*; 
import java.awt.event.*; 
public class CalDemo extends JFrame implements ActionListener, ItemListener, KeyListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField tf1, tf2, tf3;
	JPanel pa, Pa, Pa1;
	JLabel l1, l2, l3 ;
	JButton btn1, btn2, btn3, btn4;
	JMenuItem btn11;
	float fresult;
	public CalDemo()
	{
		this.setSize(400,120);
		
		pa = new JPanel();
		pa.setBounds(0, 0, 300, 70);
		//pa.setBackground(Color.red);
		tf1 = new JTextField("");
		tf1.setBounds(80, 20, 50, 20);;
		tf2 = new JTextField("");
		tf2.setBounds(200, 20, 50, 20);
		tf3 = new JTextField("");
		tf3.setBounds(310, 20, 50, 20);
		l1 = new JLabel("Number 1");
		l1.setBounds(10, 25 , 80, 10);
		
		l2 = new JLabel("Number 2");
		l2.setBounds(130, 25 , 80 , 10);
		
		l3 = new JLabel("Result");
		l3.setBounds(260, 25 , 120 , 10);
		
		Pa = new JPanel();
		Pa.setBounds(0 , 50, 400, 30);
		
		btn1 = new JButton("Add");
		btn2 = new JButton("Subtract");
		btn3 = new JButton("Multiply");
		btn4 = new JButton("Divide");
		Pa.setLayout(new FlowLayout());
		Pa.add(btn1);
		Pa.add(btn2);
		Pa.add(btn3);
		Pa.add(btn4);
		this.add(Pa);
		
		this.add(l3);
		this.add(l2);
		this.add(l1);
		this.add(tf1);
		this.add(tf2);
		this.add(tf3);
		this.add(pa);

		btn1.addKeyListener(this);
		btn2.addKeyListener(this);
		btn3.addKeyListener(this);
		btn4.addKeyListener(this);
		
		btn1.setMnemonic(KeyEvent.VK_A);
		btn1.addItemListener(this);
		btn2.setMnemonic(KeyEvent.VK_S);
		btn2.addItemListener(this);
		btn3.setMnemonic(KeyEvent.VK_M);
		btn3.addItemListener(this);
		btn4.setMnemonic(KeyEvent.VK_D);
		btn4.addItemListener(this);
	    btn1.addActionListener(this);          
        btn2.addActionListener(this);
        btn3.addActionListener(this);          
        btn4.addActionListener(this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalDemo f = new CalDemo(); 
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
			tf3.setText(String.valueOf(fresult));
		}
		else if(ae.getSource() == btn2)
		{	
			fresult = Float.parseFloat(tf1.getText()) -  Float.parseFloat(tf2.getText());
			tf3.setText(String.valueOf(fresult));
		}else if(ae.getSource() == btn3)
		{	
			fresult = Float.parseFloat(tf1.getText()) *  Float.parseFloat(tf2.getText());
			tf3.setText(String.valueOf(fresult));		}
		else
		{	
			fresult = Float.parseFloat(tf1.getText()) /  Float.parseFloat(tf2.getText());
			DecimalFormat fmt1=new DecimalFormat("0.##");
			tf3.setText(String.valueOf(fmt1.format(fresult)));		
		}
	}
	
	@Override
	public void itemStateChanged(ItemEvent ae) {
		//System.out.print("Hi");
		if(ae.getSource() == btn1)
		{	
			//System.out.print("aaaaa");	
			fresult = Float.parseFloat(tf1.getText()) +  Float.parseFloat(tf2.getText());
			tf3.setText(String.valueOf(fresult));
		}
		else if(ae.getSource() == btn2)
		{	
			fresult = Float.parseFloat(tf1.getText()) -  Float.parseFloat(tf2.getText());
			tf3.setText(String.valueOf(fresult));
		}else if(ae.getSource() == btn3)
		{	
			fresult = Float.parseFloat(tf1.getText()) *  Float.parseFloat(tf2.getText());
			tf3.setText(String.valueOf(fresult));		
		}
		else
		{	
			fresult = Float.parseFloat(tf1.getText()) /  Float.parseFloat(tf2.getText());
			DecimalFormat fmt1=new DecimalFormat("0.##");
			tf3.setText(String.valueOf(fmt1.format(fresult)));		
		}
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent ae) {
		// TODO Auto-generated method stub
			if(ae.getKeyChar() == 'a' || ae.getKeyChar() == 'A')
			{
				fresult = Float.parseFloat(tf1.getText()) +  Float.parseFloat(tf2.getText());
				tf3.setText(String.valueOf(fresult));
			}
			if(ae.getKeyChar() == 's' || ae.getKeyChar() == 'S')
			{
				fresult = Float.parseFloat(tf1.getText()) -  Float.parseFloat(tf2.getText());
				tf3.setText(String.valueOf(fresult));
			}
			if(ae.getKeyChar() == 'm' || ae.getKeyChar() == 'M')
			{
				fresult = Float.parseFloat(tf1.getText()) *  Float.parseFloat(tf2.getText());
				tf3.setText(String.valueOf(fresult));		
			}
			if(ae.getKeyChar() == 'd' || ae.getKeyChar() == 'D')
			{
				fresult = Float.parseFloat(tf1.getText()) /  Float.parseFloat(tf2.getText());
				DecimalFormat fmt1=new DecimalFormat("0.##");
				tf3.setText(String.valueOf(fmt1.format(fresult)));		
			}
	}

}