package singleton;

public class DbSingletonDemo {

	public static void main(String[] args) {
		DbSingleton instDbSingleton = DbSingleton.getInstance();
		
		System.out.println(instDbSingleton);
		
		DbSingleton anotherInstance = DbSingleton.getInstance();
		
		System.out.println(anotherInstance);
	}

}
