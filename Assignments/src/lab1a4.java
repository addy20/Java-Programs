import java.util.*;
public class lab1a4 {
	public static void main(String[] args) {
    Scanner ab=new Scanner(System.in);
    System.out.println("Enter a String");
    String S=ab.nextLine();
    for(char ch='a';ch<='z';ch++)
    {
    	int count=0;
    	for(int i=0;i<S.length();i++)
    	{
    		if(ch==S.charAt(i))
    		{
    			count++;
    		}
    	}
    	if(count!=0)
    	System.out.println(ch+" "+count);
    }
	}

}
