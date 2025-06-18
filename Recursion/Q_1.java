import java.util.*;

class Q_1{
	public static void allOccurences(int arr[], int key, int i){
		// base case
		if(i == arr.length){
			return;
		}

		if(arr[i] == key){
			System.out.print(i + " ");
		}
		allOccurences(arr, key, i+1);
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter array elements : ");
		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Array is : ");
		for(int i = 0; i < n; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		System.out.println("Enter key element : ");
		int k = sc.nextInt();
		System.out.println("Index values at which key occurs : ");
		allOccurences(arr, k, 0);
	}
}