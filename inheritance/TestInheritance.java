package inheritance;

public class TestInheritance {

	public static void main(String[] args) {
		ClassB b = new ClassB();
		b.setPubVar(32);
		
		b.randomPrint();
		
		System.out.println("B "+ b.printVals());
		
		//error: abstract class cannot be instantiated, but they can be subclassed
		//like ClassB here.
		//ClassA a = new ClassA();
		
		ClassC c = new ClassC();
		c.setPrivVar(12);
		c.setPubVar(13);
		System.out.println("C "+ c.printVals());

	}

}
