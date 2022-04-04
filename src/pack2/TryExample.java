package pack2;
class HolidayTrainingException extends Exception{
	String str;
	public String toString() {
		return "MyException occured: "+str;
	}
}
public class TryExample {

	public static void main(String[] args) {
		boolean Training=true;
		String Day = "Holiday";
		try {
		if(Training && Day.equals("Holiday"))
			throw new HolidayTrainingException();
		}catch(HolidayTrainingException e) {
			System.out.println("Lets take a break bro");
		}
		
	}

}
