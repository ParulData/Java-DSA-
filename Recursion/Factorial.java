import java.util.*;

class Factorial{

	public static int factorial(int n){
		if(n == 0){    // base case 0! = 1
			return 1;
		}

		int fnm1 = factorial(n-1);  // recursive call 
		int fn = n * fnm1;

		return fn;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		System.out.println("Factorial of " + n + " : " + factorial(n));
	}
}