/* 

	TOWER OF HANOI

*/

import java.util.*;

class Q_5{
	public static void towerOfHanoi(int n, String src, String helper, String dest){
		if(n == 1){
			System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
			return;
		}

		// transfer top n-1 from source to helper using destination tower as 'helper'
		towerOfHanoi(n-1, src, dest, helper);
		// transfer nth disk from source to destination 
		System.out.println("Transfer disk " + n + " from " + src + " to " + helper);  
		// transfer n-1 disks in helper tower to destination tower using source tower as 'helper'
		towerOfHanoi(n-1, helper, src, dest);
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of disks : ");
		int n = sc.nextInt();
		towerOfHanoi(n, "A", "B", "C");
	}
}
