package packages.models;

import java.util.*;

public class RowsOfPascalTriangle {

	public static void main(String[] args) {
		int nRows=5;
		System.out.println(generatePascalTriangle(nRows));
    
	}
	public static List<List<Integer>> generatePascalTriangle(int nRows){
		List<List<Integer>> pascalMatrix=new ArrayList<List<Integer>>();
		for(int i=0;i<nRows;i++)
		{
			List<Integer> currRow=new ArrayList<Integer>();
			for(int j=0;j<=i;j++)
			{
				currRow.add((0<j&&j<i)?pascalMatrix.get(i-1).get(j-1)+pascalMatrix.get(i-1).get(j):1);
			}
			pascalMatrix.add(currRow);
		}
		return pascalMatrix;
			
		
	}

}
