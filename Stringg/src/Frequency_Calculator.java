
public class Frequency_Calculator
{
   public static void main(String args[])
   {
        String str="AdityaSingh";
        str=str.toLowerCase();
        for(char c='a'; c<='z'; c++)
        {
           int k=0;
            for(int j=0; j<str.length(); j++)
            {
            	
                if(str.charAt(j) == c)
                {
                    k++;
                }
            }
            if(k>0)
            {
                System.out.println("The character " + c + " has occurred for " + k + " times");
            }
        }
   }
}