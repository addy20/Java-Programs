import java.io.*;
        class Student_Demo
            {
              public static void main(String args[])throws IOException{
              String get;
              int n,i;
              BufferedReader d= new BufferedReader(new InputStreamReader(System.in));
              System.out.println("Enter the Number of Students:");
              get=d.readLine();
              n=Integer.parseInt(get);
              Academic a[] = new Academic[10];
              
              for(i=0;i<n;i++)
             {
                a[i]=new Academic();
                System.out.println("Enter the detail of student" +(i+1));
                a[i].getdetail();
             }
for(i=0;i<n;i++)
a[i].printdetail();
}
}
class personal
{
String name,regno,address,email,phone;
void getdetail()throws IOException
{
BufferedReader b= new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the name:");
name=b.readLine();
System.out.println("Enter the regno");
regno=b.readLine();
System.out.println("Enter the address");
address=b.readLine();
System.out.println("Enter the email id");
email=b.readLine();
System.out.println("Enter the phone no");
phone=b.readLine();
}
void printdetail()
{
System.out.println("Personal Detail");
System.out.println("Name:"+name);
System.out.println("Address:"+address);
System.out.println("Email:"+email);
}
}
class Academic extends personal
{
int total,avg,i;
int mark[]=new int[4];
String get;
void getdetail()throws IOException
{
super.getdetail();
int i;
total=0;
BufferedReader d= new BufferedReader(new InputStreamReader(System.in));
for(i=1;i<=3;i++)
{
System.out.println("Enter the marks"+i);
//get=d.readLine();
mark[i]=Integer.parseInt(d.readLine());
total=total+mark[i];
}
avg=total/3;
}
void printdetail()
{
super.printdetail();
System.out.println("Academic Detail");
for(i=1;i<=3;i++)
System.out.println("mark:"+mark[i]);
System.out.println("Total"+total);
System.out.println("Average:"+avg);
}
}