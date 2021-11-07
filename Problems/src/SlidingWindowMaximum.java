import java.util.*;
public class SlidingWindowMaximum {

	public static void main(String[] args) {
    int []a= {5,3,7,8,1,2,6};
    int k=3;
    System.out.println(maxSlidingWindow(a,k));
    Deque<Integer> dq=new LinkedList<>();
    dq.add(45);
    dq.add(8);dq.add(12);dq.add(7);dq.add(455);dq.add(5);
    System.out.println(dq);
    dq.pop();
    System.out.println(dq.peekLast());
    
    
    
    
	}
	
	    public static int[] maxSlidingWindow(int[] a,int k) {
	    	int nge[]=new int[a.length];
	    	Stack<Integer> st=new Stack<>();
	    	int ans[]=new int[a.length-k+1];
	    	
	    	
	    	
	    	st.push(a.length-1);
	    	nge[a.length-1]=a.length;
	    	
	    	for(int i=a.length-2;i>=0;i--) {
	    		while(st.size()>0 && a[i] >= a[st.peek()]) {
	    			st.pop();
	    		}
	    		if(st.size()==0) {
	    			nge[i]=a.length;
	    		}else {
	    			nge[i]=st.peek();
	    		}
	    		st.push(i);
	    	}
	    	int j=0;
	    	for(int i=0;i<=a.length-k;i++) {
	        if(j<i) {
	        	j=i;
	        }
	        while(nge[j] < i + k){
	            j = nge[j];
	          }  
	            ans[i] = a[j];
	          }
	         return(ans);
	    	
	    }
	}


