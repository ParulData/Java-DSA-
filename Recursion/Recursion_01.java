import java.util.*;

public class Recursion_01{

	public static void printDecreasing(int n){
		if(n == 1){    // base case
			System.out.println(n);
			return;
		}
		System.out.print(n + " ");
		printDecreasing(n-1);  // calling the same function 
	}

	public static void printInc(int n){
		if(n == 1){
			System.out.print(n + " ");
			return;
		}
		printInc(n-1);
		System.out.print(n + " ");
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n : ");
		int n = sc.nextInt();
		System.out.println("Numbers in decreasing order are : ");
		printDecreasing(n);
		System.out.println("Numbers in increasing order are : ");
		printInc(n);
	}
}