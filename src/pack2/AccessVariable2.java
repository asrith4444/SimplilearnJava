package pack2;
import pack.VariableAccess;
public class AccessVariable2 extends VariableAccess{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessVariable2 va= new AccessVariable2();
		System.out.println("Public Variable: "+va.a);
		//System.out.println("Private Variable: "+va.b);
		//System.out.println("Default Variable: "+va.c);
		System.out.println("Protected Variable: "+va.d);
	}

}
