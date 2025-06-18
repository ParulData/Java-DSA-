import java.util.*;

class Treeset_01{
	public static void main(String[] args){
		TreeSet<Integer> set = new TreeSet<>();
		// adding elements in treee
		set.add(23); set.add(90); set.add(45); set.add(21); set.add(12);
		System.out.println(set);

		// Sorting in descending order
		//TreeSet<Integer> setReverse = (TreeSet<Integer>)set.descendingSet();
		System.out.println(Collections.sort(set, Collections.reverseOrder()));

		System.out.println("First element : " + set.first());
		System.out.println("Last element : " + set.last());

		System.out.println("Removing lowest value : " + set.pollLast());

		
		System.out.println("Updated TreeSet elements : ");
		Iterator it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

		// adding two elements and displaying size of tree
		set.add(76); set.add(65);
		System.out.println("Tree is : " + set + " with size = " + set.size());

	}
}