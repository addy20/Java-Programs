package encapsulations;

public class Teacher extends Person{
	Teacher(String name){
		super(name);
		this.name=name;
	}
	public void teach() {
	System.out.println("teacher is teaching");
}
public void eat() {
	super.eat();
	System.out.println(name+" is eating");
}
}
