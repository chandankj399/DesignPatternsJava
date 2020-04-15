package singleton;

public class DbSingleton {

	private static DbSingleton instance = null;

	private DbSingleton() {
		if (instance != null) {
			throw new RuntimeException("Use getInstance() method to create instance");
		}
	}

	public static DbSingleton getInstance() {
		if (instance == null) {
			synchronized (DbSingleton.class) {      // for thread safety
				if (instance == null) {
					instance = new DbSingleton(); // Lazy Loading
				}
			}
		}
		return instance;
	}
}
