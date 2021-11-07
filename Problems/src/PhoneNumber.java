import java.util.regex.*;
public class PhoneNumber {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("^(91|0)?[789]\\d{9}");
		   Matcher m=p.matcher("917008515860");
		  if(m.find())
		      System.out.println("is valid");
		  else
			  System.out.println("is not valid");
	}

}
