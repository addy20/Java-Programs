package Encapsulation;

public class RepairShop {
    
	public static void repairCar(Car car) {
		System.out.println("Car is Repaired");
	}
	
	
	public static void main(String[] args) {
    WagonR wagonr=new WagonR();
    Audi audi=new Audi();
    repairCar(wagonr);
    repairCar(audi);
    
    
	}

}
