package pack;

import java.util.Scanner;

public class GradePrediction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the percentage obtained: ");
		double p = sc.nextDouble();
		if(p>89.9)
			System.out.println("Grade: A+ \nPassed in Distinction");
		else if(p>79.9 && p<89.9)
			System.out.println("Grade: A \nPassed in First class with Distinction");
		else if(p<79.9 && p>64.9)
			System.out.println("Grade: B+ \nPassed in First Class");
		else if(p<64.9 && p>49.9)
			System.out.println("Grade: B \nPassed in Second Class");
		else
			System.out.println("Grade: C \n5Passed in Third Class");
		sc.close();
	}

}
