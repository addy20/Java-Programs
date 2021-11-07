import java.io.*;
public class TesxtFormatter{
public static void main(String args[])throws Exception{
   FileReader fr=new FileReader("textout");
   BufferedReader br=new BufferedReader(fr);
   StringBuilder sb= new StringBuilder();
   StringBuilder sb1 = new StringBuilder();
   String line = br.readLine();
   while (line != null) 
   {
        sb.append(line);
        sb.append(" ");
        line = br.readLine();
   }
   sb.append('\t');
   System.out.print(sb);
   int i; int count=0;
   for(i=0; sb.charAt(i)!='\t';i++)
   {
     count++;
     sb1.append(sb.charAt(i));
     if(count==10)
      {
         sb1.append('\n');
         count=0;
      }
   }
   System.out.print(sb1);
   br.close();
   fr.close();
}
}