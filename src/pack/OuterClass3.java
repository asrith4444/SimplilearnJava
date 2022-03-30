package pack;
abstract class AnonymousInner{
	public abstract void display();
}
public class OuterClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//AnonymousInner ai =new AnonymousInner();
		AnonymousInner ai =new AnonymousInner() {
			public void display() {
				System.out.println("Object created for Abstract class");
			}
		};
		ai.display();
	}

}
