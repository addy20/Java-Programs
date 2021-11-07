import java.text.ChoiceFormat;

public class Formatting_With_Correct_Plurals {

	
		
			//public static void main(String[] argv) {
			//report(0);
			//report(1);
			//report(2);
			//}
			/** report -- using conditional operator */
			//public static void report(int n) {
			//System.out.println("We used " + n + " item" + (n==1?"":"s"));
			//The final println statement is effectively equivalent to:
			//if (n==1)
			//System.out.println("We used " + n + " item");
			//else
			//System.out.println("We used " + n + " items");
			//}
			
	        static double[] limits= {0,1,2};
	        static String[] formats= {"reviews","review","reviews"};
	        static ChoiceFormat pluralizedFormat=new ChoiceFormat(limits,formats);
	        static int[] data= {-1,0,1,2,3};
	        public static void main(String[] argv) {
	        	System.out.println("Pluralized Format");
	        	for(int i:data)
	        	{
	        		System.out.println("Found"+i+""+pluralizedFormat);
	        	}
	        }
	        

}
