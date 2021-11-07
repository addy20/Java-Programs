package encapsulations;

public class Singer extends Person {
	Singer(String name) {
		super(name);
	}

	public void sing() {
		System.out.println("Singer is singing");
	}

}
