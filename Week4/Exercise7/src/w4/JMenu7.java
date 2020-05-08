package w4;
import java.io.File;
import java.text.DecimalFormat;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
 
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
 
public class JMenu7 implements ActionListener, ItemListener, KeyListener{
    JTextArea output;
    JScrollPane scrollPane;
    String newline = "\n";
 
    public JMenuBar createMenuBar() {
        JMenuBar menuBar;
        JMenu File = null;
        JMenuItem menuItem;
 
        // Create the menu bar.
        menuBar = new JMenuBar();
 
        // Build the first menu.
        File = new JMenu("File");
        File.setMnemonic(KeyEvent.VK_F);
        File.addKeyListener(this);
        File.getAccessibleContext().setAccessibleDescription("File");
        menuBar.add(File);
        
        // a group of JMenuItems
        menuItem = new JMenuItem("New", KeyEvent.VK_N);
        // menuItem.setMnemonic(KeyEvent.VK_T); //used constructor instead
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,
                ActionEvent.CTRL_MASK));
        menuItem.getAccessibleContext().setAccessibleDescription(
                "create New File");
        menuItem.addActionListener(this);
        File.add(menuItem);
        menuItem = new JMenuItem("Open", KeyEvent.VK_O);
        // menuItem.setMnemonic(KeyEvent.VK_T); //used constructor instead
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,
                ActionEvent.CTRL_MASK));
        menuItem.getAccessibleContext().setAccessibleDescription(
                "Open Existing File");
        menuItem.addActionListener(this);
        File.add(menuItem);
        menuItem = new JMenuItem("Exit", KeyEvent.VK_E);
        // menuItem.setMnemonic(KeyEvent.VK_T); //used constructor instead
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,
                ActionEvent.CTRL_MASK));
        menuItem.getAccessibleContext().setAccessibleDescription(
                "Exit");
        menuItem.addActionListener(this);
        File.add(menuItem);
        menuBar.add(File);
 
        return menuBar;
    }
 
    public Container createContentPane() {
        // Create the content-pane-to-be.
        JPanel contentPane = new JPanel(new BorderLayout());
        contentPane.setOpaque(true);
 
        // Create a scrolled text area.
        output = new JTextArea(5, 30);
        output.setEditable(false);
        scrollPane = new JScrollPane(output);
 
        // Add the text area to the content pane.
        contentPane.add(scrollPane, BorderLayout.CENTER);
 
        return contentPane;
    }
 
    public void createPopupMenu() {
        JMenuItem menuItem;
 
        // Create the popup menu.
        JPopupMenu popup = new JPopupMenu();
        menuItem = new JMenuItem("A popup menu item");
        menuItem.addActionListener(this);
        popup.add(menuItem);
        menuItem = new JMenuItem("Another popup menu item");
        menuItem.addActionListener(this);
        popup.add(menuItem);
 
        // Add listener to the text area so the popup menu can come up.
        MouseListener popupListener = new PopupListener(popup);
        output.addMouseListener(popupListener);
    }
 
    public void actionPerformed(ActionEvent e) {
        JMenuItem source = (JMenuItem) (e.getSource());
        String s = "Action event detected." + newline + "    Event source: "
                + source.getText();
        output.append(s + newline);
        output.setCaretPosition(output.getDocument().getLength());
        
        if(source.getText()=="Exit")
        {
        	System.exit(0);
        }
    }
 
    public void itemStateChanged(ItemEvent e) {
    	//System.out.print(1);
        JMenuItem source = (JMenuItem) (e.getSource());
        String s =  "Event source: "
                + source.getText();
        
        output.append(s + newline);
        output.setCaretPosition(output.getDocument().getLength());
    }
 
    // Returns just the class name -- no package info.
    protected String getClassName(Object o) {
        String classString = o.getClass().getName();
        int dotIndex = classString.lastIndexOf(".");
        return classString.substring(dotIndex + 1);
    }
 
    /** Returns an ImageIcon, or null if the path was invalid. */
    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = JMenu7.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }
    private static void createAndShowGUI() {
        // Create and set up the window.
        JFrame frame = new JFrame("Exercise 7 JMenu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        // Create/set menu bar and content pane.
        JMenu7 demo = new JMenu7();
        frame.setJMenuBar(demo.createMenuBar());
        frame.setContentPane(demo.createContentPane());
 
        // Create and set up the popup menu.
        demo.createPopupMenu();
 
        // Display the window.
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
        File file = new File("");
        String currentDirectory = file.getAbsolutePath();
        System.out.println("Current working directory : " + currentDirectory);
 
        // Get Current Directory using Property user.dir
        
       
    }
 
    class PopupListener extends MouseAdapter {
        JPopupMenu popup;
 
        PopupListener(JPopupMenu popupMenu) {
            popup = popupMenu;
        }
 
        public void mousePressed(MouseEvent e) {
            maybeShowPopup(e);
        }
 
        public void mouseReleased(MouseEvent e) {
            maybeShowPopup(e);
        }
 
        private void maybeShowPopup(MouseEvent e) {
            if (e.isPopupTrigger()) {
                popup.show(e.getComponent(), e.getX(), e.getY());
            }
        }
    }

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent ae) {
		System.out.print(ae.getSource().getClass());
	}
}