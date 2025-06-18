import java.util.*;

class Power{
	public static int power(int x, int n){  // O(n) worst case 
		if(n == 0){
			return 1;
		}
		return x * power(x, n-1);
	}

	public static int optimizedPower(int x, int n){  // O(logn)  
		if(n == 0){  
			return 1;
		}
		int halfPower = optimizedPower(x, n/2);
		int halfPowerSq = halfPower * halfPower;

		// if n is odd

		if(n % 2 != 0) {
			halfPowerSq = x * halfPowerSq;
		}
		return halfPowerSq;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value x and n : ");
		int x = sc.nextInt();
		int n = sc.nextInt();

		System.out.println("\n" + x + "^" + n + " = " + power(x, n));
		System.out.println("\n" + x + "^" + n + " = " + optimizedPower(x, n));
	}
}