package rcControl;

import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;

/**
 * RcObserver:
 * This class gives the ability to do observational things - get mouse location, get pictures - that sort of ordeal.
 *
 */
public class RcObserver {

	private static Robot robCamera;
	private static BufferedImage bmgScreenShot;
	
	public static boolean initializeCamera(){
		try {
			robCamera = new Robot();
		} catch (AWTException e) {
			return false;
		}
		return true;
	}
	
	public static void takeScreenShot(){
		bmgScreenShot = robCamera.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
	}
	
	public static int getMouseX(){
		return MouseInfo.getPointerInfo().getLocation().x;
	}
	public static int getMouseY(){
		return MouseInfo.getPointerInfo().getLocation().y;
	}
	
	
}
