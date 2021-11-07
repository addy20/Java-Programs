import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class DaytimeobjectServer {

	public static final short TIME_PORT=1951;
	public static void main(String[] args) {
    Socket clientSock;
    try {
    	ServerSocket sock=new ServerSocket(TIME_PORT);
    	while((clientSock=sock.accept()) != null) {
    		System.out.println("Accept from "+clientSock.getInetAddress());
    		ObjectOutputStream os=new ObjectOutputStream(clientSock.getOutputStream());
    		os.writeObject(new Date());
    		os.close();
    		    	}
    
    }catch(IOException e) {
    	System.err.println();
    }
	}

}
