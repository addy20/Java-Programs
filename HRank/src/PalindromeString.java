
public class PalindromeString {
	public static void main(String[] args) {
    StringBuilder SB=new StringBuilder("madam");
    StringBuilder SB1=new StringBuilder();
    SB1.append(SB.reverse());
    System.out.println(SB.reverse());
    if(SB.equals(SB1))
    	System.out.println("YES");
    else
    	System.out.println("NO");
    

}}
