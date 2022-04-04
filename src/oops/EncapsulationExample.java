package oops;
class Animal{
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	private String name;
	private int age;
	private String color;
	private int cost;
	Animal(String name, int age, String color, int cost){
		this.name=name;
		this.age=age;
		this.color=color;
		this.cost=cost;
	}
	@Override
	public String toString() {
		return getName()+" - "+getAge()+" - "+getColor()+" - "+getCost();
	}
}
public class EncapsulationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal("Elephant",10,"brown",100000);
		System.out.println(a.toString());
		a.setName("Dog");
		a.setAge(5);
		System.out.println(a.toString());
		System.out.println(a.getColor());
	}

}
