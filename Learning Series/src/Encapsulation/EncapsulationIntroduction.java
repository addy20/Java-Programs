package Encapsulation;

import Encapsulation.Student.*;

public class EncapsulationIntroduction {
//	static String name="Aditya";
	static class lowdy{
		static String name="Aditya";
	}

	public static void main(String[] args) {
		
		Student obj=new Student();
		obj.setAge(56);
		obj.setName("Aditya");
		System.out.println(obj.getName());
		Harry obj1=obj.new Harry();
		John obj2=new John();
	}

}
