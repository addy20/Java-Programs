import java.time.*;

public class TimeExample {
public static void main(String[] args) {

LocalTime time = LocalTime.now();
LocalDate date=LocalDate.now();
System.out.println("Current Time=" +time);

LocalTime specificTime = LocalTime.of(12,20,25,40); 
System.out.println("Specific Time of Day="+specificTime);

LocalTime timeKolkata = LocalTime.now(ZoneId.of("Asia/Kolkata"));
System.out.println("Current Time in IST= "+timeKolkata);
	

   }
}