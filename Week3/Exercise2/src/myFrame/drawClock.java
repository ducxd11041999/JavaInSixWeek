package myFrame;
import java.awt.*;
import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;
public class drawClock extends Applet{
	 /**
	 * 
	 */
		private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	 GregorianCalendar cal;
	 Timer clockTimer = new Timer();
	 TimeZone clockTimeZone = TimeZone.getDefault();
	 int center[] = {300,300};
	 int movePostionHours[] = {300, 200};
	 int movePostionSeconds[] = {310, 180};
	 public drawClock() {
		 	clockTimer.schedule(new TickTimerTask(), 0, 1000);
	 }
	 public void paint(Graphics g) {  
	        g.drawArc(100, 100, 400,400,0,360);
	        g.setColor(Color.red);
	        g.setFont(new Font("Times Roman", Font.BOLD, 13));
	        g.drawString("12",295,120);
	        g.setColor(Color.red);
	        g.setFont(new Font("Times Roman", Font.BOLD, 13));
	        g.drawString("6",295,490);
	        g.setColor(Color.red);
	        g.setFont(new Font("Times Roman", Font.BOLD, 13));
	        g.drawString("3",485,305);
	        g.setColor(Color.red);
	        g.setFont(new Font("Times Roman", Font.BOLD, 13));
	        g.drawString("9",110,305);
	        double second = cal.get(Calendar.SECOND);
			double minute = cal.get(Calendar.MINUTE);
			double hours = cal.get(Calendar.HOUR);
			
			SimpleDateFormat sdf = new SimpleDateFormat("hh");
			g.setColor(Color.red);
			g.setFont(new Font("Tahoma", Font.BOLD, 16));
			g.drawString("Hour :", 150, 550);
			g.drawString(sdf.format(cal.getTime()), 210, 550);
			
			SimpleDateFormat sdf1 = new SimpleDateFormat("mm");
			g.setColor(Color.red);
			g.setFont(new Font("Tahoma", Font.BOLD, 16));
			g.drawString("Minute :", 240, 550);
			g.drawString(sdf1.format(cal.getTime()), 320, 550);
			
			SimpleDateFormat sdf2 = new SimpleDateFormat("ss");
			g.setColor(Color.red);
			g.setFont(new Font("Tahoma", Font.BOLD, 16));
			g.drawString("Second :", 350, 550);
			g.drawString(sdf2.format(cal.getTime()), 430, 550);
			
			
			Graphics2D g2 = (Graphics2D) g;
		    g2.setStroke(new BasicStroke(3));
		    drawHands(g2, second, minute, hours);
	   
	    }
	 public void drawHands(Graphics g, double second, double minute, double hours) {
		 
		 double rSecond = (second * 6) * (Math.PI) / 180;
		 double rMinute = ((minute + (second / 60)) * 6) * (Math.PI) / 180;
		 double rHours = ((hours + (minute / 60)) * 30) * (Math.PI) / 180;
		 g.setColor(Color.red);
		 g.drawLine(300, 300, 300 + (int) (150 * Math.cos(rSecond - (Math.PI / 2))), 300 + (int) (150 * Math.sin(rSecond - (Math.PI / 2))));
		 g.setColor(Color.blue);
		 g.drawLine(300, 300, 300 + (int) (100 * Math.cos(rMinute - (Math.PI / 2))), 300 + (int) (100 * Math.sin((rMinute - (Math.PI / 2)))));
		 g.setColor(Color.green);
		 g.drawLine(300, 300, 300 + (int) (70 * Math.cos(rHours - (Math.PI / 2))), 300 + (int) (70 * Math.sin(rHours - (Math.PI / 2))));
		 }
	 class TickTimerTask extends TimerTask {

			@Override
			public void run() {
		//throw new UnsupportedOperationException("Not supported yet.");
				cal = (GregorianCalendar) GregorianCalendar.getInstance(clockTimeZone);
				repaint();
			}
		}

	 public static void main(String[] args) {  
		 JFrame frame = new JFrame("Display Clock");
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.setPreferredSize(new Dimension(600, 600));
		 drawClock clock2d = new drawClock();
		 clock2d.setPreferredSize(new Dimension(320, 320));
		 clock2d.init();
		 frame.setLayout(new BorderLayout());
		 frame.getContentPane().add(clock2d, BorderLayout.CENTER);
		 frame.pack();
		 frame.setVisible(true);
	         
	    }  

}
