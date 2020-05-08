package w4;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

public class Puzzle extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Button btn[];
	int checkBlank = 0 , result = 0;
	ArrayList<Integer> dayso = new ArrayList<Integer>();
	public Puzzle(String title)
	{
		super(title);
		setLayout(new GridLayout(4,4));
	    btn = new Button[16];
	    for(int i = 0; i<=15;i++)
	    {
	    	dayso.add(i);
	    }   	
	    for (int i = 15; i>0;i--)
	    {	
	    		Random rd = new Random();
	    		int tmp = rd.nextInt(i);
	    		//System.out.println(tmp);
	    		btn[i] = new Button(dayso.get(tmp+1).toString());
	    		dayso.remove(tmp+1);
	    		add(btn[i]);
	    }
	    btn[0] = new Button();
	    add(btn[0]);
	    for(int i = 0; i<16; i++)
	    {
	    	btn[i].addActionListener(this);
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Puzzle pu = new Puzzle("Puzzle");
			pu.setSize(400,400);
				
			//pu.pack();
			pu.setVisible(true);
			pu.show();
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getSource() == btn[0])
		{
			
			String st = btn[0].getLabel();
			btn[0].setLabel("");
			btn[checkBlank].setLabel(st);
			checkBlank = 0;
			
			
		}
		if(ae.getSource() == btn[1])
		{
			String st = btn[1].getLabel();
			btn[1].setLabel("");
			btn[checkBlank].setLabel(st);
			checkBlank = 1;
		}
		if(ae.getSource() == btn[2])
		{
			String st = btn[2].getLabel();
			btn[2].setLabel("");
			btn[checkBlank].setLabel(st);
			checkBlank = 2;
			
		}
		if(ae.getSource() == btn[3])
		{
			String st = btn[3].getLabel();
			btn[3].setLabel("");
			btn[checkBlank].setLabel(st);
			checkBlank = 3;
			
		}
		if(ae.getSource() == btn[4])
		{
			String st = btn[4].getLabel();
			btn[4].setLabel("");
			btn[checkBlank].setLabel(st);
			checkBlank = 4;
			
		}
		if(ae.getSource() == btn[5])
		{
			String st = btn[5].getLabel();
			btn[5].setLabel("");
			btn[checkBlank].setLabel(st);
			checkBlank = 5;
			
		}
		if(ae.getSource() == btn[6])
		{
			String st = btn[6].getLabel();
			btn[6].setLabel("");
			btn[checkBlank].setLabel(st);
			checkBlank = 6;
			
		}
		if(ae.getSource() == btn[7])
		{
			String st = btn[7].getLabel();
			btn[7].setLabel("");
			btn[checkBlank].setLabel(st);
			checkBlank = 7;
			
		}
		if(ae.getSource() == btn[8])
		{
			String st = btn[8].getLabel();
			btn[8].setLabel("");
			btn[checkBlank].setLabel(st);
			checkBlank = 8;
			
		}
		if(ae.getSource() == btn[9])
		{
			String st = btn[9].getLabel();
			btn[9].setLabel("");
			btn[checkBlank].setLabel(st);
			checkBlank = 9;
			
		}
		if(ae.getSource() == btn[10])
		{
			String st = btn[10].getLabel();
			btn[10].setLabel("");
			btn[checkBlank].setLabel(st);
			checkBlank = 10;
			
		}
		if(ae.getSource() == btn[11])
		{
			String st = btn[11].getLabel();
			btn[11].setLabel("");
			btn[checkBlank].setLabel(st);
			checkBlank = 11;
			
		}
		if(ae.getSource() == btn[12])
		{
			String st = btn[12].getLabel();
			btn[12].setLabel("");
			btn[checkBlank].setLabel(st);
			checkBlank = 12;
			
		}
		if(ae.getSource() == btn[13])
		{
			String st = btn[13].getLabel();
			btn[13].setLabel("");
			btn[checkBlank].setLabel(st);
			checkBlank = 13;
			
		}
		if(ae.getSource() == btn[14])
		{
			String st = btn[14].getLabel();
			btn[14].setLabel("");
			btn[checkBlank].setLabel(st);
			checkBlank = 14;
			
		}
		if(ae.getSource() == btn[15])
		{
			String st = btn[15].getLabel();
			btn[15].setLabel("");
			btn[checkBlank].setLabel(st);
			checkBlank = 15;
		}
	
		if(btn[15].getLabel().equals("15") && btn[14].getLabel().equals("14") &&
				btn[13].getLabel().equals("13") && btn[12].getLabel().equals("12") &&
				btn[11].getLabel().equals("11") && btn[10].getLabel().equals("10") &&
				btn[9].getLabel().equals("9") && btn[8].getLabel().equals("8") &&
				btn[7].getLabel().equals("7") && btn[6].getLabel().equals("6") &&
				btn[5].getLabel().equals("5") && btn[4].getLabel().equals("4") &&
				btn[3].getLabel().equals("3") && btn[2].getLabel().equals("2") &&
				btn[1].getLabel().equals("1")){
			 JOptionPane.showMessageDialog(this,"Congratulations! You won.");  
		}
		  
	}

}