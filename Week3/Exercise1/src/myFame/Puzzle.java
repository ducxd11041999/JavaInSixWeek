package myFame;
import java.awt.*;
import java.awt.event.*;
public class Puzzle extends Frame{
	Button btn[];
	String str[]={"", "1", "2", "3", "4", "5", "6", "7", "8", "9","10","11","12","13","14","15",};
	public Puzzle(String title)
	{
		super(title);
		setLayout(new GridLayout(4,4));
	    btn = new Button[16];
	    for (int i=15; i>=0;i--)
	    {	
	    	btn[i]=new Button(str[i]);
	        add(btn[i]);
	    }
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Puzzle pu = new Puzzle("Puzzle");
			pu.setSize(400,400);
			pu.show();
	}

}
