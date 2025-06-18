import java.util.*;

class Occurence{
	public static int firstOccurence(int arr[], int key, int i){
		if(i == arr.length){   // base case
			return -1;
		}
		if(arr[i] == key){
			return i;
		}
		return firstOccurence(arr, key, i+1);
	}

	public static int lastOccurence(int arr[], int key, int i){
		if(i == arr.length){  // base case
			return -1;
		}

		int isFound = lastOccurence(arr, key, i+1);
		if(isFound == -1 && arr[i] == key){
			return i;
		}
		return isFound;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter array elements : ");
		for(int i = 0; i < size; i++){
			arr[i] = sc.nextInt();
		}

		System.out.println("Array is : ");
		for(int i = 0; i < size; i++){
			System.out.print(arr[i] + " ");
		}

		System.out.println("\nEnter key element : ");
		int key = sc.nextInt();
		System.out.println("\nThe first occuring index for key = " + key + " is : " + firstOccurence(arr, key, 0));
		System.out.println("The last occuring index for key = " + key + " is : " + lastOccurence(arr, key, 0));
	}
}