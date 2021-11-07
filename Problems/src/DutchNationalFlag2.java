import java.util.*;
class Main {
  public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		Random r=new Random();
		for(int i=0;i<7;i++)
		{
			list.add(r.nextInt(3));
		}
		
		int pivotIndex=1;
		dutchFlagPartition(pivotIndex,list);
	}
	public static void dutchFlagPartition(int pivotIndex,List<Integer> list) 
	{
		int pivot=list.get(pivotIndex);
    int smaller=0;
		for (int i =0; i < list.size(); ++i) 
		{
			
			    if (list.get(i) < pivot)
			    {
			   Collections.swap(list,smaller++,i);
			  
			    }
			 	
		}
	int larger=list.size()-1;
	for (int i =list.size()-1 ; i >=0 && list.get(i) >= pivot; --i) 
	{
			   if (list.get(i)> pivot)
			     {
			       Collections.swap(list,larger--,i);
           }
			
			
	}
	System.out.println(list);
}
	
}



  