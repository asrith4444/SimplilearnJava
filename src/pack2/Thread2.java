package pack2;
class Thred1 implements Runnable{
	public void run() {
		System.out.println("Thread1 from Runnable Interface");
	}
}
class Thred2 implements Runnable{
	public void run() {
		System.out.println("Thread2 from Runnable Interface");
	}
}
class Thred3 implements Runnable{
	public void run() {
		System.out.println("Thread3 from Runnable Interface");
	}
}
public class Thread2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thred1 t1= new Thred1();
		Thred2 t2= new Thred2();
		Thred3 t3= new Thred3();
		Thread t =new Thread(t1);
		t.start();
		t=new Thread(t2);
		t.start();
		t=new Thread(t3);
		t.start();
		
	}

}
