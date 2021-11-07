package pack;

public class a6 {

	public static void main(String[] args) {
    String a="A quick bronze fox lept a lazy bovine";
	/*for(int i=0;i<a.length();i++)
	{
		System.out.println("Char "+i+" is "+a.charAt(i));
	}*/
	for(char ch:a.toCharArray()) {
		System.out.println(ch);
		
	}
	}

}
