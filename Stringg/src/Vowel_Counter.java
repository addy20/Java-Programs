import java.util.*;
public class Vowel_Counter {
	public static void main(String[] args) {
    Scanner ab=new Scanner(System.in);
    System.out.println("Enter the String");
    String line=ab.next();
    String s=line.toLowerCase();
    char ch[]=s.toCharArray();
    int count=0;
    for(int m=0;m<ch.length;m++)
    {
    	if(ch[m]=='a'||ch[m]=='e'||ch[m]=='i'||ch[m]=='o'||ch[m]=='u')
    	{
    		count++;
    	}
    }
    System.out.println(count);
	}

}
