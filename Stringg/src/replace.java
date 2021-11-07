
public class replace {

	public static void main(String[] args) {
		
		Integer iOnb=new Integer("10.2");
		System.out.println(iOnb);
		String str= new String("college");
		System.out.print("String after replacing all 'l' with 'm' :");
		System.out.println(str.replace('l', 'm'));
		System.out.println("print str");
		System.out.println(str);
		str=str.replace('l', 'm');
		System.out.println(str);
	}

}
