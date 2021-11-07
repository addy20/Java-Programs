package pack;

public class a5 {

	public static void main(String[] args) {
    StringBuilder str1=new StringBuilder("Aditya Singh");
    System.out.println("String 1 ="+str1);
    System.out.println("Old Capacity ="+str1.capacity());
    //16(default)+12=28
    str1.ensureCapacity(30);
    /* if given ensure capacity is less than old capacity then new capacity will be same as old capacity
        if ensure capacity is greater then we have to multiply 2 with old capacity and add 2 then the value will be the new capacity*/ 
    System.out.println("New Capacity ="+str1.capacity());
    
    
	}

}
