import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstLetterOfEachWord {

	public static void main(String[] args) {
		
				String regex = "\\b[a-zA-Z]"; 
		        
		        Pattern p = Pattern.compile(regex); 
		          
		        Matcher m = p.matcher("My name is Aditya SIngh"); 
		        
		          
		        while(m.find()) 
		        { 
		        	System.out.print(m.group());  
		        } 
		           
		           
			}

		

	}


