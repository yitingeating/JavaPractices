
public class myLinkedList {

	
	public ListItem head;
	public int size;
	
	public myLinkedList() {
		head = null;
		size = 0;
	}
	
	public void addFirst(int x) {
		head = new ListItem(x, head);
		size++;
	}
	
	public void addLast(int x) {
		if(head == null) {
			addFirst(x);
		} else {
			ListItem p = head;
			while(p.next!=null) {
				p= p.next;
			}
			p.next = new ListItem(x, null);
			size++;
		}
	}
	
	
	public void remove(int x) {
		if(head == null) return;
		if(head.number == x) {
			head = head.next; size--; return;
		}
		ListItem p = head;
		while(p.next!=null) {
			if(p.next.number == x) {
				p.next = p.next.next;
				size--;
				return;
			}
			p = p.next;
		}
	}
	
	public int indexOf(int x) {
	
		int i =0;
		ListItem p = head;
		while(p!=null) {
			if(p.number == x) return i;
			i++;
			p=p.next;
		}
		return -1;
	}
	
	public String toString() {
		return "size = "+size+". List = "+head.toString();
	}
	
	public static void main(String[] args) {
		
		myLinkedList list = new myLinkedList();
		

		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.remove(50);
		
		System.out.println(list);
		
	}

}
