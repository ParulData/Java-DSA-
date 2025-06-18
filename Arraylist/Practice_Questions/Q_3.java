/*

Most Frequent Number following Key(EASY)

	You are given an integer Arraylist nums. You are also given an integer key, which is present in nums. For every unique integer target in nums, 
	count the number of times target immediately follows an occurrence of key in nums. In other words, count the number of indices i such that:
	0 <= i <= nums.size() - 2, nums.get(i) == key and, nums.get(i+1) == target.
	Return the target with the maximum count.
	(Assumption- that the target with maximum count is unique.)

	Sample Input 1:nums = [1,100,200,1,100], key = 1
	Sample Output 1:  100
	Explanation :For target = 100, there are 2 occurrences at indices 1 and 4 which follow an occurrence of key.No other integers follow an 
	occurrence of key, so we return 100.
*/

import java.util.*;

class Q_3{

	public static int mostFrequent(ArrayList<Integer> nums, int key){
		int count[] = new int[1001];

		// building count array
		for(int i = 1; i < nums.size()-1; i++){
			if(nums.get(i-1) == key){
				count[nums.get(i)]++;
			}
		}
		// Finding the index with the greatest entry
		int maxIndex = 0;
		for(int i = 0; i < count.length; i++){
			maxIndex = count[i] > count[maxIndex] ? i : maxIndex; 
		}
		return maxIndex;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> nums = new ArrayList<>();
		System.out.println("Enter size : ");
		int size = sc.nextInt();
		System.out.println("Enter elements : ");
		for(int i = 0; i < size; i++){
			int e = sc.nextInt();
			nums.add(e);
		}
		System.out.println("Enter key : ");
		int k = sc.nextInt();
		int ans = mostFrequent(nums, k);
		System.out.println("Answer is : " + ans);
	}
}