public class Floatcmp {
final static double EPSILON = 0.0000001;
public static void main(String[] argv) {
double da = 3 * .3333333333;
double db = 0.99999992857;
if (da == db) {
System.out.println("Java considers " + da + "==" + db);
} else if (equals(da, db, 0.0000001)) {
System.out.println("Equal within epsilon " + EPSILON);
} else {
System.out.println(da + " != " + db);
}
}

public static boolean equals(double a, double b, double eps) 
{
   if (a==b) return true;
   return Math.abs(a - b) < eps;
}
public static boolean equals(double a, double b) {
return equals(a, b, EPSILON);

  }}