import java.time.*;
import java.time.temporal.TemporalAdjusters;
public class A14{
public static void main(String[] args)
     {
		 LocalDate dt = LocalDate.now();    
		 System.out.println("\nNext Friday: "+dt.with(TemporalAdjusters.next(DayOfWeek.FRIDAY)));
	     System.out.println("Previous Friday: "+dt.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY))+"\n");
		    }
		
	}


