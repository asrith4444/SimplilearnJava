package pack;
import java.util.*;
public class CollectionsProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al= new ArrayList<Integer>();
		al.add(2);
		al.add(4);
		System.out.println("Array List: "+al);
		al.remove(1);
		System.out.println("Array List: "+al);
		//Linked List
		LinkedList<Integer> link = new LinkedList<Integer>();
		link.add(1);
		link.add(2);
		System.out.println("Linked List: "+link);
		link.remove();
		System.out.println("Linked List: "+link);
		
		//Priority Queue
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(1010);
		pq.add(12);
		pq.add(123);
		System.out.println("Priority Queue: "+pq);
		pq.remove();
		System.out.println("Priority Queue: "+pq);
		
		//TreeSet
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(11);
		ts.add(12);
		ts.add(14);
		System.out.println("TreeSet: "+ts);
		//ts.remove(ts);
		System.out.println("TreeSet: "+ts);
		
		
		//Vector
		Vector<Integer> v=new Vector<Integer>();
		v.add(90);
		v.add(20);
		v.add(30);
		System.out.println("Vector: "+v);
		v.removeAllElements();
		System.out.println("Vector: "+v);
		
		//HashSet
		HashSet<String> hs = new HashSet<String>();
		hs.add("Asrith");
		hs.add("Krishna");
		hs.add("Vejandla");
		hs.add("Asrith");
		System.out.println("HashSet: "+hs);
		hs.clear();
		System.out.println("HashSet: "+hs);
		
		//Linked HashSet
		LinkedHashSet<String> lhs = new LinkedHashSet();
		lhs.add("India");
		lhs.add("America");
		lhs.add("Canada");
		System.out.println("LinkedHashSet: "+lhs);
		lhs.clear();
		System.out.println("LinkedHashSet: "+lhs);
	}

}
