package w4;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ChangeColor extends JFrame {
  public ChangeColor() {
    getContentPane().add(new TColor());
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(650, 200);
    setVisible(true);
  }

  public static void main(String arg[]) {
    new ChangeColor();
  }
}

class TColor extends JPanel {
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
  DrawingCanvas canvas = new DrawingCanvas();
  JLabel rgbValue = new JLabel("");
  JPanel R, G , B;
  JSlider sliderR, sliderG, sliderB;
  JLabel l1 , l2 , l3;
  public TColor() {
    sliderR = getSlider(0, 255, 0, 50, 5);
    sliderG = getSlider(0, 255, 0, 50, 5);
    sliderB = getSlider(0, 255, 0, 50, 5);
    R = new JPanel();
    G = new JPanel();
    B = new JPanel();
    l1 = new JLabel("R = 0");
    l1.setForeground(Color.red);
    l1.setBounds(200, 10, 100, 20);
    l2 = new JLabel("G = 0");
    l2.setForeground(Color.green);
    l3 = new JLabel("B = 0");
    l3.setForeground(Color.blue);
    
    R.add(l1);
    G.add(l2);
    B.add(l3);
    JPanel panel = new JPanel();
    GridLayout gr = new GridLayout(3,3,5,5);
    panel.setBorder(BorderFactory.createRaisedBevelBorder());
    panel.setLayout(gr);
    panel.setBackground(Color.gray);
    panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    panel.add(sliderR);
    panel.add(R);
    panel.add(sliderG);
    panel.add(G);
    panel.add(sliderB);
    panel.add(B);
    
    add(panel, BorderLayout.SOUTH);
    add(canvas);
  }

  public JSlider getSlider(int min, int max, int init, int mjrTkSp, int mnrTkSp) {
    JSlider slider = new JSlider(JSlider.HORIZONTAL, min, max, init);
    slider.setPaintTicks(true);
    slider.setMajorTickSpacing(mjrTkSp);
    slider.setMinorTickSpacing(mnrTkSp);
    slider.setPaintLabels(true);
    slider.addChangeListener(new SliderListener());
    return slider;
  }

  class DrawingCanvas extends Canvas {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Color color;
    int redValue, greenValue, blueValue;
    int alphaValue = 255;
    float[] hsbValues = new float[3];

    public DrawingCanvas() {
      setSize(150, 150);
      color = new Color(0, 0, 0);
      setBackgroundColor();
    }

    public void setBackgroundColor() {
      color = new Color(redValue, greenValue, blueValue, alphaValue);
      setBackground(color);
    }
  }

  class SliderListener implements ChangeListener {
	  
    public void stateChanged(ChangeEvent e) {
      JSlider slider = (JSlider) e.getSource();
      if (slider == sliderR) {
        canvas.redValue = slider.getValue();
        displayRGBColor();
        l1.setText("R = "+ canvas.redValue);
      } else if (slider == sliderG) {
        canvas.greenValue = slider.getValue();
        displayRGBColor();
        l2.setText("G = "+ canvas.greenValue);
      } else if (slider == sliderB) {
        canvas.blueValue = slider.getValue();
        displayRGBColor();
        l3.setText("B = "+ canvas.blueValue);
      }
    }
    public void displayRGBColor() {
      canvas.setBackgroundColor();
      Color.RGBtoHSB(canvas.redValue, canvas.greenValue, canvas.blueValue,canvas.hsbValues);
      rgbValue.setText(Integer.toString(canvas.color.getRGB() & 0xffffff, 16));
    }
  }
}