package oops;
abstract class Plane{
	void takeOff() {
		System.out.println("Plane is tookOff.");
	}
	abstract void fly();
	void land() {
		System.out.println("Plane landed.");
	}
}
class CargoPlane extends Plane{
	@Override
	void fly() {
		System.out.println("Plane flying in low heights.");
	}
}
class FighterPlane extends Plane{
	@Override
	void fly() {
		System.out.println("Plane flying in high heights.");
	}
}
public class AbstractionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CargoPlane cp = new CargoPlane();
		FighterPlane fp = new FighterPlane();
		System.out.println("Cargo Plane");
		cp.takeOff();
		cp.fly();
		cp.land();
		
		System.out.println("Fighter Plane");
		fp.takeOff();
		fp.fly();
		fp.land();
	}

}
