
public class ReverseInteger {

	public static void main(String[] args) {
		int a=-123;
		
		 int temp = 0;
	        boolean isNegative = false;
	        if (a < 0) {
	            isNegative = true;
	            temp = -(a);
	            System.out.println(temp);
	        } else {
	            temp = a;
	        }
	        int rem = 0;
	        long res = 0;
	        while(temp > 0) {
	            rem = temp % 10;
	            res = (res * 10) + rem;
	            temp = temp /10;
	        }
	        if(res < Integer.MIN_VALUE || res > Integer.MAX_VALUE) {
	            System.out.println(0);
	        }
	        System.out.println(isNegative ? -((int)res) : (int)res);
	        

	}
}