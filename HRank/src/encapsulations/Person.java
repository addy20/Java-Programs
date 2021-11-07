package encapsulations;

public class Person {
	protected String name;
	Person(String name){
		this.name=name;
		System.out.println("Inside Person Constructor");
	}

	
    public void walk() {
    	System.out.println("Person is Walking");
	}
    public void eat() {
    	System.out.println(name+" is eating");
    }

}
