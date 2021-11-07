import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.sql.Date;

public class DaytimeObject {
    public static final short TIME_PORT=1951;
	public static void main(String[] args) {
    String hostName="localhost";
    try {
    	Socket sock=new Socket(hostName,TIME_PORT);
    	ObjectInputStream is=new ObjectInputStream(new BufferedInputStream(sock.getInputStream()));
    	Object o=is.readObject();
    	if(o==null) {
    		System.err.println("Read null from server!");
    	}else if((o instanceof Date)) {
    		Date d=(Date) o;
    		System.out.println("Server host is "+hostName);
    		System.out.println("Time there is "+d.toString());
    	}else {
    		throw new IllegalArgumentException("Wanted Date,got "+o);
    	}}catch(ClassNotFoundException e) {
    		System.err.println("Wanted date , got INVALID CLASS("+e+")");
    	}catch (IOException e) {
    		System.err.println(e);
    	}
    }
	}


