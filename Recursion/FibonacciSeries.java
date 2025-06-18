import java.util.*;

class FibonacciSeries{
	public static int fib(int n){
		if(n == 0){  // base case
			return 0;
		}
		if(n == 1){   // base case
			return 1;
		}

		int fnm1, fnm2, fn;  // fnm1 and fnm2 are (n-1)th and (n-2)th terms in the fibonacci series.
		fnm1 = fib(n-1);
		fnm2 = fib(n-2);
		fn = fnm1 + fnm2;
		return fn;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the position of the number to be searched : ");
		int n = sc.nextInt();
		System.out.println(n + "th term in the fibonacci series is : " + fib(n));
	}
}