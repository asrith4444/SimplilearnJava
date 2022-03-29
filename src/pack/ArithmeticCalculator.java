package pack;

import java.util.Scanner;

public class ArithmeticCalculator {
	public static int add(int a, int b) {
		return a+b;
	}
	
	public static int sub(int a, int b) {
		return a-b;
	}
	
	public static double div(int a, int b) {
		return a/b;
	}
	public static int mul(int a, int b) {
		return a*b;
	}
	public static void Menu() {
		System.out.println("Arithmetic Calculator \n1. Addition \n2. Subtraction \n3. Multiplication \n4.Division \n0. Exit \nEnter number to perform operation:");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			Menu();
			
			int choice=sc.nextInt();
			System.out.println("Enter 1st value: ");
			int a=sc.nextInt();
			System.out.println("Enter 2nd value: ");
			int b=sc.nextInt();
			if(choice==0)
				break;
			switch(choice) {
				case 1:
					System.out.println("Addition of "+a+" and "+b+ " is: "+add(a,b));
					break;
				case 2:
					System.out.println("Subtraction of "+a+" and "+b+ " is: "+sub(a,b));
					break;
				case 3:
					System.out.println("Multiplication of "+a+" and "+b+ " is: "+mul(a,b));
					break;
				case 4:
					System.out.println("Division of "+a+" and "+b+ " is: "+div(a,b));
					break;
				default: System.out.println("Enter a valid input!");
			}
			
		}sc.close();
		
	}

}
