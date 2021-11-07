
public class Conversion {

	public static void main(String[] args) {
     
    /*Conversion of integer to anytype
      int i=42;
     String res1=Integer.toString(i,2);
     String res2=Integer.toString(i,8);
     String res3=Integer.toString(i,16);
     String res4=Integer.toString(i,10);
     System.out.println("Binary value of "+i+" is "+res1);
     System.out.println("Octal value of "+i+" is "+res2);
     System.out.println("Hexadecimal value of "+i+" is "+res3);
     System.out.println("Decimal value of "+i+" is "+res4);
	}
	*/
    //Conversion of anytype to anytype 
		String str="1010";
     Integer Obj=Integer.parseInt(str,16);
     System.out.println("Hexadecimal value is "+Obj);
     Integer Obj1=Integer.parseInt(str,8);
     System.out.println("Octal value is "+Obj1);
     Integer Obj2=Integer.parseInt(str,10);
     System.out.println("Decimal value is "+Obj2);
     

	}}
