import java.text.NumberFormat;
public class Formatting_Numbers {
	public static void main(String[] args) {
		NumberFormat nf=NumberFormat.getInstance();
		
		nf.setMinimumFractionDigits(2);
		nf.setMaximumFractionDigits(4);
		nf.setMinimumIntegerDigits(3);
		double d=1.2;
		System.out.println(nf.format(d));

	}

}
