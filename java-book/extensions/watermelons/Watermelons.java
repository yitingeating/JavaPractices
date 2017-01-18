package watermelons;
import java.util.*;

public class Watermelons {
	
	/**
	 * Computes the sum of each distinct pair of entries in the incoming array.
	 * A given pair of entries has its sum computed only once.  So if you
	 * compute the sum for entries 2 and 4, and that sum appears in your answer
	 * array, then you do not also compute the sum of entries 4 and 2.
	 * Depending on the input, the same sum value may appear multiple times in the result.
	 * For example, if all of the incoming values are 0, then so are all of the returned values.
	 * @param nums an array of integers, possibly containing duplicates
	 * @return an array containing the sums of pairs as described above
	 */
	
	/*public static void main(String args[]){
		int[] ans=getSolution();
		for(int i=0;i<5;i++)
			System.out.println(ans[i]);
	}*/
	
	public static int[] allPairSums(int[] nums) {
		int length=nums.length;
		
		int[] ans = new int[length*(length-1)/2 ];  // FIXME compute ans as the result you want
		int k=0;
		for(int i=0;i<length-1;i++)
			for(int j=i+1;j<length;j++)
			{
				ans[k]=nums[i]+nums[j];
				k++;
			}
				
		return ans;
	}
	
	/**
	 * The method below must COMPUTE and return a solution to the puzzle posted
	 * on the page that describes this extension.  You must compute the solution by trying
	 * lots of possibilities, and finding the one that yields the right answer.
	 * You can run the unit test testPuzzleSolution to see if you are right.
	 * @return
	 */
	public static int[] getSolution() {
		int []sum=new int[]{20,22,23,24,25,26,27,28,30,31};
		int []ans=new int[5];
		//the largest weight must be equal or larger than 16
		// the smallest one must be equal or smaller than 9 (there's no same number, so cannot be 10
		//20 and 31 must be obtained by the smallest two and largest two
		for(int smallNum=9;smallNum>=0;smallNum--)
			for(int largeNum=16;largeNum<=31;largeNum++)
			{
				int secondSmall=20-smallNum;
				int secondLarge=31-largeNum;
				if(secondSmall<secondLarge)
				{
					for(int midNum=secondSmall;midNum<=secondLarge;midNum++)
					{
						int []solution=new int[]{smallNum,secondSmall,midNum,secondLarge,largeNum};
						int []checkSum=allPairSums(solution);
						Arrays.sort(checkSum);
						if(Arrays.equals(sum,checkSum))
							ans=solution;
					}
				}
				
			}
		return ans;	
	}

}
