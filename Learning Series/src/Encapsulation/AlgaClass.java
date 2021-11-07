package Encapsulation;

import java.util.*;

class Interval{
	int start;
	int end;
	Interval(){
		start=0;
		end=0;
	}
	Interval(int start,int end){
		this.start=start;
		this.end=end;
	}
}
public class AlgaClass {

	public static void main(String[] args) {
     List<Interval> list=new LinkedList<Interval>();
     Interval toInsert=new Interval(5,2);
     list.add(toInsert);
     
     System.out.println(toInsert.start);
     }
      
	

}
