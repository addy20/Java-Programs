
import java.text.*;
import java.time.*;
import java.time.format.*;
import java.util.*;
public class CurrentDateTime {
   public static void main(String[] args) {
   
	   String text="07:09:45PM";
	   DateFormat df12 = new SimpleDateFormat("hh:mm:ssa");
	    DateFormat df24 = new SimpleDateFormat("HH:mm:ss");
   
 
   try {
	System.out.println(df24.format(df12.parse(text)));
} catch (ParseException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
   
   
	   
	   
    }
}