import java.util.StringTokenizer;

public class Tokenss {

	public static void main(String[] args) {
    StringTokenizer st=new StringTokenizer("Hello,World|of|java",",|",true);
    while(st.hasMoreTokens())
    {
    	System.out.println(st.nextToken());
    }
    System.getProperty("variable");
    

	}

}
