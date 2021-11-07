import java.util.regex.*;

public class sum_from_string {

	public static void main(String[] args) {
    String num="abc 123 xxxx 1 pqr 23";
    Pattern p=Pattern.compile("\\d+");
    Matcher m=p.matcher(num);
    int sum=0;
    while(m.find())
    {
    	
    	int number=Integer.parseInt(m.group());
    	sum+=number;
    	
    }
    System.out.println(sum);
	}

}
