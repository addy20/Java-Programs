package Encapsulation;

public class Person implements Student,Youtuber {

	public static void main(String[] args) {
     Person obj=new Person();  
	}

	public void study() {
		System.out.println("Person is studying");
	}
	public void makeVideo() {
		System.out.println("Person is making video");
	}

}
