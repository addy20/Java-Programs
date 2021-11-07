import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ConnectFriendly {

	public static void main(String[] args) {
    String server_name="localhost";
    int tcp_port=100;
	try(Socket sock=new Socket(server_name,tcp_port)){
    	System.out.println("*** Connected to "+server_name+" ****");
    	
    }catch(UnknownHostException e) {
    	System.err.println(server_name+"Unknown host");
    	return;
    }catch(NoRouteToHostException e) {
    	System.err.println(server_name+"Unreachable");
    	return;
    }catch(ConnectException e) {
    	System.err.println(server_name+"connect refused");
    	return;
    }catch(java.io.IOException e) {
    	System.err.println(server_name+" "+e.getMessage());
    	return;
    }
	}

}
