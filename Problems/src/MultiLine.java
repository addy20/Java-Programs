import java.util.regex.*;

public class MultiLine {

	public static void main(String[] args) {
		Pattern P=Pattern.compile("^T.*e",Pattern.MULTILINE);
		Matcher M=P.matcher("The First Line \nThe Second Line");
		//System.out.println(Pattern.compile("^T.*e").matcher("The First Line \nThe Second LIne").find());
		//System.out.println(Pattern.compile("^T.*e$").matcher("The First Line \nThe Second LIne").find());
		//System.out.println(Pattern.compile("^T.*e$",Pattern.MULTILINE).matcher("The First Line \nThe Second LIne").find());
		while(M.find())
		{
			System.out.println(M.start()+"....."+M.end()+"....."+M.group());
		}
		
	}

}
