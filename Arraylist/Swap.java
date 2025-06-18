import java.util.*;

class Swap{

	public static int swap(ArrayList<Integer> list, int idx1, int idx2){
		int temp;
		temp = list.get(idx1);
		list.set(idx1, list.get(idx2));
		list.set(idx2, temp);

		return temp;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		
		System.out.println("Enter elements of the list : ");
		for(int i = 0; i < 5; i++){
			int n = sc.nextInt();
			list.add(n);
		}
		System.out.println("Before swapping : " + list);
		System.out.println("Enter 1st and 2nd index to swap : ");
		int n = sc.nextInt();
		int m = sc.nextInt();
		swap(list, n, m);
		System.out.println("After swapping : " + list);
	}
}