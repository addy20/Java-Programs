
public class EncodingDecoding {

	public static void main(String[] args) {
		System.out.println(Encoding("aaaabcccaa"));
		System.out.println(rabinKarp("abachaafgkaekg","ekg"));

	}
	public static String Encoding(String s) {
		StringBuilder res=new StringBuilder();
		for(int i=0;i<s.length();i++) {
			int count=1;
			while(i+1<s.length() && s.charAt(i)==s.charAt(i+1)) {
				i++;
				count++;
			}
			res.append(count);
			res.append(s.charAt(i));
		}
		return res.toString();
	}
	public static String Decoding(String s) {
		int count =0;
		StringBuilder res=new StringBuilder();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
		if(Character.isDigit(ch)) {
			count=count*10+ ch-'0';
		}else {
			while(count>0) {
				res.append(ch);
				count--;
			}
		}	
		}
		return res.toString();
	}
	public static int rabinKarp(String t, String s){
		if (s.length() > t.length()) {
		return -1; 
		}
		final int BASE = 10;
		int tHash = 0, sHash = 0 ; // Hash codes for the substring of t and s.
		int powerS = 1; 
		for (int i = 0; i < s.length(); i++) {
		powerS = i > 0 ? powerS * BASE : 1;
		tHash = tHash * BASE + t.charAt(i);
		sHash = sHash * BASE + s.charAt(i);
		}
		for (int i=s.length();i<t.length();i++) {
		if (tHash == sHash && t.substring(i-s.length(),i).equals(s))
		{
		  return i - s.length(); 
		}
		
		tHash=tHash-t.charAt(i-s.length()) * powerS;
		tHash =tHash * BASE + t.charAt(i);
		}
		
		if (tHash == sHash && t.substring(t.length()-s.length()).equals(s)) 
		{
		return t.length()-s.length();
		}
		
		return -1;

}
	}
