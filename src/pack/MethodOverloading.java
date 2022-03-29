package pack;

public class MethodOverloading {
	int add(int a, int b) {
		return a+b;
	}
	float add(float a, float b) {
		return a+b;
	}
	double add(double a, double b) {
		return a+b;
	}
	String add(String a, String b) {
		return a+b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading mo = new MethodOverloading();
		System.out.println("Addition of Integer : "+mo.add(1,10));
		System.out.println("Addition of Float : "+mo.add(1.0,10.2));
		System.out.println("Addition of Double : "+mo.add(1.8907,10.23290));
		System.out.println("Addition of Strings : "+mo.add("Asrith ","Krishna"));
	}

}
