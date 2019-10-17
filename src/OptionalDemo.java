package src;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		String [] strArr = new String[5];
		strArr[0] = "abc";
		strArr[1] = "xyz";
		
		Optional<String> strExist = Optional.ofNullable(strArr[1]);
		if(strExist.isPresent()) {
			System.out.println(strExist.get());
		}else {
			System.out.println("str is null");
		}

	}

}
