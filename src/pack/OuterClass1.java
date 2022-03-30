package pack;

public class OuterClass1 {
	private String msg="I love Java";
	class Inner{
		void display() {
			System.out.println("Message from outer class: "+msg);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass1 oc = new OuterClass1();
		OuterClass1.Inner in = oc.new Inner();
		in.display();

	}

}
