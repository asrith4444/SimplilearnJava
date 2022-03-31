package pack2;

public class TryCatch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[3];
		try {
			a[7]=3;
		}catch(ArithmeticException e) {
			System.out.println(e);
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("Program ended.");
		}

	}

}
