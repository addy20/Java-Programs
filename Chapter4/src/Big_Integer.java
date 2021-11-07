import java.math.BigDecimal;
import java.math.BigInteger;

public class Big_Integer {

	public static void main(String[] args) {
  //BigInteger bi=new BigInteger("1234455666666");
  //BigInteger bi=new BigInteger("-1234455666666");
  //System.out.println(bi);
  //System.out.println(bi.abs());
		//BigInteger to BigDecimal
		BigInteger bi1=new BigInteger("1234455666456");
		BigInteger bi2=new BigInteger("1234455666456");
		BigInteger bi3=bi1.add(bi2);
		
		BigInteger bi4=bi1.subtract(bi2);
		System.out.println("Sum of big integer= "+bi3);
		System.out.println("Subtract of big integer= "+bi4);
	}

}
