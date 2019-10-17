package inheritance;

public class ClassC {
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
		// TODO Auto-generated method stub
		return ("PriVar "+ getPrivVar() + "  PubVar " + getPubVar());
	}
	
}
