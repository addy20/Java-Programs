package Encapsulation;

import java.util.*;

public class Main {
  
	enum Color{RED,WHITE,BLUE} 

	public static void main(String[] args) {
	ArrayList<Color> A=new ArrayList<Color>();
	A.add(Color.RED); //0
	A.add(Color.WHITE); //1
	A.add(Color.BLUE); //2
	A.add(Color.RED);
	A.add(Color.BLUE);
	A.add(Color.WHITE);
	A.add(Color.WHITE);
	int pivotindex=A.indexOf(Color.WHITE);
	
	System.out.println(A);
	
	Partition(pivotindex,A);
	for(Color c:A) {
		System.out.print(" "+c.ordinal());
         }
	} 
	


public static void Partition(int pivotlndex, List<Color> A)
{
	Color pivot = A.get(pivotlndex);
	
	int smaller = 0, equal = 0, larger = A.size();
	
	while (equal < larger) {
	
	if (A.get(equal).ordinal() < pivot.ordinal())
	{
	    Collections.swap(A , smaller++, equal++);
	}else if (A.get(equal).ordinal() == pivot.ordinal())
	{
	   ++equal ;
	} else 
	{ 
	  Collections.swap(A , equal, --larger);
	}
}
	System.out.println(A);
 }



  }
