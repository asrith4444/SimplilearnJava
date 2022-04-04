package oops;
interface Calcy1{
	public void add();
}
interface Calcy2{
	public void sub();
}
class Calculator implements Calcy1,Calcy2{
	@Override
	public void add() {
		System.out.println("Inside the Add method.");
	}
	@Override
	public void sub() {
		System.out.println("Inside the Sub method.");
	}
}
public class MultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		c.add();
		c.sub();
	}

}
