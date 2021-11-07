import java.util.regex.*;
import java.util.*;
public class URL {

	public static void main(String[] args) {
		Scanner ab=new Scanner(System.in);
		System.out.println("Enter the URL");
		String urlAddress=ab.next();
		//Pattern p = Pattern.compile("^(https:\\/\\/www.|http:\\/\\/www.|www.|((http|https):\\/\\/[a-zA-Z.])+)[a-zA-Z0-9!\\-_$]+\\.[a-zA-Z.]+\\p{Punct}");
		Pattern z=Pattern.compile("(((http|https)://)(www.))?[a-z0-9]+([.][a-z]+)+\\p{Punct}",Pattern.CASE_INSENSITIVE);
		 Matcher m=z.matcher(urlAddress);
		 if(m.find())
			 System.out.println("Valid");
		 else
			 System.out.println("Invalid");
		    
	}

}
