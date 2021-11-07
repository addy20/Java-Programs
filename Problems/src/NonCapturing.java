import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NonCapturing {

	public static void main(String[] args) {
    System.out.println("Enter input text");
    Scanner sc=new Scanner(System.in);
    String input=sc.nextLine();
    String regex="(.*)(?:\\d)(.*)";
    //String regex="(.*)(?!\\d)(.*)";
    //String regex="a(?!b)";
    
    Pattern p=Pattern.compile(regex);
    Matcher m=p.matcher(input);
    if(m.find())
    {
    	System.out.println("Found value :"  +m.group(0));
    	System.out.println("Found value :"  +m.group(1));
    	System.out.println("Found value :"  +m.group(2));
    	System.out.println("Total Group :"  +m.groupCount());
    	
    }
    else
    	{
    	System.out.println("NO Match");
    	}
    
	}

}
