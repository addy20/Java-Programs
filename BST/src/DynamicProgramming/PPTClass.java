package DynamicProgramming;

public class PPTClass {

	public static void main(String[] args) {
    int a=-7;
    int b=-15;
    
    int ans=a^b;
    int count=0;
//    while(ans!=0) {
//    	
//    	if((ans&1)==1) {
//    		count++;
//    	}
//    	ans=ans>>1;
//    }
//    System.out.println(count);
    
    if((a^b)<0) {
    	System.out.println("TRUE");
    }
	
	}
}
