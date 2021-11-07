import java.text.*;
import java.util.*;
public class Temperature {

	public static void main(String[] args) {
    Scanner ab=new Scanner(System.in);
    int n=ab.nextInt();
    NumberFormat nf= new DecimalFormat("0.00");
    System.out.println("Fahrenheit        Celsius");
    for(int i=1;i<=n;i++)
    {
    	double temp=ab.nextDouble();
        System.out.print(temp);
        double celsius=((temp-32)*5)/9;
        System.out.print("              "+nf.format(celsius));   
    }
     
	}

}
