package pack2;

import java.util.Scanner;

class UnderAgeException extends Exception{
	String str;
	UnderAgeException(String str){
		this.str=str;
	}
	public String toString() {
		return "UnderAgeException occured: "+str;
	}
}
class OverAgeException extends Exception{
	String str;
	OverAgeException(String str){
		this.str=str;
	}
	public String toString() {
		return "OverAgeException occured: "+str;
	}
}
public class CustomException2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Driving License Eligibility Verification");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age for Verification");
		int age = sc.nextInt();
		try {
			if(age<18)
				throw(new UnderAgeException("Under 18 are not allowed for Driving License."));
			else if(age>65)
				throw(new OverAgeException("Over 65 are not allowed for Driving License."));
			else
				System.out.println("Congratulations! You are allowed for Driving icense.");
			
		}catch(UnderAgeException uae) {
			System.out.println(uae);
		}catch(OverAgeException oae) {
			System.out.println(oae);
		}finally {
			System.out.println("Driving License Eligibility Verification Completed.");
		}
	}

}
