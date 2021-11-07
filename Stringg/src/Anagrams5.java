
public class Anagrams5 {

	public static void main(String[] args) {
	boolean isAnagram=true;
	String s1="caat";
    String s2="ataa";
    
		int al[]=new int[256];
    for(char c:s1.toLowerCase().toCharArray()) 
    {
    	int index=(int)c;
        al[index]++;
    }
    for(char c:s2.toLowerCase().toCharArray()) {
    	int index=(int)c;
    	al[index]--;
    }
    for(int i=0;i<256;i++) {
    	if(al[i]!=0) {
    		isAnagram = false;
    		break;
    	}
    }
    if(isAnagram) {
		System.out.println("Anagram");
	}else
		System.out.println("Not Anagram");
    }

}
