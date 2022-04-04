package oops;

public class PolymorphismExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Using classes from AbstractionExample
		CargoPlane cp = new CargoPlane();
		FighterPlane fp = new FighterPlane();
		Plane ref;
		ref=cp;
		System.out.println("Cargo Plane Activity");
		ref.takeOff();
		ref.fly();
		ref.land();
		System.out.println("\nFighter Plane Activity");
		ref=fp;
		ref.takeOff();
		ref.fly();
		ref.land();
	}

}
