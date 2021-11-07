
public class Validating_a_Number {

	public static void main(String[] args) {
		
			String aNumber = "14578"; 
			int result;
			try { 
			     result = Integer.parseInt(aNumber);
			     System.out.println("Number is " + result);
			    }
			catch(NumberFormatException exc)
			    {
			System.out.println("Invalid number " + aNumber);
			return;
			    }
		}
	}


