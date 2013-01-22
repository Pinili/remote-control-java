package rcInterface;

import java.io.File;
import java.io.IOException;
import java.util.Vector;

import javax.imageio.ImageIO;

import rcNetwork.RcServerSocket;
import rcNetwork.RcStream;

public class RcMain {
	
	
	
	
	static RcMainWindow wndInterfaceWindow;
	static Vector<RcServerSocket> svsvePortListeners;
	static Vector<RcStream> stmConnectionStreams;
	
	
	public static void main(String[] args){
		
		
		wndInterfaceWindow = new RcMainWindow();
		
		rcControl.RcObserver.initializeCamera();
		rcControl.RcObserver.takeScreenShot();
		try {
			ImageIO.write(rcControl.RcObserver.getLastImage() , "png", new File("screenshot.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Image write has failed");
			e.printStackTrace();
		}
		
		
	}
	
	/**
	 * addStream:
	 * Method adds a stream where applicable in the RcStream vector.
	 */
	public void addStream(RcStream newStream){
		for (int iuP1 = 0; iuP1 < stmConnectionStreams.size(); iuP1 ++){
			if (stmConnectionStreams.get(iuP1) == null){
				stmConnectionStreams.set(iuP1 , newStream);
				return;
			}
		}
		
		stmConnectionStreams.add(newStream);
	}
	
	
	
}
