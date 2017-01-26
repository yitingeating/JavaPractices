package ElementsOfProgramming.ConditinalAndLoops;

public class MedianLessThan6 {

	public static void main(String[] args) {
		//Do a check first if the arguments are valid
		if (args.length < 5) {
			System.out.println("Arguments not valid, quit");
			return; //end the process of a void method
		}
		
		int[] nums = new int[5];
		for (int i = 0; i < 5; i++) {
			nums[i] = Integer.parseInt(args[i]); // Integer.parseInt和Integer.valueOf 本质上一样
		}
		
		//举例: 53421
		//对第一个数和第2个数排序，找到最小的数
		// smallest1 = 1
		int smallest1;
		int biggest1;
		if (nums[0] < nums[1]) {
			smallest1 = nums[0];
			biggest1 = nums[1];
		} else {
			smallest1 = nums[1];
			biggest1 = nums[0];
		}
		//对第三个数和第四个数排序，找到最小的数
		// smallest2 = 2;
		int smallest2;
		int biggest2;
		if (nums[2] < nums[3]) {
			smallest2 = nums[2];
			biggest2 = nums[3];
		} else {
			smallest2 = nums[3];
			biggest2 = nums[2];
		}
		
		//至此为止，我们知道了左边四个数中最小的两个数，还有第五个数我们不知道。
		//换句话说，目前为止，smallest1和smallest2一定有一个肯定不是中位数。
		//这个数就是二者中小的那个数.因为它也许是 smallest1, smallest2, nums[4]中最小的数，也就是5个数中最小的数
		//也可能是五个数中第二小的数，这种情况下nums[4]是最小的.
		//无论如何，我们要找的是第三小的数，最小和第二小都要被淘汰
		int possibleBiggest3;
		if (smallest1 < smallest2) {
			possibleBiggest3 = smallest2;
		} else {
			possibleBiggest3 = smallest1;
		}
		
		//留下的那一个继续和nums[4]比，再淘汰掉一个数.
		int biggest3;
		if (possibleBiggest3 < nums[4]) {
			biggest3 = nums[4];
		} else {
			biggest3 = possibleBiggest3;
		}
		//至此为止，我们淘汰了两个最小的数
		//还剩三个数，我们总共用了4次比较，剩下的任务就是在biggest1, biggest2, biggest3中找到最小的数。
		
		int median;
		if (biggest1 < biggest2) {
			median = biggest1;
		} else {
			median = biggest2;
		}
		
		if (median > biggest3) {
			median = biggest3;
		}
		
		System.out.println(median);
		
		
/*		int a = 3,b = 1,c = 5,d = 9,e = 0,f = 0;
		if(a < b)
		{   //这样是做不到swap的
			f = b;
			b = a;
			a = f;
		}
	    if(c < d)
	    {
			f = d;
			d = c;
			c = f;
		}
	    if(a < c)
	    {
	    	f = c;
	    	c = a;
	    	a = f;
	    }
	    f = b;
		b = c;
		c = f;
	    if(d < e)
	    {
	    	f = e;
	    	e = d;
	    	d = f;
	    }
	    	
	    if(b < d)
	    {
	    	f = d;
	    	d = b;
	    	b = f;
	    }
	    if(e < d) 
	    System.out.print(d);  
	    else  System.out.print(e);  
					
			
		
		
		// TODO Auto-generated method stub
*/
	}

}
