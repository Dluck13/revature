package exceptionhandling;

public class Demo {

	public static void main(String[] args) {
		int num1= 5;
		int num2= 0;
		int result = 0;
		System.out.println("Going to Divide");
		//1. JVM identifies the type of exception/ can't divide by 0 (ArithmeticException)
		// JVM creates object of Arithmetic error /project terminates here due to arithmetic error
		// JVM throws exception object
		try {
			result = num1/num2;
		}catch(ArithmeticException ae) {
			System.out.println("You can not divide by 0!!!!");
			num2 = 1;
			result = num1/num2; 
		}
		
		System.out.println("Result is :"+ result);
		
		System.out.println("End");
	}
}
