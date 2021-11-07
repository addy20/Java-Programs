import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String pattern = in.nextLine();
			//Pattern p=Pattern.compile(pattern);
          	try {
          		Pattern p=Pattern.compile(pattern);	
          	}
          	catch(Exception e){
          		if(e.equals(null))
          		System.out.println("Valid");
          		else
          		System.out.println("Invalid");
          		}
          	
          	}
	}
}