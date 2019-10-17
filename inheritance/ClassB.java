package inheritance;

public class ClassB extends ClassA{
	
	
	public ClassB() {
		super.setPrivVar(31);
	}

	@Override
	public void randomPrint() throws NullPointerException{
		System.out.println("This is random statement in Class B.");
		
	}
	
	
	
}
