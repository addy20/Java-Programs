import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Ser {

	public static void main(String[] args)throws Exception {
    int number,temp;
    ServerSocket s1=new ServerSocket(1234);
    System.out.println("Server is ready");
    Socket ss=s1.accept();
    
    //Read client's request
    Scanner sc=new Scanner(ss.getInputStream());
    number=sc.nextInt();
    temp=number*2;
    
    //write or send the result to client
    PrintStream p=new PrintStream(ss.getOutputStream());
    p.println(temp);
    
	}

}
