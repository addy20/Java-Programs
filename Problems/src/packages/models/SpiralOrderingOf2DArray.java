package packages.models;

import java.util.*;

public class SpiralOrderingOf2DArray {

	public static void main(String[] args) {
    int n=4;int count=1;
	List<List<Integer>> L=new ArrayList<List<Integer>>();
    for(int i=0;i<n;i++)
    { 
    	List<Integer> currRow=new ArrayList<Integer>();
    	for(int j=0;j<n;j++)
    	{
    		currRow.add(count);
    		count++;
    	}
    	L.add(i,currRow);
    }
    System.out.println(matrixInSpiralOrder(L));
	}
	public static List<Integer> matrixInSpiralOrder(List<List<Integer>> squareMatrix){
			List<Integer> spiralOrdering = new ArrayList <>();
			for (int offset=0;offset<Math.ceil(0.5 * squareMatrix.size());++offset) 
			{
				matrixLayerlnClockwise(squareMatrix , offset, spiralOrdering);
			}
			return spiralOrdering ;
			}
	public static void matrixLayerlnClockwise(List<List<Integer>> squareMatrix,int offset,List<Integer> spiralOrdering) {
			if (offset==squareMatrix.size()-offset-1) {
			spiralOrdering.add(squareMatrix.get(offset).get(offset));
			return ;
			}
			for (int j=offset;j<squareMatrix.size()-offset-1; ++j) 
			{
				spiralOrdering.add(squareMatrix.get(offset).get(j));
			}
			for (int i=offset; i<squareMatrix.size()-offset-1;++i) 
			{
				spiralOrdering.add(squareMatrix.get(i).get(squareMatrix.size()-offset-1));
			}
			for (int j=squareMatrix.size()-offset-1;j>offset;--j) 
			{
				spiralOrdering.add(squareMatrix.get(squareMatrix.size()-offset-1).get(j));
			}
			for (int i=squareMatrix.size()-offset-1;i>offset;--i) 
			{
				spiralOrdering.add(squareMatrix.get(i).get(offset));
			}
						
	}
			
}


