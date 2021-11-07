import java.util.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
public class TimeConversion {

	public static void main(String[] args) {
    String time="12:00:00AM";
    DateFormat in=new SimpleDateFormat("hh:mm:ssa");
    DateFormat out=new SimpleDateFormat("HH:mm:ss");
    Date d=null;
    try {
		d=in.parse(time);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    System.out.println(out.format(d));
    
	}

}
