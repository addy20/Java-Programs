import java.util.*;
public class lab1a3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str=in.nextLine();
		str=" "+str.toLowerCase();
		/*
		 in.close();
		str=" "+str.toLowerCase()+" ";
		StringTokenizer st = new StringTokenizer(str,"aeiou");
		System.out.println("Number of Vowels : "+(st.countTokens()-1));
		*/
		int vowels=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				vowels++;
			}
		}
		System.out.println(vowels);

	}

}
