import java.util.ArrayList;


public class MaxsubArray {
	public static ArrayList<Integer> MaxsubarrayLSum(int[] array,int first,int q){
		int Lmax = array[q];
		ArrayList<Integer> Lresult = new ArrayList<>();
		int Lsum = array[q];
		int Lsum_index = q;
		for(int j = q-1; j <= first; j--){
			Lmax = Lmax + array[j];
			if(Lmax > Lsum){
				Lsum = Lmax;
				Lsum_index = j;
			}
		}
		Lresult.add(Lsum_index);
		Lresult.add(q);
		Lresult.add(Lsum);
		return Lresult;
	}
	public static ArrayList<Integer> MaxsubarrayRSum (int[] array,int first,int last){
		ArrayList<Integer> Rresult = new ArrayList<>();
		int Rmax = array[first];
		int Rsum = array[first];
		int Rsum_index = first;
		for(int j = first+1; j <= last; j++){
			Rmax = Rmax + array[j];
			if(Rmax > Rsum){
				Rsum = Rmax;
				Rsum_index = j;
			}
		}
		Rresult.add(Rsum_index);
		Rresult.add(first);
		Rresult.add(Rsum);
		return Rresult;
	}
	
	public static ArrayList<Integer> MaxsubarraySum(int[] array,int first, int last){
		ArrayList<Integer> result = new ArrayList<>(); 
		ArrayList<Integer> leftsum = new ArrayList<>(); 
		ArrayList<Integer> rightsum = new ArrayList<>(); 
		if (first == last){
			result.add(first);
			result.add(last);
			int sum=0;
			for(int i=first;i<=last;i++){
				sum+=array[i];
			}
			result.add(sum);
		}
		int q = (first+last)/2;
		leftsum = MaxsubarrayLSum(array, first, q);
		int ls = leftsum.get(2);
		rightsum = MaxsubarrayRSum(array, q+1, last);
		int rs = rightsum.get(2);
		int final_sum = ls+rs;
		if(ls > Math.max(final_sum, rs)){
			return leftsum;
		}
		else if (rs > Math.max(final_sum, ls)){
			return rightsum;
		}
		else 
			result.add(leftsum.get(0));
			result.add(rightsum.get(1));
			result.add(final_sum);			
		return result;
	}
	
	public static void main(String[] args){
		ArrayList<Integer> printresult = new ArrayList<>();
		//int j;
		//System.out.println("Max Sub-array Problem");
		//System.out.println("Enter Length array to find sum :");
		/*Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int[] array = new int[length];*/
		int[] array = {-4, 3, -2, 6, -4, 8, -12, 1, -4, 5};
		/*for( j = 0; j < array.length; j++){
			array[j] = sc.nextInt();
		}*/
		printresult = MaxsubarraySum(array, 0, array.length-1);
		System.out.println("max sub array sum is :" +printresult);
	}
}
