import java.lang.*;

public class DoubleDemo {

   public static void main(String[] args) {

      Double d = new Double(6.5555);
      String str = "55";

      /* returns a Double object holding the value represented 
         by str */
      System.out.println("Value = " +  d.valueOf(str));
   }
}  