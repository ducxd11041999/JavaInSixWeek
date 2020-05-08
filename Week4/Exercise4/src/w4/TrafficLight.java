package w4;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class TrafficLight extends JFrame implements ActionListener {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		JRadioButton buttonRed, buttonYellow, buttonGreen;
		ButtonGroup G1;
		Signal green = new Signal(Color.green);
		Signal yellow = new Signal(Color.yellow);
     	Signal red = new Signal(Color.red);

    public TrafficLight(){
    	
        super("Java Traffic Light Program");
        getContentPane().setLayout(new FlowLayout());
        buttonRed = new JRadioButton("Red");
        buttonYellow = new JRadioButton("Yellow");
        buttonGreen = new JRadioButton("Green");
        
        G1 = new ButtonGroup();
        G1.add(buttonRed);
        G1.add(buttonGreen);
        G1.add(buttonYellow);
        
        
        buttonRed.addActionListener(this);
        buttonYellow.addActionListener(this);
        buttonGreen.addActionListener(this);      
        
        green.turnOn(false);
        yellow.turnOn(false);
        red.turnOn(true);

        JPanel trafficPanel = new JPanel(new GridLayout(3,1));
        trafficPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        trafficPanel.add(red);
        trafficPanel.add(yellow);
        trafficPanel.add(green);
        JPanel lightPanel = new JPanel(new FlowLayout());
        lightPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        lightPanel.add(buttonRed);
        lightPanel.add(buttonYellow);
        lightPanel.add(buttonGreen);

        getContentPane().add(trafficPanel);
        getContentPane().add(lightPanel);
        pack();
        }


    public static void main(String[] args){
        TrafficLight trafficLight = new TrafficLight();      
        trafficLight.setSize(250, 400);
        trafficLight.setVisible(true);
    }  
    public void actionPerformed(ActionEvent e){      
        if (e.getSource() == buttonRed){
            green.turnOn(false);          
            yellow.turnOn(false);
            red.turnOn(true);
        } else if (e.getSource() == buttonYellow){
            yellow.turnOn(true);          
            green.turnOn(false);
            red.turnOn(false);
        } else if (e.getSource() == buttonGreen){
            red.turnOn(false);          
            yellow.turnOn(false);
            green.turnOn(true);
        }
    }
}  
class Signal extends JPanel{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Color on;
    int radius = 40;
    int border = 10;
    boolean change;

    Signal(Color color){
        on = color;
        change = true;
    }

    public void turnOn(boolean a){
        change = a;
        repaint();      
    }

    public Dimension getPreferredSize(){
        int size = (radius+border)*2;
        return new Dimension( size, size );
    }

    public void paintComponent(Graphics graphics){
        graphics.setColor( Color.gray );
        graphics.fillRect(0,0,getWidth(),getHeight());

        if (change){
            graphics.setColor( on );
        } else {
            graphics.setColor( on.darker().darker().darker() );
        }
        graphics.fillOval( border,border,2*radius,2*radius );
    }
}