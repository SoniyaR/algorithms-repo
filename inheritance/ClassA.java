package inheritance;

public abstract class ClassA {

	private int privVar;
	public int pubVar;
	
	private int getPrivVar() {
		return privVar;
	}
	public void setPrivVar(int privVar) {
		this.privVar = privVar;
	}
	public int getPubVar() {
		return pubVar;
	}
	public void setPubVar(int pubVar) {
		this.pubVar = pubVar;
	}
	
	public String printVals() {
		return ("PriVar "+ getPrivVar() + "  PubVar " + getPubVar());
	}
	
	public abstract void randomPrint() throws ArithmeticException;
}
