package pack;
import java.util.*;
public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "India");
		hm.put(2, "America");
		hm.put(3, "Canada");
		System.out.println("Hash Map: "+hm);
		
		System.out.println("Elements of HashMap are: ");
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+". "+m.getValue());
		}
		
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(1, "Asrith");
		tm.put(2, "Krishna");
		tm.put(3, "Vejandla");
		System.out.println("Tree Map: "+tm);
		
		System.out.println("Elements of TreeMap are: ");
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+". "+m.getValue());
		}
		
		HashMap hm1 = new HashMap();
		hm1.put("Jai", "India");
		hm1.put(2, "America");
		hm1.put(0.2, "Canada");
		System.out.println("Non Generic Hash Map: "+hm1);//Heterogeneous pairs can be taken.
		
		TreeMap tm1 = new TreeMap();
		tm1.put(1, "India");
		tm1.put(2, "America");
		tm1.put(1, "Canada");
		System.out.println("Non Generic Tree Map: "+tm1);//Heterogeneous pairs are not allowed.
	}

}
