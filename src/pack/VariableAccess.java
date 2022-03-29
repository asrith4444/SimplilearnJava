package pack;

public class VariableAccess {
	public int a=10;
	private int b=20;
	int c=30;
	protected int d=40;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariableAccess va= new VariableAccess();
		System.out.println("Public Variable: "+va.a);
		System.out.println("Private Variable: "+va.b);
		System.out.println("Default Variable: "+va.c);
		System.out.println("Protected Variable: "+va.d);
	}

}
