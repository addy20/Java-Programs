package pack;
import java.util.regex.*;
public class Matcher {

	
		public static void main(String[] args) {
		String inputLine = "Adams, John Quincy";
		Pattern r = Pattern.compile("(.*), (.*)");
		Matcher m = r.matcher(inputLine);
		if (!m.matches())
		{	throw new IllegalArgumentException("Bad input");
		
		}
		System.out.println(m.group(2) + ' ' + m.group(1));
		
}
		}