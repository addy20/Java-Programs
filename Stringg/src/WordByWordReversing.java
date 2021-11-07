public class WordByWordReversing {

	public static void main(String[] args) {
    String a="My name is Aditya";
    char c[]=new char[a.length()];
    for (int i = 0; i < a.length(); i++) {
        c[i]=a.charAt(i);
    }
    reverseWords(c);
    
	}
	public static void reverseWords(char[] input) {
		reverse(input,0,input.length); //reversing the sentence
		int start=0;int end;
		while((end=find(input,' ',start))!=-1) {
			reverse(input,start,end);
			start=end+1;
		}
		reverse(input,start,input.length);
		System.out.println(input);
		
		
	}
	public static void reverse(char[] array,int start,int end) {
		int last=end-1;
		for(int i=start;i<=(start+last)/2;i++) {
			char temp=array[i];
			array[i]=array[last-i+start];
			array[last-i+start]=temp;
		}
		
	}
	public static int find(char array[],char c,int start) {
		for(int i=start;i<array.length;i++) {
			if(array[i]==c) {
				return i;
			}
		}
		return -1;
	}

}
