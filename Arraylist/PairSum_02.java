// QUESTION ---
//Find if any pair in a SORTED & ROTATED ArrayList has a TARGET sum.


import java.util.*;

class PairSum_02{
	public static boolean pairSum(ArrayList<Integer> list, int target){
		int bp = -1;
		int n = list.size();
		for(int i = 0; i < list.size(); i++){
			if(list.get(i) > list.get(i+1)){
				bp = i;
				break;
			}
		}
		int lp = bp + 1;  // smallest element
		int rp = bp;   // largest element

		while(lp != rp){
			if(list.get(lp) + list.get(rp) == target){
				return true;
			}
			else if(list.get(lp) + list.get(rp) < target){
				lp = (lp+1) % n; 
			}
			else{
				rp = (n+rp-1) % n;
			}
		}
		return false;
	}

	public static void main(String [] args){
		ArrayList<Integer> list = new ArrayList<>();
		list.add(11);
		list.add(15);      // the list is rotated around 10
		list.add(6);      // the breaking point is 15 (less than condition not satisfied)
		list.add(8);
		list.add(9);
		list.add(10);
		int target = 16;
		System.out.println(pairSum(list, target));
	}
}