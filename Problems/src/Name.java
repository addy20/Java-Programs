import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class Name {

	public static void main(String[] args) {
   // Pattern p=Pattern.compile("^[A][a-z]+[l]$");
   // Matcher m=p.matcher("Amjhghjul");
   /*if(m.matches())
   {System.out.println("True");}
   else
	   System.out.println("False");
	}*/
   Pattern p=Pattern.compile("\\W");
   Matcher m=p.matcher("Good @ good % good $ ");
   while(m.find())
	{
		System.out.print(m.group());
	}}
	}


