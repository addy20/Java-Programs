import java.net.InetAddress;
import java.net.UnknownHostException;

public class Address {

	public static void main(String[] args) {
    try {
    	InetAddress id=InetAddress.getLocalHost();
    	System.out.println(id.getHostAddress());
    }catch(UnknownHostException e) {
    	
    }
	}

}
