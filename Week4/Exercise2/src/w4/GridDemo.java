package w4;
import java.awt.*;
import javax.swing.*;
public class GridDemo extends JFrame {
	int x1[] = {10 , 10 , 10, 10, 10, 100, 190, 280};
	int y1[] = {50, 100 ,150 ,200, 50, 50, 50, 50};
	int x2[] = {280, 280 ,280, 280, 10, 100, 190, 280};
	int y2[] = {50 , 100 ,150 , 200, 200, 200 , 200, 200};
	//static Graphics ga;
	public GridDemo()
	{
		super("Drawing Color Line Demo");
		setSize(300, 250);
		setVisible(true);
	}
	public void paint(Graphics g)
	{
		for (int i = 0 ; i < x1.length ; i++)
		{
			if(i < 4)
				g.setColor(Color.red);
			else 
				g.setColor(Color.blue);
			g.drawLine(x1[i], y1[i], x2[i], y2[i]);
			g.setFont(new Font("Times Roman", Font.BOLD, 15));
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GridDemo d = new GridDemo();
		d.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}