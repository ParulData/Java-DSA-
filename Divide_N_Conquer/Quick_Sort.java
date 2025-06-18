import java.util.*;

class Quick_Sort{

	public static void quickSort(int arr[], int si, int ei){
		if(si >= ei){
			return;
		}

		// last element
		int pIdx = partition(arr, si, ei);
		quickSort(arr, si, pIdx-1);  // left
		quickSort(arr, pIdx+1, ei);  // right
	}

	public static int partition(int arr[], int si, int ei){
		int pivot = arr[ei];
		int i = si-1; // to make place for elements smaller than pivot

		for(int j = si; j < ei; j++){
			if(arr[j] <= pivot){
				i++;

				//swap
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
		i++;
		int temp = pivot;
		arr[ei] = arr[i]; 
		arr[i] = temp;

		return i;      // correct index of pivot 
	}

	public static void printarray(int arr[]){
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
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
		System.out.println("Initial array is : ");
		printarray(arr);
		System.out.println("Sorted array is : ");
		quickSort(arr, 0, n-1);
		printarray(arr);
	}
}