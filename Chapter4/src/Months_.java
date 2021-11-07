import java.util.*;
public class Months_ {

	public static void main(String[] args) {
    String months[]= {"January", "February", "March", "April",
    		"May", "June", "July", "August",
    		"September", "October", "November", "December"};
    for(int i=0;i<months.length;i++)
    {
    	System.out.println("Months is "+months[i]);
    }
    BitSet b = new BitSet();
    b.set(0); // January
    b.set(3); // April
    b.set(8); // September
    for (int i = 0; i<months.length; i++) 
        {
    	if (b.get(i))
    	System.out.println("Month " + months[i]);
    	}
    }

}
