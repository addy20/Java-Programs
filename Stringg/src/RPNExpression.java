import java.util.*;

public class RPNExpression {

	public static void main(String[] args) throws Exception {
		String exp="3,4,+,6,*,6,/";
		System.out.println(eval(exp));

	}
	public static int eval(String exp) throws Exception{
		Deque<Integer> dq=new LinkedList<>();
		String [] tokens=exp.split(",");
		for(String num:tokens) {
			if(num.length()==1&&"/*+-".contains(num)) {
				int y=dq.removeFirst();
				int x=dq.removeFirst();
				switch(num.charAt(0)) {
				case '+':
					dq.addFirst(x+y);
					break;
				case '*':
					dq.addFirst(x*y);
					break;
				case '/':
					dq.addFirst(x/y);
					break;
				case '-':
					dq.addFirst(x-y);
					break;
				default:
					throw new Exception("Invalid operator");
				}
			}else {
				dq.addFirst(Integer.parseInt(num));
			}
		}
		return dq.removeFirst();
	}

}