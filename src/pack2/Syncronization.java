package pack2;
class Sender{
	void send(String msg) {
		System.out.println("Sending "+msg);
		try {
			Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(msg+" sent.");
	}
}
class ThreadSender extends Thread{
	String msg;
	Sender sender;
	ThreadSender(String msg, Sender obj){
		this.msg=msg;
		sender=obj;
	}
	public void run() {
		 synchronized(sender) //applying lock
	     { 
	            sender.send(msg); 
	     } 
	}
}
public class Syncronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sender sen =new Sender();
		ThreadSender s1 = new ThreadSender("Hi bro",sen);
		ThreadSender s2 = new ThreadSender("Bye bro",sen);
		s1.start();
		s2.start();
		try {
			s1.join();
			s2.join();
		}catch(Exception e) {
			System.out.println("Interrupted");
		}
	}

}
