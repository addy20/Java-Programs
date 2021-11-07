import java.util.LinkedList;


public class LinkedExample {
	String name;
	int age,roll;
	LinkedExample(String n,int a,int r)
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
     LinkedList<LinkedExample> l1=new LinkedList<LinkedExample>();
     l1.add(new LinkedExample("Aditya Singh",19,40));
     l1.add(new LinkedExample("Suresh Patra",19,42));
	 l1.add(new LinkedExample("Himansu Pradhan",19,45));
	 for(LinkedExample data:l1)
	 {
		 System.out.println(data.getName()+" "+data.getAge()+" "+data.getRoll());
	 }
	}

}
