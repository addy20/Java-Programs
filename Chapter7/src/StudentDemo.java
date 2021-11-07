import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
class namecomp implements Comparator<StudentDemo>{
	   public int compare(StudentDemo s1,StudentDemo s2){
		   
	        return (s1.name).compareTo(s2.name);
	    }
	}

public class StudentDemo {
	String name;
	int age,roll;
	StudentDemo(String n,int a,int r)
	{
		this.name=n;
		this.age=a;
		this.roll=r;
	}
	public String getName(){
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getRoll() {
		return roll;
	}

	public static void main(String[] args) {
     LinkedList<StudentDemo> l1=new LinkedList<StudentDemo>();
     l1.add(new StudentDemo("Aditya ",19,45));
     l1.add(new StudentDemo("Suresh ",19,42));
     l1.add(new StudentDemo("Himansu ",19,48));
	 //Comparator<StudentDemo> cm2=Comparator.comparing(StudentDemo::getName);
	 //Collections.sort(l1,cm2);
	 l1.sort(new namecomp());
	 //Collections.sort(l1,new namecomp());
	 System.out.println("Name   Age   Roll");
	 for(StudentDemo data:l1)
	 {
		 System.out.println(data.getName()+" "+data.getAge()+"   "+data.getRoll());
	 }
	 
	 
	}

}
