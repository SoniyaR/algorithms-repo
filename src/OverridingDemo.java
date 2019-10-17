package src;

class ORDemo{
	
	public void getMessage() {
		
		System.out.println("msg-in demo");
	}
}

class subDemo extends ORDemo{
	
	//overriding the getMessage method from parent class ORDemo
	public void getMessage() {
		
		System.out.println("msg-in subDemo");
	}
}

public class OverridingDemo {

	public static void main(String[] args) {
		
		ORDemo d = new subDemo();
		d.getMessage();
		
		//below is not instantiation of abstract class ABDemo
		//its the instance of anonymous subclass of abstract class
		//
		ABDemo abDemo = new ABDemo() {
			@Override
			public String getQuote() {
				return "this is quote";
			}
		};
		
		System.out.println(abDemo.getQuote());
		abDemo.printString();

	}
}


abstract class ABDemo{
	
	public abstract String getQuote();
	
	public void printString() {
		System.out.println("in abstract class, printing some string");
	}
	
}
