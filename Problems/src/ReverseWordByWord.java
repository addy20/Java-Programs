
public class ReverseWordByWord {

	public static void main(String[] args) {
		String a="I love Java So Much";
		String arr[]=a.split("\\s");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
