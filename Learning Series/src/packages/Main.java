package packages;

import packages.models.*;
;

public class Main {

	public static void main(String[] args) {
    Student obj=new Student("Tom");
    obj.name="Jerry";
    obj.getPassword();
    obj.getName();
    Teacher obj1=new Teacher("Sabrina");
    System.out.println(obj.getName());
	}

}
