package src;

public class SingletonClass {
	
	private static SingletonClass obj = null;
	
	private SingletonClass () {
		
	}
	
	private void display(String str) {
		System.out.println("Singleton example "+str);
	}
	
	public static SingletonClass create() {
		if(obj == null) {
			 obj = new SingletonClass();
		}
		return obj;
	}

	public static void main(String[] args) {
		SingletonClass sc1 = SingletonClass.create();
		sc1.display("1");
		SingletonClass sc2 = SingletonClass.create();
		sc2.display("2");

	}

}
