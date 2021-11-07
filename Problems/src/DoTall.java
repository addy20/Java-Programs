import java.util.regex.Pattern;

public class DoTall {

	public static void main(String[] args) {
		System.out.println(Pattern.compile("The.*Sentence").matcher("The is \n the Sentence").find());
		System.out.println(Pattern.compile("The.*Sentence",Pattern.DOTALL).matcher("The is \\n the Sentence").find());
		System.out.println(Pattern.compile("The.*Sentence",Pattern.MULTILINE|Pattern.DOTALL).matcher("The is \\n the Sentence").find());
		System.out.println(Pattern.compile("[a-zA-Z ]*(?:\\d)+.*").matcher("1 bye").find());
		System.out.println(Pattern.compile("[a-zA-Z ]*\\d+.*").matcher("11").find()); 
	}

}
