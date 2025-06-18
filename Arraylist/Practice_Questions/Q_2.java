/*

Question 2 :
Lonely Numbers in ArrayList(MEDIUM)

	You are given an integer arraylist nums. A number x is lonely when it appears only once, and no adjacent numbers 
	(i.e. x + 1 and x - 1) appear in the arraylist.
	
	Return all lonely numbers in nums. You may return the answer in any order.

	SAMPLE INPUT/ OUTPUT: 
	Sample Input 1: nums = [10,6,5,8]
	Sample Output 1: [10,8]

	Explanation :
	- 10 is a lonely number since it appears exactly once and 9 and 11 does not appear in nums.
	- 8 is a lonely number since it appears exactly once and 7 and 9 does not appear in nums.
	- 5 is not a lonely number since 6 appears in nums and vice versa.

*/


import java.util.*;

class Q_2{
	public static ArrayList<Integer> lonely(ArrayList<Integer> nums){
		Collections.sort(nums);
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 1; i < nums.size()-1; i++){
			if(nums.get(i-1) + 1 < nums.get(i) && nums.get(i) + 1 < nums.get(i+1)){
				list.add(nums.get(i));
			}
		}
		if(nums.size() == 1){
			list.add(nums.get(0));
		}
		if(nums.size() > 1){
			if(nums.get(0) + 1 < nums.get(1)){
				list.add(nums.get(0));
			}
			if(nums.get(nums.size()-2) + 1 < nums.get(nums.size()-1)){
				list.add(nums.get(nums.size()-1));
			}
		}
		return list;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> nums = new ArrayList<>();
		System.out.println("Enter size : ");
		int size = sc.nextInt();
		System.out.println("Enter the elements : ");
		for(int i = 0; i < size; i++){
			int n = sc.nextInt();
			nums.add(n);
		}
		System.out.println("Lonely numbers are : "+ lonely(nums));
	}
}