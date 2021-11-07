
public class ImplC {

	public static void main(String[] args) {
		
		String a="w ";
		System.out.println(a.charAt(a.length()-1)
				);
		
		System.out.println(a.length()-a.lastIndexOf(" ")-1);
		StringBuilder sb=new StringBuilder();
		StringBuilder ans1=new StringBuilder();
		for(int i=0;i<a.length();i++) {
			char ch=a.charAt(i);
			if(Character.isAlphabetic(ch) || Character.isSpaceChar(ch)) {
				sb.append(ch);
				continue;
			}
			if(Character.isDigit(ch)) {
				sb.append(a.charAt(i-1));
				continue;
			}
		}
		String[] ans=sb.toString().split("\\s");
		for(int i=ans.length-1;i>=0;i--) {
			ans1.append(ans[i]);
			ans1.append(" ");
		}
		System.out.println(ans1);

	}

}
