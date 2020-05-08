package w4;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
@SuppressWarnings("deprecation")
public class InterestRate extends Applet implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1;
	
	JPanel pa, pa1, pa2, pa3;
	TextField tf1 , tf2, tf3, tf4 , tf5;
	JLabel l1 , l2 , l3 , l4, l5 , l6 , l7;
	JButton btn;
	
	float monthlyInterest, monthlyPayment, InterestRate, loanAmount, totalPayment, numberOfYear;
	public InterestRate() {
		pa = new JPanel();
		pa.setBounds(0, 0, 200, 150);
		pa1 = new JPanel();
		pa1.setBounds(0, 0, 200, 20);
		pa1.setBackground(Color.gray);
		l1 = new JLabel();
		l1.setText("Enter loan amount , interest rate , and year");
		pa1.add(l1);
		pa.add(pa1);
		pa2 = new JPanel();
		pa2.setBounds(0, 20, 200, 80);
		pa2.setLayout(new GridLayout(5, 2,15 , 5));
		pa2.setBackground(Color.gray);
		
		l2 = new JLabel();
		l2.setText("Annual Interest Rate");
		l2.setAlignmentX(0);
		pa2.add(l2);
		tf1 = new TextField("");
		pa2.add(tf1);
		
		l3 = new JLabel();
		l3.setText("Number of Year");
		pa2.add(l3);
		tf2 = new TextField("");
		pa2.add(tf2);
		
		l4 = new JLabel();
		l4.setText("Loan Amount");
		pa2.add(l4);
		tf3 = new TextField("");
		pa2.add(tf3);
		
		l5 = new JLabel();
		l5.setText("Monthly Payment");
		pa2.add(l5);
		tf4 = new TextField("");
		pa2.add(tf4);
		
		l6 = new JLabel();
		l6.setText("Total Payment");
		pa2.add(l6);
		tf5 = new TextField("");
		pa2.add(tf5);
		
		pa3 = new JPanel();
		pa3.setBounds(0, 150, 200, 50);
		pa3.setLayout(new FlowLayout(FlowLayout.RIGHT, 35 , 0));
		btn = new JButton("Compute Payment");
		l7 = new JLabel();
		pa3.add(l7);
		pa2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		pa3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		pa3.add(btn);
		this.add(pa);
		this.add(pa2);
		this.add(pa3);
		
		btn.addActionListener(this);
	
	}

	@Override
	public void init() {
	}

	public static void main(String[] args) {
	JFrame frame = new JFrame("Demo 23");
	frame.setSize(270,270);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setPreferredSize(new Dimension(320, 320));
	
	InterestRate rate = new InterestRate();
	rate.setPreferredSize(new Dimension(300, 300));
	rate.init();
	frame.setLayout(new BorderLayout());
	frame.getContentPane().add(rate, BorderLayout.CENTER);
	//frame.pack();
	frame.setVisible(true);
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == btn)
		{
			InterestRate = Float.parseFloat(tf1.getText())/100;
			//System.out.print(InterestRate);
			monthlyInterest = (float)(InterestRate / 12);
			numberOfYear = Float.parseFloat(tf2.getText());
			loanAmount = Float.parseFloat(tf3.getText());
			int numberOfMonth = (int)numberOfYear*12;
			float tmp = (float)(loanAmount*Math.pow((double)(1 + monthlyInterest),(double)numberOfMonth) * monthlyInterest);
			float tmp2 = (float)(Math.pow((double)(1+monthlyInterest), (double)numberOfMonth) - 1);
			monthlyPayment = (float)tmp/tmp2; 
			tf4.setText(String.valueOf(monthlyPayment));
			tf5.setText(String.valueOf(monthlyPayment*12));
		}
		
	}
}