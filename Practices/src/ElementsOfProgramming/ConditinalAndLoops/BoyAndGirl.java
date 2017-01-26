package ElementsOfProgramming.ConditinalAndLoops;

public class BoyAndGirl {

	public static void main(String[] args) {
		// Why I prefer boolean towards int here?
		// first reason, a boolean number can represent the two gender as: true = male, false = female
		// also, a boolean variable is only 1 bit, but an int variable is 32 bits.
		// You can tell, using boolean can significantly save our memory by 32 times towards int
		// The issue is, I don't really need the gender array.
		/*boolean gender[] = new boolean[100];*/ 
		int children[] = new int[100]; //Give it a better name that makes sense : )
		for (int i = 0; i < 100; i++) {
			boolean hasGirl = false;
			boolean hasBoy = false;
			children[i] = 0;
			while (!hasGirl || !hasBoy) { // This is a good place to use while loop instead of for loop
				children[i]++;
				boolean gender = Math.random() >= 0.5; 
				if (gender) hasBoy = true;
				else hasGirl = true;
			}
		}
		double sum = 0; //nums2 isn't a good name, call it sum
		for (int i = 0; i < 100; i++) {
			sum += children[i];			
		}
			
			//It's OK to use 'i' instead of 'j' or 'k' here. Don't worry about declaration twice here.
									  // As you see, in line 13, I declare the int i inside the for loop. which means
								      // It will no longer exist out side of for loop. So here, you're free to use 
									  // 'i' as a variable name.
		
		double average = sum / 100; // Please notice we can't have 2.87 children. We need to round it.
		int averageChildren = (int) Math.round(average);
		System.out.println("The average number of children is: " + averageChildren);
		
		//How to calculate frequency? if we're not doing any sorting here?
		//It's a way we called bucket. 
		// We calculate the max number, and declare an array whose length is the maxnumber (actually, max number + 1) 
		// considering the 0-based issue. And then, grap the value and put them into the bucket.
		// talk is cheap, show you the code
		
		int max = 0; // We don't need Integer.MIN_VALUE here, because we know that the min number must be 0. 
		             // But usually, you used Integer.MIN_VALUE for min and Integer.MAX_VALUE for max when you 
		             // initialize it.
		for (int i = 0; i < 100; i++) {
			max = Math.max(max, children[i]);
		}
		
		int[] buckets = new int[max + 1];
		for (int i = 0; i < children.length; i++) { // For an array, if you call array.length, you will get the length of it.
												// A very significant point is, for array, you use array.length
												// but for String, you use string.length()   see the parenthesis?
			int value = children[i];
			buckets[value]++;
		}
		
		int mostFrequent = 0; // Consider question, why here, mostFrequent is an index of array rather than value of array
		for (int i = 0; i < buckets.length; i++) {
			if (buckets[i] > buckets[mostFrequent]) {
				mostFrequent = i;
			}
		}
		
		System.out.println("The most frequent children number is: " + mostFrequent);
		
	}

}
