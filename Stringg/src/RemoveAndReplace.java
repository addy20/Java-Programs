
public class RemoveAndReplace {

	public static void main(String[] args) {
    char c[]= new char[20];
    c[0]='a';
    c[1]='b';
    c[2]='a';
    c[3]='c';
    int size=4;
    System.out.println(ReplaceAndRemove(size,c));
		
	}
	public static int ReplaceAndRemove(int size,char[] c)
	{
		int WI=0,aCount=0;
		for(int i=0;i<size;i++)
		{
			
			if(c[i]!='b') {
				c[WI++]=c[i];
			}
			if(c[i]=='a')
			{
				aCount++;
			}
		}
		int CI=WI-1;
		WI=WI+aCount-1;
		final int finalSize=WI+1;
		while(CI>=0) {
			if(c[CI]=='a') {
				c[WI--]='d';
				c[WI--]='d';
			}else {
				c[WI--]=c[CI];
			}
			CI--;
		}
		for(char s:c) {
			System.out.println(s+" ");
		}
		return finalSize;
	}

}
