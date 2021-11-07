import java.util.regex.Matcher;
import java.util.regex.*;

public class VaalidatingPassword {

	public static void main(String[] args) {
		   Pattern p=Pattern.compile("(?=.*[a-z])(?=.*\\d)(?=.*[A-Z])(?=.*[\\p{Punct}]).{8,}");
		   //Pattern p=Pattern.compile("((.*[@#$%]{1,})(.*[A-Z]{1,})(.*[//d]{1,})(.*[a-z]{1,})){8,30}");
		   Matcher m=p.matcher("@A2aditya");
		   if(m.find())
			   System.out.println("valid");
		   else
			   System.out.println("Invalid");
	}

}
