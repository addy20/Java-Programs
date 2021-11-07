import java.util.regex.*;

class q1

{

public static void main(String args[])

{
//double input=45.13;
//String str[]=Double.toString(input).split("\\.");
//System.out.println("Decimal Number :"+input);
//System.out.println("Integer Part:"+str[0]);
//System.out.println("Fractional Part :"+str[1]);
//int num1=Integer.parseInt(str[0]);
//int num2=Integer.parseInt(str[1]);
//int sum=num1+num2;
//System.out.println(sum);
	Pattern p=Pattern.compile("\\d+");
	Matcher m=p.matcher("45.13");
	int sum=0;
	while(m.find())
	{
		int number=Integer.parseInt(m.group());
    	sum+=number;
	}
	System.out.println(sum);
	
	  
   }
}