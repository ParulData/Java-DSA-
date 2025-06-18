import java.util.HashSet;
import java.util.Iterator;

class Hashset_01{
	public static void main(String[] args){
		HashSet<Integer> set = new HashSet<>();
		set.add(21); set.add(90); set.add(67); set.add(45); set.add(23);  // order is not gauranteed in HashSet
		System.out.println(set);

	/*	for(int i = 0; i < 5; i++){
		
	    	set.add(i);
		} */

		System.out.println(set);

		System.out.println("Set elements are : ");
		Iterator it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

	}
}