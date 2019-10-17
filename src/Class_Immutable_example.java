package src;

//simple class which doesnot expose any variable
//good for caching purpose

public final class Class_Immutable_example {
	
	private final int int_var;
	
	private final String name;
	
	public Class_Immutable_example(int int_var, String name) {
		this.int_var = int_var;
		this.name = name;
	}
	
	public String getName() {
		return name;
		
	}

	public int getInt_var() {
		return int_var;
	}

}
