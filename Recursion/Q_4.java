/*
  QUESTION : You are given a string S, find the count of all contiguous substrings starting and ending with the same character.

  SAMPLE INPUT : abcab
  SAMPLE OUTPUT : 7

  EXPLANATION : There are 15 substrings of "abcab" : a, ab, abc, abca, abcab, b, bc, bca, bcab, c, ca, cab, a, ab, b
  				Out of the above substrings, there are 7 substrings : a, abca, b, bcab, c, a and b. So, only 7 contiguous substrings start and end 
  				with the same character.

*/

import java.util.*;

class Q_4{
	public static int countSubStrs(String str, int i, int j, int n){
		if(n == 1){
			return 1;
		}
		if(n <= 0){
			return 0;
		}

		int ans = countSubStrs(str, i + 1, j, n - 1) + countSubStrs(str, i, j - 1, n -1 ) - countSubStrs(str, i + 1, j - 1, n - 2);

		if(str.charAt(i) == str.charAt(j)){
			ans++;
		}

		return ans;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string : ");
		String str = sc.next();
		int n = str.length();
		System.out.println("NUmber of substrings starting and ending with the same character : "+ countSubStrs(str, 0, n - 1, n));
	}
}