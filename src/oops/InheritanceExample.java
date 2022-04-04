package oops;
class Father {
	void isSleep() {
		System.out.println("Sleep sufficiently");
	}
	void isStudy() {
		System.out.println(" Good at StudyingStudying");
	}
	void isClever() {
		System.out.println("Cleverest Student");
	}
}
class Son extends Father{
	void isTalented() {
		System.out.println("Very very Talented");
	}
	@Override
	void isStudy() {
		System.out.println("Not good at studying");
	}
}
public class InheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son asrith = new Son();
		asrith.isSleep();
		asrith.isStudy();
		asrith.isTalented();
		asrith.isClever();
	}

}
