package rcControl;

import java.awt.AWTException;
import java.awt.Robot;

/**
 * RcManipulator:
 * This class gives the ability to do the manipulative things - mouse emulation, keyboard emulation, stuff of that sort.
 */
public class RcManipulator {

	private static Robot robManipulator;
	
	public static boolean initializeManipulator(){
		try {
			robManipulator = new Robot();
		} catch (AWTException e) {
			return false;
		}
		return true;
	}
	
	public static void shiftMouseX(int xShift){
		robManipulator.mouseMove(RcObserver.getMouseX() + xShift, RcObserver.getMouseY());
	}
	public static void shiftMouseY(int yShift){
		robManipulator.mouseMove(RcObserver.getMouseX(), RcObserver.getMouseY()  + yShift);
	}
	public static void setMousePosition(int xPos, int yPos){
		robManipulator.mouseMove( xPos , yPos );
	}
	
}
