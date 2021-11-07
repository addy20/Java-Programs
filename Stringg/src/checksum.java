import java.io.*;
public class checksum {
public static int process(BufferedReader is) {
     int sum = 0;
try {
     String inputLine;
     while ((inputLine= is.readLine()) != null) 
     {
       int i;
       for(i=0; i<inputLine.length(); i++) 
       {
         sum += inputLine.charAt(i);
       }
      }
     }
catch (IOException e) 
 {
   throw new RuntimeException("IOException: " + e);
  }
  return sum;
}
public static void main(String args[])throws IOException{
	
    FileReader fr=new FileReader("Untitled 4.txt");
    BufferedReader br=new BufferedReader(fr);
    int a=process(br);
    System.out.println(a);
  }
}