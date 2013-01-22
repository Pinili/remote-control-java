package rcInterface;

import java.awt.Dimension;
import javax.swing.JFrame;


/**
 * RcMainWindow:
 * A class for the window that will control the overall RC-Java program and all of its connections.
 */
@SuppressWarnings("serial")
public class RcMainWindow extends JFrame{
	
	
	public RcMainWindow(){	
		super("Java Remote Control");
		setMinimumSize(new Dimension(600,256));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		//setIconImage();
		setVisible(true);
	}
	
	
	
	
	
}
