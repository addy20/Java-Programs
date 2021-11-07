//Printing all occurence of a Pattern
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReaderIter {

	public static void main(String[] args) throws IOException 
	{
         Pattern p=Pattern.compile("[A-Za-z][a-z]+");
         
         BufferedReader r=new BufferedReader(new FileReader("Text.txt"));
         String line;
         while((line=r.readLine())!=null)
         {
    	     Matcher m=p.matcher(line);
    	     while(m.find())
    	       {
    	    	 int start=m.start();
    	         int end=m.end();
    	         System.out.println(line.substring(start,end));
    	         //also System.out.println(m.group());
               }
         }
   }
}
 