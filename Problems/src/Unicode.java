import java.util.regex.Pattern;

public class Unicode {

	public static void main(String[] args) {
		System.out.println(Pattern.compile("\u00de",Pattern.CASE_INSENSITIVE|Pattern.UNICODE_CASE).matcher("\u00fe").find());
		System.out.println(Pattern.matches("\\D*","abc"));
		System.out.println(Pattern.compile("\\b[az]+\\b",Pattern.CASE_INSENSITIVE).matcher("Good Better Best").find());
	}

}
