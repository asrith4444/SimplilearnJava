package pack;

import java.util.Scanner;

public class Array1D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] a =new int[5];
		for(int i=0; i<a.length; i++) {
			System.out.println("Enter element - "+(i+1));
			a[i]=sc.nextInt();
		}
		System.out.println("Elements of 1D Array:");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+"\t");
		}
		sc.close();
		System.out.println("\n1D Array");
		int[] b = {1,2,3,4,5};
		for(int i=0; i<b.length; i++) {
			System.out.print(b[i]+"\t");
		}
	}

}
