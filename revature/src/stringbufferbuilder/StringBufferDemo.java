package stringbufferbuilder;

public class StringBufferDemo {

	public static void main(String[] args) {
		String str1 = "";
		str1 = str1 + "welcome";
		str1 = str1 + " to LA";
		System.out.println("string: "+ str1);
		System.out.println(str1.charAt(0));
		
		
		
		
		// 10 methods of string
		//5 methods of stringbuffer
		
		StringBuffer sb1 = new StringBuffer();
		sb1.append("hello ");
		sb1.append("abc");
		sb1.append(" 123");
		System.out.println("String Buffer:"+ sb1);
		sb1.delete(0, 6);
		System.out.println(sb1);
		sb1.replace(0, 3, "welcome");
		System.out.println(sb1);
		
		
		String data1 = "45.55";
		double data2 = Double.parseDouble(data1);
		System.out.println(++data2);
		
		String data3 = "13";
		int data4 = Integer.parseInt(data3);
		System.out.println(++data4);
		
		
		
		
	}

	

}
