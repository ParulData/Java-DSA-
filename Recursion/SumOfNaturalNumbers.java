import java.util.*;

class SumOfNaturalNumbers{
	public static int sum(int n){
		if(n == 1){
			return 1;
		}
		int snm1, sn;
		snm1 = sum(n-1);
		sn = n + snm1;
		return sn;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n : ");
		int n = sc.nextInt();
		System.out.println("Sum of natural numbers upto " + n + " : " + sum(n));
	}
}