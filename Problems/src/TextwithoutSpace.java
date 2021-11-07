import java.util.regex.*;

public class TextwithoutSpace {

	public static void main(String[] args) {
    Pattern p=Pattern.compile("\\S");
    Matcher m=p.matcher("My name is Aditya SIngh");
    while(m.find())
    {
    	System.out.print(m.group());
    }
    
	}

}
