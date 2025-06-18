import java.util.*;

class List_01{
	public static void main(String[] args){
		ArrayList<String> list = new ArrayList<>();
		list.add("Red"); list.add("Green"); list.add("Blue");
		System.out.println("List is : " +list);

		list.add(2, "Brown");
		System.out.println("List is : " +list);

		list.removeAll(list);
		System.out.println("List is : " +list + " (empty!!)");



	}
}