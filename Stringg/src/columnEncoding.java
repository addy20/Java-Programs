
public class columnEncoding {

	public static void main(String[] args) {
     String col="ZZ";
     System.out.println(DecodeColID(col));
	}
	public static int DecodeColID (final String col) {
		int result =0;
		for (int i=0;i<col.length();i++) {
		char c =col.charAt (i) ;
		result =result * 26 + c -'A' + 1;
		}
		return result;
		}

}
