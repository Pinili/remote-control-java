package rcNetwork;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class RcServerSocket extends Thread{

	ServerSocket svkNetworkSocket;

	Socket sckAcceptedSocket;
	boolean bSocketRequestHandled;

	String strServerStatus;
	boolean bSocketCreated;
	boolean bSocketSearching;

	public RcServerSocket(int port, int backlog){
		try {
			svkNetworkSocket = new ServerSocket(port , backlog);
			bSocketCreated = true;
		} catch (IOException e) {
			System.out.println("Server socket failed to bind.");
			strServerStatus = "Socket failed to bind.";
			e.printStackTrace();
		}
	}
	public RcServerSocket(int port){
		this(port, 50);
	}


	public void setSearchingStatus(boolean openToNewConnections){
		if (bSocketCreated){
			if (openToNewConnections){
				bSocketSearching = true;
				run();

			}
		}

	}

	public void run(){

		try{
			if (bSocketCreated){
				while (bSocketSearching){
					sckAcceptedSocket = svkNetworkSocket.accept();
				}
			}
		} catch (IOException e){
			strServerStatus = "Failure in accepting sockets";
		}
	}



}
