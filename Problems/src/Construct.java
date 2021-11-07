class Vehicle{
	int wheels;
	String name;
	Vehicle(int wheels){
		this.wheels=wheels;
	}
	Vehicle(int wheels,String name){
		this.name=name;
		this.wheels=wheels;
	}
}
public class Construct {
	
	Construct(){
		System.out.println("object is now created");
	}

	public static void main(String[] args) {
    Vehicle car=new Vehicle(7);
    Vehicle car1=new Vehicle(8,"Harry");
    System.out.println(car1.wheels+" wheels");
    
	}

}
