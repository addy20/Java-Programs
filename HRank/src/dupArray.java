
public class dupArray {

	public static void main(String[] args) {
		int[] a= {0,0,1,1,1,2,2,3,3,4};
		for(int e:a) {
			System.out.print(e+" ");
		}
		System.out.println("\n"+removeElement(a,1)+"\n");
		
		for(int e:a) {
			System.out.print(e+" ");
		}
		
		String s="adityasingh";
		System.out.println(s.indexOf("ity"));
		
		

	}
	public static int removeDupArray(int[] a) {
		int wi=1;
		for(int i=1;i<a.length;i++) {
			if(a[wi-1]!=a[i]) {
				a[wi]=a[i];
				wi++;
			}	
		}
		return wi;
		
	}
	public static int removeDuplicates(int[] nums) {
        int index = 0;
        for(int i=1; i < nums.length; i++)
            if(nums[i] != nums[index])
                nums[++index] = nums[i];
        return index;//new length is index+1
    }
	public static int removeElement(int[] a,int k) {
		int wi=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==k) {
				continue;
			}else {
				a[wi]=a[i];
				wi++;
			}	
		}
		return wi;
    }
	public static int searchInsert(int[] a,int target) {
		if(a.length==0) {
			return a.length+1;
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]==target) {
				return i;
			}else if(a[i]<target)
		}
		
	}

}
