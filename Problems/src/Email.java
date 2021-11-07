import java.util.regex.*;

public class Email {

	public static void main(String[] args) {
    Pattern p=Pattern.compile("[a-zA-Z0-9.]+@[a-zA-Z0-9]+[.][a-zA-Z]+");
    Matcher m=p.matcher("ab.adityasingh2001@soa.ac.in");
    if(m.find())
    System.out.println("Given email is a valid mail");
    else
    	System.out.println("Given mail is not a valid mail");
    
	}

}
