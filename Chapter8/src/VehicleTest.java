class Vehicle{
	String model;
	int yOP;
	String manufacturer;
	public Vehicle(String model,int yOP,String manufacturer) {
		this.model=model;
		this.yOP=yOP;
		this.manufacturer=manufacturer;
	}
}
public class VehicleTest {

	public static void main(String[] args) {
    Vehicle x=new Vehicle("Dzire",2002,"Maruti");
    Vehicle y=new Vehicle("Dzire",2002,"Maruti");
    Vehicle z=new Vehicle("Dzire",2002,"Maruti");
    int correctCases=0;
    if(x.equals(x))
    {
    	System.out.println("It is reflexive!");
    	correctCases++;
    }
    else {
    	System.out.println("It is not reflexive");
    }
    if(x.equals(y)==y.equals(x)) {
    	System.out.println("It is symmetric!");
    	correctCases++;
    }else {
    	System.out.println("It is not symmetric");
    }
    boolean cause1=x.equals(y)&&y.equals(x);
    if(cause1==x.equals(z)) {
    	System.out.println("It is transitive!");
    	correctCases++;
    }else {
    	System.out.println("It is not transitive");
    }
    if(x.equals(null)==false) {
    	System.out.println("Nothing equals null");
    	correctCases++;
    }
    else {
    	System.out.println("An object equals null?!");
    }
    System.out.println(correctCases);
	}

}
