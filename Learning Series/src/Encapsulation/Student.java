package Encapsulation;

public class Student implements Comparable<Student>{
	int marks;
	String name;
	Student(String name,int marks){
		this.name=name;
		this.marks=marks;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Student [marks=" + marks + ", name=" + name + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(Student o) {
		return this.marks-o.marks;
	}
	

	
}

