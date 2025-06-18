/*
 QUESTION : You are given a number (eg 2019), convert it into a string of English like "two zero one nine". Use a recursive function to solve this 
 			problem. 
 			NOTE : The digits of the number will only be in the range 0 - 9 and the last digit of a number can not be 0.

*/


import java.util.*;

class Q_2{
	static String digits[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

	public static void printDigits(int n){
		if(n == 0){
			return;
		}
		int lastDigit = n % 10;
		printDigits(n / 10);
		System.out.print(digits[lastDigit] + " ");
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		printDigits(n);
	}
}