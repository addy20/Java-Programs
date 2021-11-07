import java.util.*;
public class LoanTable {

	public static void main(String[] args) {
		Scanner ab=new Scanner(System.in);
		 
		 
		 int num_payments;    // length of the loan  
		 int Principle;      // amount of the loan    
		 double InterestRate;
		 double i, n, p;
		 double PaymentAmount;      
		    System.out.println("Please enter loan amount: ");
		    p=ab.nextDouble();
		 System.out.println("Please enter annual interest rate: ");
		 InterestRate=ab.nextDouble();
		 System.out.println("Please enter the number of payments: ");
		 num_payments=ab.nextInt();
		    i = InterestRate/12;  
		    n = num_payments;  
		      
		 while (num_payments>0)
		 {
		  PaymentAmount = (i*p)/(1-Math.pow((1+i),-n));
		  p = p - PaymentAmount + ((i/100)*p);
		  n = n-1;
		 System.out.println("Number of Payments:  Amount per payment:" +num_payments +" "+PaymentAmount);
		  num_payments = num_payments - 1;
		 } 
		           
		}		
	
	
	}
	

