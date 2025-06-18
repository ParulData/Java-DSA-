import java.util.*;

class Sorting{
	public static void main(String[] args){
		ArrayList<Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the list : ");
		int s = sc.nextInt();
		System.out.println("Enter list items : ");
		for(int i = 0; i < s; i++){
			int n = sc.nextInt();
			list.add(n);
		}
		System.out.println("List is : " + list); 
		Collections.sort(list);                        // Ascending order
		System.out.println("Sorted in ascending order : " + list);
		Collections.sort(list, Collections.reverseOrder());        // Descending order
		System.out.println("Sorted in descending order : " + list);


	}
}