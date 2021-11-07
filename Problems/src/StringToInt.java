
public class StringToInt {

	public static void main(String[] args) {
    String num="314";
    System.out.println("String to Integer :"+StringInt(num));
	}
	public static int StringInt(String s)
	{
		int finalDigits=0;
		for(int i=s.charAt(0)=='-'?1:0;i<s.length();i++)
		{
			int digits=s.charAt(i)-'0';
			finalDigits=finalDigits*10+digits;
		}
		return s.charAt(0)=='-'?-finalDigits:finalDigits;
	}
	public static String IntString(int x)
	{
		boolean isNegative = false;
		if(x<0)
		{
		isNegative=true;	
		}
		StringBuilder sb=new StringBuilder();
		while(x>0)
		{
			sb.append(Math.abs(x%10));
			x=x/10;
		}
		if(isNegative)
		{
			sb.append('-');
		}
		sb.reverse();
		return sb.toString();
	}

}
