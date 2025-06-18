import java.util.*;

class OperationsOnArrayList{
	public static void main(String[] args){
		
		ArrayList<Integer> list1 = new ArrayList<>();
		// adding elements to the list.
		list1.add(21);
		list1.add(19);
		list1.add(51);
		list1.add(40);
		list1.add(12);
		System.out.println("Initial list is : " + list1);
		// geting element from the list
		int element = list1.get(3);
		System.out.println("Element at index 3 is : " + element);
		// removing an element from the list
		list1.remove(2);
		System.out.println("After removing element at index 2 : " + list1);
		// set element at a given index
		list1.set(2, 10);
		System.out.println("After adding 10 at index 2 : " + list1);
		// contains element - checks whether a given element is present in the list or not.
		System.out.println(list1.contains(20));
		System.out.println(list1.contains(12));

	}
}