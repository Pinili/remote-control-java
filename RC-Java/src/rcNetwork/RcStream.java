package rcNetwork;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.Buffer;

public class RcStream {

	private static final int RECEIVING_ARRAY_LENGTH_DEAFULT = 50;


	private Socket sckNetworkLink;
	private ObjectOutputStream stmOutbound;
	private ObjectInputStream stmInbound;
	
	public String strSocketStatus;

	private WrappedObject[] wroaStreamReceived;
	private int iReceivingAtIndex;

	public RcStream(Socket acceptedNetworkLink){
		strSocketStatus = "Attaching socket.";
		sckNetworkLink = acceptedNetworkLink;
		
		try {
			strSocketStatus = "Attaching streams.";
			stmOutbound = new ObjectOutputStream(sckNetworkLink.getOutputStream());
			stmInbound = new ObjectInputStream(sckNetworkLink.getInputStream());
			strSocketStatus = "Streams attached.";
		} catch (IOException e) {
			strSocketStatus = "Input/Output streams failed to attach to socket.";
			e.printStackTrace();
		}

	}


}
