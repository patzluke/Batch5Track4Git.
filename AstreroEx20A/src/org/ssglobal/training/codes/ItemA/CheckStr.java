package org.ssglobal.training.codes.ItemA;

public class CheckStr {
	public CheckStr() {
	}

	public String convert(String str) {
		return binarise(total(str));
	}

	public int total(String str) {
		if (str == "")
			return 0;
		if (str.length() == 1)
			return ((int) (str.charAt(0)));
		return ((int) (str.charAt(0))) + total(str.substring(1));

	}

	public String binarise(int givenstrvalue) {
		if (givenstrvalue == 0)
			return "";
		if (givenstrvalue % 2 == 1)
			return "1" + binarise(givenstrvalue / 2);
		return "0" + binarise(givenstrvalue / 2);
	}
	
	public static void main(String[] args) {
		System.out.println(new CheckStr().total("patrick"));
		System.out.println(new CheckStr().convert(""));
		System.out.println(new CheckStr().binarise(0));
	}
}
