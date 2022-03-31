package pack2;
class MyException extends Exception{
	String str;
	MyException(String str){
		this.str=str;
	}
	public String toString() {
		return "MyException occured: "+str;
	}
}
public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Starting of try block");
			throw new MyException("This is my Error");
		}
		catch(MyException e) {
			System.out.println("Catch Block");
			System.out.println(e);
		}
	}

}
