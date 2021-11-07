import java.util.regex.*;

public class Reversing {

	public static void main(String[] args) {
     String k="aditya is a good boy";
     String ab []=k.split("\\s");
     int maxx=ab[0].length();
     System.out.println(maxx);
     String result="";
     for(int i=0;i<ab.length;i++)
     {
    	 if(i==ab.length-1)
    	 {
    		 result=ab[i]+result;
    	 }else {
    		 result=" "+ab[i]+result;
    	 }
     }
     System.out.println(result);
		
		
	}

}
