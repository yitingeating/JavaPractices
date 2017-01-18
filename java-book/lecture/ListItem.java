
public class ListItem {

	public int number;
	public ListItem next;
	public ListItem(int x, ListItem p) {
		number = x;
		next = p;
	}
	
	
	public String toString() {
		if(next == null) {
			return number+" ";
		} else {
			return number + " " + next.toString();
		}
	}
	
	
}
