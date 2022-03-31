package pack2;
class Exep{
	public void opr() throws ArithmeticException{
		int a=4,b=0,rs;
		if(b==0)
			throw(new ArithmeticException("Can't Divide by Zero"));
		else {
			rs=a/b;
			System.out.println("\nThe Result: "+rs);
		}
		System.out.println("End of the Program");
	}
}
public class ThrowException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exep e =new Exep();
		try {
			e.opr();
		}catch(ArithmeticException ex) {
			System.out.println("From Main: "+ex.getMessage());
		}
	}

}
