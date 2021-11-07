import java.util.*;
import java.text.*;
public class nthRoot {

	public static void main(String[] args) {
    Scanner ab=new Scanner(System.in);
    NumberFormat nf=NumberFormat.getInstance();
    nf.setMaximumFractionDigits(6);
    System.out.println("Enter the nth root");
    int n=ab.nextInt();
    System.out.println("Enter the number whose root you have to find :");
    int C=ab.nextInt();
    double x=C/2;
    
    double x1=0;
    for(int i=1;i<=100;i++)
    {   
    	double fx=Math.pow(x, n)-C;
        double ffx=(n*Math.pow(x, n-1));
        x1=x-(fx/ffx);
    	x=x1;
    }
    System.out.println(nf.format(x1));
    
	}

}
