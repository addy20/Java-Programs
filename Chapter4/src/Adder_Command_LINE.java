import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Adder_Command_LINE {
	public static void main(String[] args) {
		NumberFormat nf= new DecimalFormat("0.00");	
		if(args.length<2)
				System.err.println("error");
			else
				{
				float num=0;		
				
				for(int i=0; i<args.length; i++)
			{   
				num+= Float.parseFloat(args[i]);
			    
			}
			System.out.println("The sum is " + nf.format(num));
		}
	}
	
}


