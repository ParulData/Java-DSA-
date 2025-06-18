import java.util.*;

class ContainerWithMostWater{
	public static int storeWater(ArrayList<Integer> height){
		int maxWater = 0;
		int lp = 0;
		int rp = height.size()-1;

		while(lp < rp){
			// Calculate area of the water
			int ht = Math.min(height.get(lp), height.get(rp));
			int width = rp - lp;
			int currWater = ht * width;
			maxWater = Math.max(maxWater, currWater);
			// Update pointers
			if(height.get(lp) < height.get(rp)){
				lp++;
			}
			else{
				rp--;
			}
		}
		return maxWater;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> height = new ArrayList<>();
		System.out.println("Enter heights : ");
		for(int i = 0; i < 6; i++){
			int n = sc.nextInt();
			height.add(n);
		}
		System.out.println("Heights are : " + height);
		System.out.println("Maximum area of the container that can store maximum water : " + storeWater(height));
	}
}