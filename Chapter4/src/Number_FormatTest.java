import java.text.*;
public class Number_FormatTest {

	public static void main(String[] args) {
    //NumberFormat ourForm=new DecimalFormat("###.##");
		//NumberFormat nf=NumberFormat.getInstance();
		//nf.setMinimumIntegerDigits(4);
    NumberFormat ourForm=new DecimalFormat("##,###.##");	
    double d=12467.45;
    System.out.println(ourForm.format(d));
   // System.out.println(nf.format(d));
	}

}
