//Shiyao Liu, ID:437742
package lab9;


public class ListItem {
	//
	// Important:  Do NOT make these instance variables private
	// Our testing needs to be able to access them, so leave their
	//   declarations as you see them below.
	//
	final int number;
	ListItem next;

	/**
	 * Creates a single list item.
	 * @param number the value to be held in the item
	 * @param next a reference to the next item in the list
	 */
	ListItem(int number, ListItem next) {
		this.number = number;
		this.next   = next;
	}

	/**
	 * Return a copy of this list using recursion.  No
	 * credit if you use any iteration!  All existing lists should remain
	 * intact -- this method must not mutate anything.
	 * @return
	 */
	public ListItem duplicate() {	
		if(this.next==null){
			ListItem newListItem=new ListItem(this.number,null);
			return newListItem;
		}
		else{
			ListItem newListItem=new ListItem(this.number,this.next.duplicate());
			return newListItem;
		}	
	}

	/**
	 * Recursively compute the number of elements in the list. No
	 * credit if you use any iteration!  All existing lists should remain
	 * intact.
	 * @return
	 */
	public int length() {
		int length=1;
		if(this.next==null){
			length=1;
		}
		else{
			length+=this.next.length();
		}
		return length;
	}

	/**
	 * Return a new list, like duplicate(), but every element
	 * appears n times instead of once.  See the web page for details.
	 * You must do this method iteratively.  No credit
	 * if you use any recursion!
	 * @param n a positive (never 0) number specifying how many times to copy each element
	 * @return
	 */

	public ListItem stretch(int n) {
		int []numberList=new int[this.length()];
		ListItem traverse=this.duplicate();
		for(int i=0;i<this.length();i++){
			numberList[i]=traverse.number;
			if(i!=this.length()-1)
				traverse=traverse.next;
		}
		//above is for storing all values into an array

		ListItem [][]result=new ListItem[n][this.length()];
		for(int j=0;j<this.length();j++)
		{System.out.println();
		for(int i=0;i<n;i++)
		{	result[i][j]=new ListItem(numberList[j],null);
		System.out.print(result[i][j].number+" ");
		}
		}
		// above is creating a 2-dimensional arrays and initiate
		for(int j=0;j<this.length();j++){
			for(int i=0;i<n;i++){
				if(i!=n-1)
					result[i][j].next=result[i+1][j];
				if(i==n-1&&j!=this.length()-1)
					result[i][j].next=result[0][j+1];
				if(i==n-1&&j==this.length()-1)
					result[i][j].next=null;
			}
		}
		return result[0][0];  // FIXME
	}

	/**
	 * Return the first ListItem, looking from "this" forward,
	 * that contains the specified number.  No lists should be
	 * modified as a result of this call.  You may do this recursively
	 * or iteratively, as you like.
	 * @param n
	 * @return
	 */

	public ListItem find(int n){
		ListItem traverse=this.duplicate();
		for(int i=0;i<this.length();i++){
			if(traverse.number==n)
				return traverse;
			else if(i!=this.length()-1)
				traverse=traverse.next;
		}
		return null;
	}

	/**
	 * Return the maximum number contained in the list
	 * from this point forward.  No lists should be modified
	 * as a result of this call.  You may do this method recursively
	 * or iteratively,as you like.
	 * @return
	 */

	public int max() {
		int []numberList=new int[this.length()];
		ListItem traverse=this.duplicate();
		for(int i=0;i<this.length();i++){
			numberList[i]=traverse.number;
			if(i!=this.length()-1)
				traverse=traverse.next;
		}
		// above is obtain all possible values
		int max=this.number;
		for(int i=0;i<this.length();i++){
			if(numberList[i]>max)
				max=numberList[i];
		}
		return max;
	}

	/**
	 * Returns a copy of the list beginning at ls, but containing
	 * only elements that are even.
	 * @param ls
	 * @return
	 */
	public static ListItem evenElements(ListItem ls) {
		if(ls==null){
			return null;
		}
		if(ls.number%2!=0){
			return evenElements(ls.next);
		}
		else{
			ListItem newListItem=new ListItem(ls.number, evenElements(ls.next));
			return newListItem;
		}

	}	


	/**
	 * Returns a string representation of the values reachable from
	 * this list item.  Values appear in the same order as the occur in
	 * the linked structure.  Leave this method alone so our testing will work
	 * properly.
	 */
	public String toString() {
		if (next == null)
			return ("" + number);
		else
			return (number + " " + next); // calls next.toString() implicitly
	}

}
