import java.util.*;
import java.util.Stack;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String arrs[]= {""};
		for(String e:arrs) {
			System.out.print(e+" ");
		}
//		System.out.println();
//		System.out.println(longestCommonPrefix(arrs));
		System.out.println(isValid("(])"));
		

	}
	public static String longestCommonPrefix(String[] strs) {
		
		int max = 200;
        for(int i=0;i<strs.length;i++) {
			if(strs[i].length()<max) {
				max=strs[i].length();
			}
		}
        String first=strs[0];
        int min=200;
        for(int i=1;i<strs.length;i++) {
        	int count=0;
        	for(int j=0;j<max;j++) {
        		if(first.charAt(j)!=strs[i].charAt(j)) {
        			break;
        		}
        		else {
        			count++;
        		}
        	}
        	
        	min=count<min?count:min;
        }
        return first.substring(0,min);
    }
public static boolean isValid(String s) {
Deque<Character> stack=new ArrayDeque<>();
        
        if(s.charAt(0)==')'||s.charAt(0)==']'||s.charAt(0)=='}'){
            return false;
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{')
            {
               stack.push(s.charAt(i));
               continue;
            }
            	if(stack.isEmpty()) {
            		return false;
            	}
            
            
            		if(s.charAt(i)==')'&&stack.peek()=='(') {
            			stack.pop();
            		}else if(s.charAt(i)==']'&&stack.peek()=='[')
            		{
            			stack.pop();
            		}else if(s.charAt(i)=='}'&&stack.peek()=='{') {
            			stack.pop();
            		}else {
            			return false;
            		}
            	}
            
            
        if(!stack.isEmpty()){
           return false;
        }else {
        	return true;
        }
         
        }
    }



