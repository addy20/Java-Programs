import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JumpArray {

	public static void main(String[] args) {
		List<Integer> n1=new ArrayList<Integer>();
        Collections.addAll(n1,2,4,1,1,0,2,3);
		System.out.println(canReachEnd(n1));
    
	}
	public static boolean canReachEnd(List<Integer> A) {
		int F =0, lastlndex=A.size() - 1;
		for (int i=0; i<=F&&F<lastlndex;
		++i) {
		F=Math.max(F,i+A.get(i));
		}
		return F >= lastlndex;
		}

}
