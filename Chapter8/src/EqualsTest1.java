import java.util.*;
class Employee{
	private int id;

void setId(int x) {
	id=x;
}
int getId()
{
	return (id);
	}
public boolean equals(Object o) {
	if(o==null)
	{
		return false;
	}
	if(o==this)
	{
		return true;
	}
	if(getClass()!=o.getClass())
	{
		return false;
	}
	Employee e=(Employee)o;
	return (this.getId()==e.getId());
}
}


public class EqualsTest1 {

	public static void main(String[] args) {
    Employee e1=new Employee();
    Employee e2=new Employee();
    e1.setId(100);
    e2.setId(100);
    System.out.println(e1.equals(e2));
    Set<Employee> employees=new HashSet<Employee>();
    employees.add(e1);
    employees.add(e2);
    System.out.println(employees);
	}
	

}
