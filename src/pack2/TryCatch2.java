package pack2;

public class TryCatch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[2];
		try {
			System.out.println(1/0);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		try {
			arr[9]=0;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		try {
			Object ref= null;
			ref.toString();
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		try {
			String s= null;
			int a =Integer.parseInt(s);
		}catch(NumberFormatException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Whatever it is, I love you TryCatch, you guys made my life easy.");
		}
		
	}

}
