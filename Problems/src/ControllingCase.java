import java.util.regex.*;

public class ControllingCase 
{

	public static void main(String[] args) 
	{
      System.out.println(Pattern.compile("\\b[a-z]+\\b",Pattern.CASE_INSENSITIVE).matcher("Stew Pasta Twinkles").find());
      //System.out.println(Pattern.compile("\\b[a-z]+\\b").matcher("Stew Pasta Twinkles").find());
	}

}
