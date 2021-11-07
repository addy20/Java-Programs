import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatingFileExtension {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("[a-zA-Z0-9_-]+\\.[a-z]+");
		//Pattern p=Pattern.compile("[\\S]+(\\.)[a-z]+");
		   Matcher m=p.matcher("sample.pdf");
		   if(m.find())
			   System.out.println("valid");
		   else
			   System.out.println("Invalid");
	}

}
