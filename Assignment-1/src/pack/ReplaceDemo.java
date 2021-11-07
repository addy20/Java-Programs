
package pack;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class ReplaceDemo {
public static void main(String[] argv) {
String patt = "favor";
String input = "Do me a favor? Fetch my favorite.";
System.out.println("Input: " + input);
Pattern r = Pattern.compile(patt);
Matcher m = r.matcher(input);
System.out.println("ReplaceAll: " + m.replaceAll("favour"));

}}
