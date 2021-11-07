import java.io.*;
public class TextFormatter {
	public static void main(String[] args)throws Exception {
    FileReader fr=new FileReader("textout");
    BufferedReader br=new BufferedReader(fr);
    StringBuilder sb=new StringBuilder();
    StringBuilder sbb=new StringBuilder();
    String line=br.readLine();
    while(line!=null)
    {
    	sb.append(line);
    	sb.append(" ");
    	line=br.readLine();
    }
    sb.append('\n');
    System.out.println(sb);
	
	int i;
	int count=0; 
	for(i=0;sb.charAt(i)!='\n';i++)
	{
		count++;
		
		sbb.append(sb.charAt(i));
		if(count==10)
		{
			sbb.append('\n');
			count=0;
		}
	}
	System.out.print(sbb);
	br.close();
	fr.close();

}}
