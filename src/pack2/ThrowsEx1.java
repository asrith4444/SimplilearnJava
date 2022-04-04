package pack2;

import java.util.Scanner;

class Set1{
	void display1() throws ArithmeticException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Arithmetic Activity");
		System.out.println("Enter the value 1: ");
		int val1 = sc.nextInt();
		System.out.println("Enter value 2: ");
		int val2 = sc.nextInt();
		int res = val1/val2;
		System.out.println("Result: "+res);
		System.out.println("Arithmetic Activity Ended.");
	}
}
class Set2{
	void display2() throws ArithmeticException{
		Set1 s1 = new Set1();
		s1.display1();
	}
}
class Set3{
	void display3() throws ArithmeticException{
		Set2 s2 = new Set2();
		s2.display2();
	}
}
public class ThrowsEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set3 s3 = new Set3();
		try {
			s3.display3();
		}catch(ArithmeticException e) {
			System.out.println("Exception Handled");
		}
	}

}
