package scannerex;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int number = scan.nextInt();
		System.out.println("Number entered is ; " + number);
		
		System.out.println("Do you want to continue(y/n) : ");
		char option = scan.next().charAt(0);
		System.out.println("Option enetered is: " + option);
	}

}


/* System.in refers to the keyboard
   System.out refers to console*/