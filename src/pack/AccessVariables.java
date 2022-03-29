package pack;

public class AccessVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariableAccess va= new VariableAccess();
		System.out.println("Public Variable: "+va.a);
		//System.out.println("Private Variable: "+va.b);	Private Variable can't accessed
		System.out.println("Default Variable: "+va.c);
		System.out.println("Protected Variable: "+va.d);

	}

}
