import java.util.*;

class Hashmap_01{
	public static void main(String[] args){
		HashMap<Integer, String> EmpData = new HashMap<>();
		//Insertion
		EmpData.put(1, "Ankush"); 
		EmpData.put(2, "Riya");
		EmpData.put(3, "Aditya");
		EmpData.put(4, "Bhavya");
		EmpData.put(5, "Hritik");


		System.out.println("Initially : \n" + EmpData);

		// Update data of 2nd employee
		EmpData.computeIfPresent(3, )
		System.out.println("Updating : \n" + EmpData);

		// remove third employee
		EmpData.remove(3);
		System.out.println("On removing : \n" + EmpData);

		// Searchin
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee number to search : ");
		int n = sc.nextInt();
		if(EmpData.contains(n)){
			System.out.println("Key is present!");
		}
		else{
			System.out.println("Key not present!");
		}

	}
}