import java.util.regex.*;
public class MaximumNumericValue {

	public static void main(String[] args) {
		String regex = "\\d+"; 
        
        Pattern p = Pattern.compile(regex); 
          
        Matcher m = p.matcher("123 aditya 45 aditya 562"); 
        int max = 0; 
          
        while(m.find()) 
        { 
            int num = Integer.parseInt(m.group()); 
            if(num > max) 
                max = num; 
        } 
           
        System.out.println(max);     
	}

}
