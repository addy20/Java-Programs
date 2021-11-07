import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex {

	public static void main(String[] args) throws IOException{
    String str;
    BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
    do {
    	str=ob.readLine();
    	System.out.println(str);
    }while(!str.equals("stop"));
	}

}
