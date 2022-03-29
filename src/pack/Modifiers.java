package pack;

public class Modifiers {

	private void privateDisplay() {
		System.out.println("This is From Private Method");
	}
	
	public void publicDisplay() {
		System.out.println("This is From Public Method");
	}
	
	void defaultDisplay() {
		System.out.println("This is From Default Method");
	}
	
	protected void protectedDisplay() {
		System.out.println("This is From Protected Method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		Modifiers mod = new Modifiers();
		mod.publicDisplay();
		mod.privateDisplay();
		mod.defaultDisplay();
		mod.protectedDisplay();
	}

}
