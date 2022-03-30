package pack;

public class OuterClass2 {
	private String msg="I love Java";
	void disp() {
		class Inner{
			void display() {
				System.out.println("Message from outer class: "+msg);
			}
		}
		Inner in =new Inner();
		in.display();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass2 oc = new OuterClass2();
		oc.disp();
	}

}
