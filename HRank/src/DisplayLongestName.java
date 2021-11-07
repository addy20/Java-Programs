
public class DisplayLongestName {
	public static void main(String []args)
	{
		String [] names={"Harsh",
				"Gaurav",
				"GauravMiglani"
				,"HarshAgarwal",
				"GeeksforGeeksGeeks"
				,"Programmiz"};
		int max=names[0].length();
        int count=0;
        for(int i=1;i<6;i++)
        {
            if(names[i].length()>=max)
            {
                max=names[i].length();
                count++; 
            }
        }
        String s=names[count];
        System.out.println(s+""+count);
    
	}

}
