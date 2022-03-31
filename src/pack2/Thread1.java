package pack2;
class Thrd1 extends Thread{
	public void run() {
		System.out.println("From Thread1");
	}
}
class Thrd2 extends Thread{
	public void run() {
		System.out.println("From Thread2");
	}
}
class Thrd3 extends Thread{
	public void run() {
		System.out.println("From Thread3");
	}
}
public class Thread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thrd1 t1= new Thrd1();
		Thrd2 t2= new Thrd2();
		Thrd3 t3= new Thrd3();
		t1.start();
		t3.start();
		t2.start();
	}

}
