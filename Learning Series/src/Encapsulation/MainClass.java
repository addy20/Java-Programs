package Encapsulation;

import java.util.*;
import java.util.Map.Entry;

public class MainClass {

	public static void main(String[] args) throws Exception {
//      Map<String,Integer> numbers=new HashMap<>();
//      numbers.put("one",1);
//      numbers.put("two",2);
//      numbers.put("three",3);
//      numbers.replace("two", 5, 5);
//      
//      System.out.println(numbers.entrySet());
//      
//      for(Entry<String,Integer> entry:numbers.entrySet()) {
//    	  entry.setValue(entry.getValue()*10);
//      }
//      System.out.println(numbers.entrySet() );
		List<Student> list=new ArrayList<>();
		list.add(new Student("Aditya",100));
		list.add(new Student("Sharma",12));
		list.add(new Student("Aditya",12));
		list.add(new Student("Lala",78));
		list.add(new Student("Odia",45));
		list.add(new Student("Kunj",85));
		
//		Collections.sort(list,new Comparator<Student>(){
//			@Override
//			public int compare(Student o1, Student o2) {
//				if(o1.name.equals(o2.name)) return o1.marks-o2.marks;
//				else
//					return o1.name.compareTo(o2.name);
//			}
//		});
		
//		Collections.sort(list,(Student o1, Student o2)-> {
//				if(o1.name.equals(o2.name)) return o1.marks-o2.marks;
//				else
//					return o1.name.compareTo(o2.name);
//			});
		
//		Collections.sort(list,(o1,o2)-> {
//			if(o1.name.equals(o2.name)) return o1.marks-o2.marks;
//			else
//				return o1.name.compareTo(o2.name);
//		});
//		Collections.sort(list,(o1,o2)-> o1.name.compareTo(o2.name));
		Collections.sort(list,Comparator.comparing(Student::getName).thenComparing(Student::getMarks).reversed());
		
		
		list.forEach(System.out::println);
      
      
		
	}

}
//class SortByNameThenByMarks implements Comparator<Student>{
//
//	@Override
//	public int compare(Student o1, Student o2) {
//		if(o1.name.equals(o2.name)) return o1.marks-o2.marks;
//		else
//			return o1.name.compareTo(o2.name);
//	}
//	
//}
