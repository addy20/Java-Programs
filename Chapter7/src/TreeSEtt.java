import java.util.TreeSet;

public class TreeSEtt {

	public static void main(String[] args) {
    TreeSet<String> ts=new TreeSet<String>();
    ts.add("xyz");
    ts.add("abc");
    ts.add("pqr");
    ts.forEach(name-> System.out.println(name));
	}

}
