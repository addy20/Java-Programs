import java.util.regex.*;

public class CanonicalEquivalence {

	public static void main(String[] args) {
		System.out.println(Pattern.compile("n\u0303").matcher("\u00f1").find());
		System.out.println(Pattern.compile("n\u0303",Pattern.CANON_EQ).matcher("\u00f1").find());
		System.out.println(Pattern.compile("\u00f1",Pattern.CANON_EQ).matcher("n\u0303").find());
		}

}
