
public class Prop {

	public static void main(String[] args) {
    System.out.println("Profile Name: "+System.getProperty("user.name"));
    System.out.println("Windows version: "+System.getProperty("os.name"));
    System.out.println("System Architecture: "+System.getProperty("os.arch"));
    System.out.println("java.class.path"+System.getProperty("path.separator"));
    System.out.println(System.getProperty("java.version"));
    System.out.println(System.getProperty("java.class.path"));
	}

}
