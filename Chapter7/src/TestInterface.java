interface Animal{
	public void animalFood();
	public void sleep();
}
class Cow implements Animal{
	public void animalFood() {
		System.out.println("Cow eats grass");
	}
	public void sleep() {
		System.out.println("Sleeps for 2h");
	}
}
public class TestInterface {

	public static void main(String[] args) {
    Cow c=new Cow();
    c.animalFood();
    c.sleep();
	}

}
