/*

Question 1 :
Monotonic ArrayList(EASY)

	An Arraylist is monotonic if it is either monotone increasing or monotone decreasing.
	An Arraylist nums is monotone increasing if for all i <= j, nums.get(i) <= nums.get(j).
	An Arraylist nums is monotone decreasing if for all i <= j, nums.get(i) >= nums.get(j).

	Given an integer Arraylist nums, return true if the given list is monotonic, or false otherwise.
*/

import java.util.*;

class Q_1{

	public static boolean monotone(ArrayList<Integer> nums){
		boolean inc = true;
		boolean dec = true;
		for(int i = 0; i < nums.size()-1; i++){
			if(nums.get(i) > nums.get(i+1)){
				inc = false;
			}
			if(nums.get(i) < nums.get(i+1)){
				dec = false;
			}
		}
		if(inc != true && dec != true){
			System.out.println("The list is not monotone increasing and decreasing!");
		}
		else{
			System.out.println("The list is monotone increasing or decreasing.");
		}
		
		return inc || dec;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> nums = new ArrayList<>();
		System.out.println("Enter the elements : ");
		for(int i = 0; i < 3; i++){
			int n = sc.nextInt();
			nums.add(n);
		}
		System.out.println("The list is monotone : "+ monotone(nums));
	}
}