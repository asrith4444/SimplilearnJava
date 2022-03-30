package pack;

import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] a =new int[3][3];
		for(int i =0; i<a.length;i++) {
			for(int j=0; j<a.length;j++) {
				System.out.println("Enter element - a["+i+"]["+j+"]");
				a[i][j]=sc.nextInt();
			}
		}
		for(int i =0; i<a.length;i++) {
			for(int j=0; j<a.length;j++) {
				System.out.print(a[i][j]+"\t");
			}System.out.println();
		}
		sc.close();
		int[][] b ={{12,23},{23,12}};
		System.out.println("2D Array:");
		for(int i =0; i<b.length;i++) {
			for(int j=0; j<b.length;j++) {
				System.out.print(b[i][j]+"\t");
			}System.out.println();
		}
	}

}
