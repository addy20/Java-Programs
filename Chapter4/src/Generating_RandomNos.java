import java.util.Random;

public class Generating_RandomNos {

	public static void main(String[] args) {
    Random r=new Random();
    for(int i=0;i<10;i++)
    {
    	//System.out.println((int)(Math.random() * 10 + 1));
    	System.out.println(1+r.nextInt(10));
    }
	}

}
