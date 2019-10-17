package src;

//can have different return type
//methods have same name, but signature can be different

class Demo{
	public Object demoMethod(Object obj) {
		return obj;
	}
	
	public String demoMethod(String str1, String str2) {
		return str1+str2;
	}
	
	//below method is not different that above one, 
	//as change in return type will not be recognized as different overloaded method
//	public void demoMethod(String str1, String str2) {
//		System.out.println(str1+str2);
//	}
	
	public String demoMethod(String str1, String str2, String str3) {
		return str1+str2+str3;
	}
	
	public Integer demoMethod(int i) {
		return i;
	}
	
}

public class OverloadingDemo {

	public static void main(String[] args) {
		
		Demo demo = new Demo();
		Integer ind = demo.demoMethod(0);
		System.out.println("integer "+ ind);
		
		String str = demo.demoMethod("abc", "abc", "");
		System.out.println("string "+ str);
		
		Object o = demo.demoMethod(3);
		System.out.println(o);
	}

}
