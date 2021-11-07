class Vehicle{
	int wheels,headLights;
	String color;
	Vehicle(int wheels){
		this.wheels=wheels;
		
		headLights=2;
	}
	Vehicle(int wheels,String color)
	{
		this.wheels=wheels;
		this.color=color;
	}
}
public class MyConstructor {
     MyConstructor()
     {
		System.out.println("object is created");
	 }

	public static void main(String[] args) {
    //MyConstructor obj=new MyConstructor();
	Vehicle car=new Vehicle(4);
	Vehicle scooty=new Vehicle(2);
    Vehicle eRickshaw=new Vehicle(3,"Yellow");
    System.out.println(eRickshaw.wheels+" "+eRickshaw.color);
    
	}

}
