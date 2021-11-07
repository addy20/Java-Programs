public class ToStringWithout {
     int x,y;
     
     public ToStringWithout(int anX,int aY)
     {
    	 x=anX;
    	 y=aY;
     }
	public static void main(String[] args) 
	{
    System.out.println(new ToStringWithout(42, 86));
	}

}