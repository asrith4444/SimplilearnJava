package pack;
class Animal{
	String name;
	String color;
	int age;
	Animal(){
		
	}
	Animal(String name){
		this.name=name;
	}
	
	Animal(String name, String color){
		this.name=name;
		this.color= color;
	}
	Animal(String name, String color, int age){
		this.name=name;
		this.color= color;
		this.age=age;
	}
	void display() {
		System.out.println("Name of the Animal: "+name);
		System.out.println("Color of the Animal: "+color);
		System.out.println("Age of the Animal: "+age);
	}
}
public class ConstructorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1 = new Animal();
		Animal a2 = new Animal("AKC");
		Animal a3 = new Animal("Asrith","Orange");
		Animal a4 = new Animal("Asrith Krishna","Red",10);
		a1.display();
		a2.display();
		a3.display();
		a4.display();
	}

}
