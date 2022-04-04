package pack2;

import java.util.Scanner;

class Set11{
	void display1() throws Exception{
		System.out.println("Disp1 Started");
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Arithmetic Activity");
			System.out.println("Enter the value 1: ");
			int val1 = sc.nextInt();
			System.out.println("Enter value 2: ");
			int val2 = sc.nextInt();
			int res = val1/val2;
			System.out.println("Result: "+res);
			System.out.println("Arithmetic Activity Ended.");
		}catch(Exception e) {
			System.out.println("Exception Handled");
		}finally {
			System.out.println("Disp1 Terminated");
		}
	}
}
public class TryCatch6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Started");
		Set11 s1=new Set11();
		try {
			s1.display1();
		}catch(Exception e) {
			System.out.println("Exception Handled in Main");
		}
		System.out.println("Main Terminated");
	}

}
