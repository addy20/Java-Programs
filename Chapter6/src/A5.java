import java.util.*;
import java.time.*;
public class A5 {

	public static void main(String[] args) {
    Scanner ab=new Scanner(System.in);
    System.out.println("Enter the Month");
    int month=ab.nextInt();
    System.out.println(Month.of(month).maxLength());
	}

}
