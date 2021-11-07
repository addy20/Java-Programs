
public class starpattern1 {

	public static void main(String[] args) {
    String a="dgg";
    String b="ggd";
    boolean isAnagram=false;
    boolean visited[]=new boolean [b.length()];
    for(int i=0;i<a.length();i++)
    { isAnagram=false;
      
    	for(int j=0;j<b.length();j++)
    	{
    		if(b.charAt(j)==a.charAt(i)&&!visited[j])
    		{
    			isAnagram=true;
    			visited[j]=true;
    			break;
    			
    		}
    		
    	}
    }
    if(isAnagram)
    {
    	System.out.println("Anagram");
    }else
    	System.out.println("Not Anagram");
	}

}
