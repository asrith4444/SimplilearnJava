package pack2;

import java.util.Scanner;

class Data{
	void disp() {
		System.out.println("Data from disp");
	}
}
public class TryCatch3 {

	public static void main(String[] args) throws ArithmeticException, ArrayIndexOutOfBoundsException, NullPointerException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Array Activity");
			System.out.println("Enter the size of the Array: ");
			int size = sc.nextInt();
			int[] arr = new int[size];
			System.out.println("Enter the Position to insert data: ");
			int pos = sc.nextInt();
			System.out.println("Enter data to insert: ");
			int data = sc.nextInt();
			arr[pos]=data;
			System.out.println("Array Activity Ended.");
			
			System.out.println("Object Activity");
			Data d = new Data();
			d.disp();
			d=null;
			d.disp();
			System.out.println("Object Activity Ended.");
			
			System.out.println("Arithmeic Activity");
			System.out.println("Enter value 1: ");
			int val1 = sc.nextInt();
			System.out.println("Enter value 2: ");
			int val2 = sc.nextInt();
			int res = val1/val2;
			System.out.println("Result: "+res);
			System.out.println("Arithmetic Activity Ended.");
		}catch(Exception e) {
			System.out.println("Exception Handled.");
		}
		sc.close();
	}

}
