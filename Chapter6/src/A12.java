import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class A12 {  
   public static void main(String[] args)
    {
	   Scanner sc=new Scanner(System.in);
       DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
       DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("dd-MM-yyyy");
       System.out.println("Enter date1 in dd-MM-YYYY format with time1 in HH:mm:ss format");
       String d1=sc.nextLine();
       LocalDateTime date1=LocalDateTime.parse(d1,dtf);
       System.out.println("Enter date2 in dd-MM-YYYY format with time1 in HH:mm:ss format");
       String d2=sc.nextLine();
LocalDateTime date2=LocalDateTime.parse(d2,dtf);
       // System.out.println(date1+"\n"+date2);
       Duration diff=Duration.between(date1,date2);
       System.out.printf("diff between %s and %s in hours is %s%n",dtf2.format(date1),dtf2.format(date2),diff.toHours());
       System.out.printf("diff between %s and %s in minutes is %s%n",dtf2.format(date1),dtf2.format(date2),diff.toMinutes());
       System.out.printf("diff between %s and %s in seconds is %s%n",dtf2.format(date1),dtf2.format(date2),diff.toSeconds());
       System.out.printf("diff between %s and %s in Millis %s%n",dtf2.format(date1),dtf2.format(date2),diff.toMillis());
       System.out.printf("diff between %s and %s in Nano is %s%n",dtf2.format(date1),dtf2.format(date2),diff.toNanos());

  }
}
