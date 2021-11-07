
public class EnsuringCapacity {

	public static void main(String[] args) {
    
		StringBuilder str1=new StringBuilder("Rashmi Rekha Sahoo");
        System.out.println("string1= "+str1);
        System.out.println("Old Capacity= "+str1.capacity());
        str1.ensureCapacity(40);
        System.out.println("New Capacity= "+str1.capacity());
        System.out.println();
    
    
    StringBuilder str2=new StringBuilder("Compile Online");
    System.out.println("string2= "+str2);
    System.out.println("Old Capacity= "+str2.capacity());
    str2.ensureCapacity(29);
    System.out.println("New Capacity= "+str2.capacity());
	}

}
